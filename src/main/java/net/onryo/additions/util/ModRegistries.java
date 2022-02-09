package net.onryo.additions.util;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.client.render.RenderLayer;
import net.onryo.additions.OnryoAdditionsMod;
import net.onryo.additions.block.ModBlocks;
import net.onryo.additions.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuelds();
        registerRenderLayerMap();
    }

    private static void registerFuelds () {
        System.out.println("Registering Fuels for " + OnryoAdditionsMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.COAL_SLIVER, 400);
    }

    private static void registerRenderLayerMap () {
        System.out.println("Registering Render Layer Maps for " + OnryoAdditionsMod.MOD_ID);
        BlockRenderLayerMap registry = BlockRenderLayerMap.INSTANCE;

        registry.putBlock(ModBlocks.STRAWBERRY_BUSH, RenderLayer.getCutout());
    }
}
