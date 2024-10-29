package com.cursee.golden_foods.core.registry;

import com.cursee.golden_foods.GoldenFoods;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class RegistryFabric {

    public static void register() {
        ModBlocksFabric.register();
        ModItemsFabric.register();
        ModTabsFabric.register();
    }

    public static <T extends Block> Block registerBlock(String blockID, Supplier<T> blockSupplier) {
        return Registry.register(BuiltInRegistries.BLOCK, GoldenFoods.Identifier.of(blockID), blockSupplier.get());
    }

    public static <T extends Item> Item registerItem(String itemID, Supplier<T> itemSupplier) {
        return Registry.register(BuiltInRegistries.ITEM, GoldenFoods.Identifier.of(itemID), itemSupplier.get());
    }

    public static <T extends Block> Block registerBlockWithItem(String blockID, Supplier<T> blockSupplier) {
        Block toReturn = registerBlock(blockID, blockSupplier);
        registerItem(blockID, () -> new BlockItem(toReturn, new Item.Properties()));
        return toReturn;
    }

    public static <T extends CreativeModeTab> CreativeModeTab registerTab(String tabID, Supplier<T> tabSupplier) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, GoldenFoods.Identifier.of(tabID), tabSupplier.get());
    }
}
