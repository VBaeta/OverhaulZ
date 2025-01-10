package net.vinithekidd.overhaulz.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.vinithekidd.overhaulz.block.ModBlocks;
import net.vinithekidd.overhaulz.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALUMINUM_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ALUMINUM_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.EMPTY_CAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIKE_PARTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STAPLER, Models.GENERATED);

        itemModelGenerator.register(ModItems.ALUMINUM_PARTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINUM_GEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINUM_WIRING, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINUM_FOIL, Models.GENERATED);

        itemModelGenerator.register(ModItems.CAN_OPENER, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLIERS, Models.GENERATED);
        itemModelGenerator.register(ModItems.RULER, Models.GENERATED);
        itemModelGenerator.register(ModItems.TWEEZERS, Models.GENERATED);

    }
}
