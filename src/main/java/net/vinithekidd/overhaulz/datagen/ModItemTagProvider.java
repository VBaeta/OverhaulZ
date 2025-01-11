package net.vinithekidd.overhaulz.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.vinithekidd.overhaulz.item.ModItems;
import net.vinithekidd.overhaulz.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.ALUMINUM_SMELTABLES)
                .add(ModItems.EMPTY_CAN)
                .add(ModItems.ALUMINUM_FOIL)

                .add(ModItems.ALUMINUM_PARTS)
                .add(ModItems.ALUMINUM_GEAR)
                .add(ModItems.ALUMINUM_WIRING)
                .add(ModItems.BIKE_PARTS)

                .add(ModItems.CAN_OPENER)
                .add(ModItems.PLIERS)
                .add(ModItems.STAPLER)
                .add(ModItems.TWEEZERS)
                .add(ModItems.RULER)
        ;

        getOrCreateTagBuilder(ModTags.Items.LOW_LEVEL_SMELTABLES)
                .add(ModItems.ALUMINUM_FOIL)
                .add(ModItems.TWEEZERS)
                .add(ModItems.CAN_OPENER)
        ;


        getOrCreateTagBuilder(ModTags.Items.MID_LEVEL_SMELTABLES)
                .add(ModItems.ALUMINUM_WIRING)
                .add(ModItems.RULER)
                .add(ModItems.STAPLER)
                .add(ModItems.EMPTY_CAN)
        ;


        getOrCreateTagBuilder(ModTags.Items.HIGH_LEVEL_SMELTABLES)
                .add(ModItems.ALUMINUM_GEAR)
                .add(ModItems.ALUMINUM_PARTS)
                .add(ModItems.PLIERS)
                .add(ModItems.BIKE_PARTS)
        ;

    }
}
