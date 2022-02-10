package net.onryo.additions.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.onryo.additions.OnryoAdditionsMod;
import net.onryo.additions.block.custom.BlueberryBushBlock;
import net.onryo.additions.block.custom.StrawberryBushBlock;
import net.onryo.additions.block.custom.StrengthBlock;
import net.onryo.additions.item.ModItemGroups;
import net.onryo.additions.item.ModItems;

public class ModBlocks {

    public static final Block ORICHALCUM_BLOCK = registerBlock("orichalcum_block",
            new StrengthBlock(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroups.ADDITIONS_GROUP);

    public static final Block DEEPSLATE_ORICHALCUM_ORE = registerBlock("deepslate_orichalcum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroups.ADDITIONS_GROUP);

    public static final Block ORICHALCUM_ORE = registerBlock("orichalcum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ADDITIONS_GROUP);

    public static final Block RAW_ORICHALCUM_BLOCK = registerBlock("raw_orichalcum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5f).requiresTool()), ModItemGroups.ADDITIONS_GROUP);

    public static final Block STRAWBERRY_BUSH = registerBlock("strawberry_bush",
            new StrawberryBushBlock(FabricBlockSettings.of(Material.PLANT).nonOpaque().ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), null);

    public static final Block BLUEBERRY_BUSH = registerBlock("blueberry_bush",
            new BlueberryBushBlock(FabricBlockSettings.of(Material.PLANT).nonOpaque().ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), null);
    //public static final Block STRAWBERRY_BUSH = Registry.register(Registry.BLOCK, new Identifier(OnryoAdditionsMod.MOD_ID, "strawberry_bush"), new BerryBushBlock(ModItems.STRAWBERRIES));
    //public static final Block BLUEBERRY_BUSH = Registry.register(Registry.BLOCK, new Identifier(OnryoAdditionsMod.MOD_ID, "blueberry_bush"), new BerryBushBlock(ModItems.BLUEBERRIES));

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(OnryoAdditionsMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(OnryoAdditionsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for " + OnryoAdditionsMod.MOD_ID);
    }
}
