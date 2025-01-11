package net.vinithekidd.overhaulz.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.vinithekidd.overhaulz.OverhaulZ;

public class ModBlocks {
    public static final Block ALUMINUM_BLOCK = registerBlock("aluminum_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(OverhaulZ.MOD_ID, "aluminum_block")))
                    .strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(OverhaulZ.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(OverhaulZ.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OverhaulZ.MOD_ID, name)))));
    }


    public static void registerModBlocks(){
        OverhaulZ.LOGGER.info("Registering Mod Blocks for " + OverhaulZ.MOD_ID);
    }
}
