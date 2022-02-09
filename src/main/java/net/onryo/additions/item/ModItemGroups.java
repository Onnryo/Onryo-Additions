package net.onryo.additions.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.onryo.additions.OnryoAdditionsMod;

public class ModItemGroups {
    public static final ItemGroup ADDITIONS_GROUP = FabricItemGroupBuilder.build(new Identifier(OnryoAdditionsMod.MOD_ID, "additions"),
            () -> new ItemStack(ModItems.ORICHALCUM_INGOT));
}
