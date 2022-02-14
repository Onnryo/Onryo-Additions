package net.onryo.additions;

import net.fabricmc.api.ClientModInitializer;
import net.onryo.additions.util.ModModelPredicateProvider;
import net.onryo.additions.util.ModRegistries;

public class OnryoAdditionsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModRegistries.registerClientStuffs();
        ModModelPredicateProvider.registerModModels();
    }
}
