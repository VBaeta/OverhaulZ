package net.vinithekidd.overhaulz.util;

import net.vinithekidd.overhaulz.OverhaulZ;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
//        public static final TagKey<Block> NEEDS_PINK_GARNET_TOOL = createTag("needs_pink_garnet_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(OverhaulZ.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> ALUMINUM_SMELTABLES = createTag("aluminum_smeltables");

        public static final TagKey<Item> LOW_LEVEL_SMELTABLES = createTag("low_level_smeltables");

        public static final TagKey<Item> MID_LEVEL_SMELTABLES = createTag("mid_level_smeltables");

        public static final TagKey<Item> HIGH_LEVEL_SMELTABLES = createTag("high_level_smeltables");

        public static final TagKey<Item> BOXED_MATERIALS = createTag("boxed_materials");

        public static final TagKey<Item> BUILDING_MATERIALS = createTag("building_materials");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(OverhaulZ.MOD_ID, name));
        }
    }
}