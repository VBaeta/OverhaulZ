package net.vinithekidd.overhaulz.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.vinithekidd.overhaulz.OverhaulZ;
import net.vinithekidd.overhaulz.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup ALUMINUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(OverhaulZ.MOD_ID, "aluminum_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ALUMINUM_INGOT))
                    .displayName(Text.translatable("itemgroup.overhaulz.aluminum_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ALUMINUM_INGOT);
                        entries.add(ModItems.EMPTY_CAN);
                        entries.add(ModItems.BIKE_PARTS);
                        entries.add(ModItems.STAPLER);
                        entries.add(ModItems.ALUMINUM_PARTS);
                        entries.add(ModItems.ALUMINUM_GEAR);
                        entries.add(ModItems.ALUMINUM_WIRING);
                        entries.add(ModItems.ALUMINUM_FOIL);
                        entries.add(ModItems.CAN_OPENER);
                        entries.add(ModItems.PLIERS);
                        entries.add(ModItems.RULER);
                        entries.add(ModItems.TWEEZERS);



                    }).build());


    public static final ItemGroup METAL_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(OverhaulZ.MOD_ID, "metal_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.ALUMINUM_BLOCK))
                    .displayName(Text.translatable("itemgroup.overhaulz.metal_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ALUMINUM_BLOCK);

                    }).build());

    public static final ItemGroup MACHINES_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(OverhaulZ.MOD_ID, "machines"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Blocks.BLAST_FURNACE))
                    .displayName(Text.translatable("itemgroup.overhaulz.machines"))
                    .entries((displayContext, entries) -> {

                    }).build());

    public static final ItemGroup CONTAINER_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(OverhaulZ.MOD_ID, "container_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.EMPTY_BOX))
                    .displayName(Text.translatable("itemgroup.overhaulz.container_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.EMPTY_BOX);
                        entries.add(ModItems.BOX_OF_NAILS);

                    }).build());

    public static final ItemGroup CONSTRUCTION_PARTS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(OverhaulZ.MOD_ID, "construction_parts"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.NAILS))
                    .displayName(Text.translatable("itemgroup.overhaulz.construction_parts"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.NAILS);

                    }).build());



    public static void registerItemGroups() {
        OverhaulZ.LOGGER.info("Registering Item Groups for " + OverhaulZ.MOD_ID);
    }
}
