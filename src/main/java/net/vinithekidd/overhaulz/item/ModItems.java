package net.vinithekidd.overhaulz.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.vinithekidd.overhaulz.OverhaulZ;
import net.vinithekidd.overhaulz.item.custom.ContainerItem;

public class ModItems {

    //Aluminum (basic, scraps, parts, tools)

    public static  final Item ALUMINUM_INGOT = registerItem("aluminum_ingot", new Item(new Item.Settings()
    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OverhaulZ.MOD_ID, "aluminum_ingot")))));

    public static  final Item EMPTY_CAN = registerItem("empty_can", new Item(new Item.Settings()
    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OverhaulZ.MOD_ID, "empty_can")))));

    public static  final Item BIKE_PARTS = registerItem("bike_parts", new Item(new Item.Settings()
    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OverhaulZ.MOD_ID, "bike_parts")))));

    public static  final Item ALUMINUM_FOIL = registerItem("aluminum_foil", new Item(new Item.Settings()
    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OverhaulZ.MOD_ID, "aluminum_foil")))));



    public static  final Item ALUMINUM_PARTS = registerItem("aluminum_parts", new Item(new Item.Settings()
    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OverhaulZ.MOD_ID, "aluminum_parts")))));

    public static  final Item ALUMINUM_GEAR = registerItem("aluminum_gear", new Item(new Item.Settings()
    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OverhaulZ.MOD_ID, "aluminum_gear")))));

    public static  final Item ALUMINUM_WIRING = registerItem("aluminum_wiring", new Item(new Item.Settings()
    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OverhaulZ.MOD_ID, "aluminum_wiring")))));



    public static  final Item CAN_OPENER = registerItem("can_opener", new Item(new Item.Settings()
    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OverhaulZ.MOD_ID, "can_opener")))));

    public static  final Item PLIERS = registerItem("pliers", new Item(new Item.Settings()
    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OverhaulZ.MOD_ID, "pliers")))));

    public static  final Item STAPLER = registerItem("stapler", new Item(new Item.Settings()
    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OverhaulZ.MOD_ID, "stapler")))));

    public static  final Item RULER = registerItem("ruler", new Item(new Item.Settings()
    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OverhaulZ.MOD_ID, "ruler")))));

    public static  final Item TWEEZERS = registerItem("tweezers", new Item(new Item.Settings()
    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OverhaulZ.MOD_ID, "tweezers")))));


    public static  final Item NAILS = registerItem("nails", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OverhaulZ.MOD_ID, "nails")))));

    public static  final Item EMPTY_BOX = registerItem("empty_box", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OverhaulZ.MOD_ID, "empty_box")))));


    public static final Item BOX_OF_NAILS = registerItem("box_of_nails",
            new ContainerItem(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OverhaulZ.MOD_ID, "box_of_nails"))),
                    EMPTY_BOX,
                    NAILS,
                    10
            )
    );



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(OverhaulZ.MOD_ID, name), item);
    }

    public static void registerModItems() {

        OverhaulZ.LOGGER.info("Registering Mod Items for " + OverhaulZ.MOD_ID);

    }
}
