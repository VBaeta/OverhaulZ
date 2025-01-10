package net.vinithekidd.overhaulz;

import net.fabricmc.api.ModInitializer;

import net.vinithekidd.overhaulz.block.ModBlocks;
import net.vinithekidd.overhaulz.item.ModItemGroups;
import net.vinithekidd.overhaulz.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OverhaulZ implements ModInitializer {
	public static final String MOD_ID = "overhaulz";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}