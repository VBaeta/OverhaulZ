package net.vinithekidd.overhaulz.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.vinithekidd.overhaulz.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                List<ItemConvertible> LOW_LEVEL_SMELTABLES = List.of(ModItems.ALUMINUM_FOIL, ModItems.TWEEZERS, ModItems.CAN_OPENER);

                offerSmelting(LOW_LEVEL_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINUM_INGOT, 0.25f, 200, "aluminum");
                offerBlasting(LOW_LEVEL_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINUM_INGOT, 0.4f, 100, "aluminum");


            }
        };
    }

    @Override
    public String getName() {
        return "Overhaul-Z Mod Recipes";
    }
}


