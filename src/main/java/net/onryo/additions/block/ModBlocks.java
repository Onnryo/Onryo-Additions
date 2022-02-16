package net.onryo.additions.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;
import net.onryo.additions.OnryoAdditionsMod;
import net.onryo.additions.block.custom.*;
import net.onryo.additions.item.ModItemGroups;
import net.onryo.additions.item.ModItems;
import net.onryo.additions.world.feature.tree.SakuraSaplingGenerator;

public class ModBlocks {

    public static final Block ORICHALCUM_BLOCK = registerBlock("orichalcum_block",
            new StrengthBlock(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroups.ADDITIONS_GROUP);
    public static final Block DEEPSLATE_ORICHALCUM_ORE = registerBlock("deepslate_orichalcum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroups.ADDITIONS_GROUP);
    public static final Block ORICHALCUM_ORE = registerBlock("orichalcum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ADDITIONS_GROUP);
    public static final Block RAW_ORICHALCUM_BLOCK = registerBlock("raw_orichalcum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5f).requiresTool()), ModItemGroups.ADDITIONS_GROUP);

    public static final Block SAKURA_LOG = registerBlock("sakura_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.BIRCH_LOG)),ModItemGroups.ADDITIONS_GROUP);
    public static final Block STRIPPED_SAKURA_LOG = registerBlock("stripped_sakura_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_BIRCH_LOG)), ModItemGroups.ADDITIONS_GROUP);
    public static final Block SAKURA_WOOD = registerBlock("sakura_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.BIRCH_WOOD)),ModItemGroups.ADDITIONS_GROUP);
    public static final Block STRIPPED_SAKURA_WOOD = registerBlock("stripped_sakura_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_BIRCH_WOOD)), ModItemGroups.ADDITIONS_GROUP);
    public static final Block SAKURA_PLANKS = registerBlock("sakura_planks",
            new Block(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS)), ModItemGroups.ADDITIONS_GROUP);
    public static final Block SAKURA_LEAVES = registerBlock("sakura_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.BIRCH_LEAVES)), ModItemGroups.ADDITIONS_GROUP);

    public static final Block STRAWBERRY_BUSH = registerBlock("strawberry_bush",
            new StrawberryBushBlock(FabricBlockSettings.of(Material.PLANT)
                    .nonOpaque().ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), null);
    public static final Block BLUEBERRY_BUSH = registerBlock("blueberry_bush",
            new BlueberryBushBlock(FabricBlockSettings.of(Material.PLANT)
                    .nonOpaque().ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), null);
    public static final Block CUCUMBER_CROP = registerBlock("cucumber_crop",
            new CucumberBlock(FabricBlockSettings.copy(Blocks.BEETROOTS)), null);
    public static final Block DARK_ROSE = registerBlock("dark_rose",
            new FlowerBlock(StatusEffects.GLOWING, 8,
                    FabricBlockSettings.copy(Blocks.POPPY)), ModItemGroups.ADDITIONS_GROUP);
    public static final Block POTTED_DARK_ROSE = registerBlock("potted_dark_rose",
            new FlowerPotBlock(ModBlocks.DARK_ROSE, FabricBlockSettings.copy(Blocks.POTTED_POPPY)), null);
    public static final Block SAKURA_SAPLING = registerBlock("sakura_sapling",
            new ModSaplingBlock(new SakuraSaplingGenerator(), FabricBlockSettings.copy(Blocks.BIRCH_SAPLING)), ModItemGroups.ADDITIONS_GROUP);
    public static final Block POTTED_SAKURA_SAPLING = registerBlock("potted_sakura_sapling",
            new FlowerPotBlock(ModBlocks.SAKURA_SAPLING, FabricBlockSettings.copy(Blocks.POTTED_BIRCH_SAPLING)), null);

    public static final Block LAMP = registerBlock("lamp",
            new LampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(1.0f).requiresTool()
                    .luminance((state) -> state.get(LampBlock.LIT) ? 15: 0)), ModItemGroups.ADDITIONS_GROUP);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        if(group != null)
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
