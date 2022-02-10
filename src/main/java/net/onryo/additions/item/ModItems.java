package net.onryo.additions.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.onryo.additions.OnryoAdditionsMod;
import net.onryo.additions.block.ModBlocks;
import net.onryo.additions.item.custom.DowsingRodItem;

public class ModItems {

    public static final Item ORICHALCUM_INGOT = registerItem("orichalcum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP)));

    public static final Item ORICHALCUM_NUGGET = registerItem("orichalcum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP)));

    public static final Item RAW_ORICHALCUM = registerItem("raw_orichalcum",
            new Item(new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP).maxDamage(64)));

    public static final Item STRAWBERRIES = registerItem("strawberries",
            new AliasedBlockItem(ModBlocks.STRAWBERRY_BUSH, new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP).food(ModFoodComponents.STRAWBERRIES)));

    public static final Item BLUEBERRIES = registerItem("blueberries",
            new AliasedBlockItem(ModBlocks.BLUEBERRY_BUSH, new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP).food(ModFoodComponents.BLUEBERRIES)));

    public static final Item COAL_SLIVER = registerItem("coal_sliver",
            new Item(new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OnryoAdditionsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + OnryoAdditionsMod.MOD_ID);
    }
}
