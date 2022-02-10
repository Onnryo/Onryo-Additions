package net.onryo.additions.util;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.onryo.additions.OnryoAdditionsMod;

public class ModTags {
    public static class Blocks {
        // Define custom tags
        public static final Tag.Identified<Block> DOWSING_ROD_USEFUL_BLOCKS = createTag("dowsing_rod_useful_blocks");
        public static final Tag.Identified<Block> DOWSING_ROD_VALUABLE_BLOCKS = createTag("dowsing_rod_valuable_blocks");
        public static final Tag.Identified<Block> DOWSING_ROD_PRECIOUS_BLOCKS = createTag("dowsing_rod_precious_blocks");
        public static final Tag.Identified<Block> PAXEL_MINEABLE = createTag("mineable/paxel");

        // Define common tags
        public static final Tag.Identified<Block> ORICHALCUM_BLOCKS = createCommonTag("orichalcum_blocks");
        public static final Tag.Identified<Block> ORICHALCUM_ORES = createCommonTag("orichalcum_ores");

        // Helpers
        private static Tag.Identified<Block> createTag(String name) {
            return TagFactory.BLOCK.create(new Identifier(OnryoAdditionsMod.MOD_ID, name));
        }
        private static Tag.Identified<Block> createCommonTag(String name) {
            return TagFactory.BLOCK.create(new Identifier("c", name));
        }
    }

    public static class Items {
        // Define common tags
        public static final Tag.Identified<Item> ORICHALCUM_INGOTS = createCommonTag("orichalcum_ingots");
        public static final Tag.Identified<Item> ORICHALCUM_NUGGETS = createCommonTag("orichalcum_nuggets");

        // Helpers
        private static Tag.Identified<Item> createTag(String name) {
            return TagFactory.ITEM.create(new Identifier(OnryoAdditionsMod.MOD_ID, name));
        }
        private static Tag.Identified<Item> createCommonTag(String name) {
            return TagFactory.ITEM.create(new Identifier("c", name));
        }
    }
}
