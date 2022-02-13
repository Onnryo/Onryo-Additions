package net.onryo.additions;

import net.fabricmc.api.ModInitializer;
import net.onryo.additions.block.ModBlocks;
import net.onryo.additions.enchantment.ModEnchantments;
import net.onryo.additions.item.ModItems;
import net.onryo.additions.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OnryoAdditionsMod implements ModInitializer {

	public static final String MOD_ID = "onryo";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEnchantments.registerModEnchantments();
		ModRegistries.registerModStuffs();
	}
}
