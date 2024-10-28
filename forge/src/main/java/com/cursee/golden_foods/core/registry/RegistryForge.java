package com.cursee.golden_foods.core.registry;

import com.cursee.golden_foods.Constants;
import com.cursee.golden_foods.GoldenFoods;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class RegistryForge {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Constants.MOD_ID);
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Constants.MOD_ID);

    public static void register(IEventBus modEventBus) {

        ModBlocksForge.register();
        ModItemsForge.register();
        ModTabsForge.register();
        ModEnchantmentsForge.register();

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        TABS.register(modEventBus);
        ENCHANTMENTS.register(modEventBus);
    }

    public static <T extends Block> RegistryObject<T> registerBlock(String blockID, Supplier<T> blockSupplier) {
        return BLOCKS.register(blockID, blockSupplier);
    }

    public static <T extends Item> RegistryObject<T> registerItem(String itemID, Supplier<T> itemSupplier) {
        return ITEMS.register(itemID, itemSupplier);
    }

    public static <T extends Block> RegistryObject<T> registerBlockWithItem(String blockID, Supplier<T> blockSupplier) {
        RegistryObject<T> toReturn = registerBlock(blockID, blockSupplier);
        registerItem(blockID, () -> new BlockItem(toReturn.get(), new Item.Properties()));
        return toReturn;
    }

    public static <T extends CreativeModeTab> RegistryObject<T> registerTab(String tabID, Supplier<T> tabSupplier) {
        return TABS.register(tabID, tabSupplier);
    }

    public static <T extends Enchantment> RegistryObject<T> registerEnchantment(String enchantmentID, Supplier<T> enchantmentSupplier) {
        return ENCHANTMENTS.register(enchantmentID, enchantmentSupplier);
    }
}
