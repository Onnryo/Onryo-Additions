package net.onryo.additions.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.onryo.additions.OnryoAdditionsMod;
import net.onryo.additions.block.ModBlocks;
import net.onryo.additions.item.custom.*;

public class ModItems {

    public static final Item ORICHALCUM_INGOT = registerItem("orichalcum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP)));
    public static final Item ORICHALCUM_NUGGET = registerItem("orichalcum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP)));
    public static final Item RAW_ORICHALCUM = registerItem("raw_orichalcum",
            new Item(new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP)));
    public static final Item COAL_SLIVER = registerItem("coal_sliver",
            new Item(new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP)));

    public static final Item STRAWBERRIES = registerItem("strawberries",
            new AliasedBlockItem(ModBlocks.STRAWBERRY_BUSH,
                    new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP).food(ModFoodComponents.STRAWBERRIES)));
    public static final Item BLUEBERRIES = registerItem("blueberries",
            new AliasedBlockItem(ModBlocks.BLUEBERRY_BUSH,
                    new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP).food(ModFoodComponents.BLUEBERRIES)));
    public static final Item CUCUMBER = registerItem("cucumber",
            new AliasedBlockItem(ModBlocks.CUCUMBER_CROP,
                    new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP).food(ModFoodComponents.CUCUMBERS)));
    public static final Item PICKLE = registerItem("pickle",
            new PickleItem(new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP).food(ModFoodComponents.PICKLES)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP).maxDamage(64)));
    public static final Item DATA_TABLET = registerItem("data_tablet",
            new DataTabletItem(new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP).maxCount(1)));

    public static final Item ORICHALCUM_PICKAXE = registerItem("orichalcum_pickaxe",
            new ModPickaxeItem(ModToolMaterial.ORICHALCUM, 1, 2f,
                    new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP)));
    public static final Item ORICHALCUM_AXE = registerItem("orichalcum_axe",
            new ModAxeItem(ModToolMaterial.ORICHALCUM, 3, 1f,
                    new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP)));
    public static final Item ORICHALCUM_HOE = registerItem("orichalcum_hoe",
            new ModHoeItem(ModToolMaterial.ORICHALCUM, 0, 0f,
                    new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP)));
    public static final Item ORICHALCUM_SHOVEL = registerItem("orichalcum_shovel",
            new ShovelItem(ModToolMaterial.ORICHALCUM, 1, 2f,
                    new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP)));
    public static final Item ORICHALCUM_SWORD = registerItem("orichalcum_sword",
            new ModSlowingSwordItem(ModToolMaterial.ORICHALCUM, 3, 3f,
                    new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP)));
    public static final Item ORICHALCUM_PAXEL = registerItem("orichalcum_paxel",
            new ModPaxelItem(ModToolMaterial.ORICHALCUM, 1, 1f,
                    new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP)));

    public static final Item ORICHALCUM_HELMET = registerItem("orichalcum_helmet",
            new ModArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP)));
    public static final Item ORICHALCUM_CHESTPLATE = registerItem("orichalcum_chestplate",
            new ArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP)));
    public static final Item ORICHALCUM_LEGGINGS = registerItem("orichalcum_leggings",
            new ArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP)));
    public static final Item ORICHALCUM_BOOTS = registerItem("orichalcum_boots",
            new ArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.ADDITIONS_GROUP)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OnryoAdditionsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + OnryoAdditionsMod.MOD_ID);
    }
}
