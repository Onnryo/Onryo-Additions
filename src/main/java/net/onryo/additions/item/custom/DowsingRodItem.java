package net.onryo.additions.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.onryo.additions.block.ModBlocks;
import net.onryo.additions.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DowsingRodItem extends Item {
    private enum Rarity {
        USELESS,
        USEFUL,
        VALUABLE,
        PRECIOUS
    }

    public DowsingRodItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient()) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;

            for(int i = 0; i <= positionClicked.getY(); i++) {
                Block blockBelow = context.getWorld().getBlockState(positionClicked.down(i)).getBlock();

                Rarity rarity = isValuableBlock(blockBelow);
                if(rarity == Rarity.USEFUL) {
                    //player.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.BLOCKS, 1f, 1f);
                    context.getWorld().playSound(null, positionClicked, SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.BLOCKS, 1f, 1f);
                    foundBlock = true;
                    break;
                } else if (rarity == Rarity.VALUABLE) {
                    //player.playSound(SoundEvents.ENTITY_PLAYER_LEVELUP, SoundCategory.BLOCKS, 1f, 1f);
                    context.getWorld().playSound(null, positionClicked, SoundEvents.ENTITY_PLAYER_LEVELUP, SoundCategory.BLOCKS, 1f, 1f);
                    foundBlock = true;
                    break;
                } else if (rarity == Rarity.PRECIOUS) {
                    //player.playSound(SoundEvents.BLOCK_BELL_USE, SoundCategory.BLOCKS, 1f, 1f);
                    context.getWorld().playSound(null, positionClicked, SoundEvents.BLOCK_BELL_USE, SoundCategory.BLOCKS, 1f, 1f);
                    foundBlock = true;
                    break;
                }
            }

            if (!foundBlock) {
                //player.playSound(SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 1f, 1f);
                context.getWorld().playSound(null, positionClicked, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 1f, 1f);
                player.sendMessage(new TranslatableText("item.onryo.dowsing_rod.failed"), false);
            }
        }

        context.getStack().damage(1, context.getPlayer(), (player) -> player.sendToolBreakStatus(player.getActiveHand()));
        return super.useOnBlock(context);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("item.onryo.dowsing_rod.tooltip.shift"));
        } else {
            tooltip.add(new TranslatableText("item.onryo.dowsing_rod.tooltip"));
        }
    }

    private Rarity isValuableBlock(Block block) {
        if(ModTags.Blocks.DOWSING_ROD_USEFUL_BLOCKS.contains(block))
            return Rarity.USEFUL;
        else if (ModTags.Blocks.DOWSING_ROD_VALUABLE_BLOCKS.contains(block))
            return Rarity.VALUABLE;
        else if (ModTags.Blocks.DOWSING_ROD_PRECIOUS_BLOCKS.contains(block))
            return Rarity.PRECIOUS;
        else
            return Rarity.USELESS;
    }
}
