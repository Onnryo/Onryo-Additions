package net.onryo.additions.util;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.ComposterBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.onryo.additions.OnryoAdditionsMod;
import net.onryo.additions.block.ModBlocks;
import net.onryo.additions.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerComposterChances();
    }

    private static void registerComposterChances() {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CUCUMBER, 0.35f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.PICKLE, 0.65f);
    }

    public static void registerClientStuffs() {
        registerRenderLayerMap();
    }

    private static void registerFuels () {
        System.out.println("Registering Fuels for " + OnryoAdditionsMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.COAL_SLIVER, 400);
    }

    private static void registerRenderLayerMap () {
        System.out.println("Registering Render Layer Maps for " + OnryoAdditionsMod.MOD_ID);
        BlockRenderLayerMap registry = BlockRenderLayerMap.INSTANCE;

        registry.putBlock(ModBlocks.STRAWBERRY_BUSH, RenderLayer.getCutout());
        registry.putBlock(ModBlocks.BLUEBERRY_BUSH, RenderLayer.getCutout());
        registry.putBlock(ModBlocks.CUCUMBER_CROP, RenderLayer.getCutout());
    }
}
