package com.cursee.golden_foods.core.registry;

import com.cursee.golden_foods.Constants;
import com.cursee.golden_foods.GoldenFoods;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.function.Predicate;

public class ModTabsNeoForge {

    public static void register() {}

    private static void addGoldenFoodsBook(CreativeModeTab.Output output, HolderLookup<Enchantment> enchantmentHolderLookup, CreativeModeTab.TabVisibility tabVisibility) {
        enchantmentHolderLookup
                .listElements()
                .filter(enchantmentReference -> enchantmentReference.is(GoldenFoods.GOLDEN_FOODS))
                .map(enchantmentReference -> EnchantedBookItem.createForEnchantment(new EnchantmentInstance(enchantmentReference, 1)))
                .forEach(itemStack -> output.accept(itemStack, tabVisibility));
    }

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> GOLDEN_FOODS_TAB = RegistryNeoForge.registerTab(Constants.MOD_ID, () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .icon(() -> new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_CARROT.get()))
            .title(Component.translatable("itemGroup.goldenFoods"))
            .displayItems((itemDisplayParameters, output) -> {

                itemDisplayParameters.holders().lookup(Registries.ENCHANTMENT).ifPresent((enchantmentRegistryLookup) -> {
                    addGoldenFoodsBook(output, enchantmentRegistryLookup, CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                });

                output.accept(Items.GOLDEN_APPLE);
                output.accept(Items.ENCHANTED_GOLDEN_APPLE);

                output.accept(Items.GOLDEN_CARROT);
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_CARROT.get());

                output.accept(ModItemsNeoForge.GOLDEN_MELON_SLICE.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_MELON_SLICE.get());

                output.accept(ModItemsNeoForge.GOLDEN_SWEET_BERRIES.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_SWEET_BERRIES.get());

                output.accept(ModItemsNeoForge.GOLDEN_GLOW_BERRIES.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_GLOW_BERRIES.get());

                output.accept(ModItemsNeoForge.GOLDEN_BAKED_POTATO.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_BAKED_POTATO.get());

                output.accept(ModItemsNeoForge.GOLDEN_BEETROOT.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_BEETROOT.get());

                output.accept(ModItemsNeoForge.GOLDEN_DRIED_KELP.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_DRIED_KELP.get());

                output.accept(ModItemsNeoForge.GOLDEN_BREAD.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_BREAD.get());

                output.accept(ModItemsNeoForge.GOLDEN_COOKIE.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_COOKIE.get());

                output.accept(ModItemsNeoForge.GOLDEN_PUMPKIN_PIE.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_PUMPKIN_PIE.get());

                output.accept(ModBlocksNeoForge.GOLDEN_CAKE.get().asItem());
                output.accept(ModBlocksNeoForge.ENCHANTED_GOLDEN_CAKE.get().asItem());

                output.accept(ModItemsNeoForge.GOLDEN_CHORUS_FRUIT.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_CHORUS_FRUIT.get());

                output.accept(ModItemsNeoForge.GOLDEN_MILK_BUCKET.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_MILK_BUCKET.get());

                output.accept(ModItemsNeoForge.GOLDEN_HONEY_BOTTLE.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_HONEY_BOTTLE.get());

                output.accept(ModItemsNeoForge.GOLDEN_MUSHROOM_STEW.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_MUSHROOM_STEW.get());
                output.accept(ModItemsNeoForge.GOLDEN_BEETROOT_SOUP.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_BEETROOT_SOUP.get());
                output.accept(ModItemsNeoForge.GOLDEN_RABBIT_STEW.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_RABBIT_STEW.get());

                output.accept(ModItemsNeoForge.GOLDEN_COOKED_BEEF.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_COOKED_BEEF.get());
                output.accept(ModItemsNeoForge.GOLDEN_COOKED_PORKCHOP.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_COOKED_PORKCHOP.get());
                output.accept(ModItemsNeoForge.GOLDEN_COOKED_MUTTON.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_COOKED_MUTTON.get());
                output.accept(ModItemsNeoForge.GOLDEN_COOKED_CHICKEN.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_COOKED_CHICKEN.get());
                output.accept(ModItemsNeoForge.GOLDEN_COOKED_RABBIT.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_COOKED_RABBIT.get());
                output.accept(ModItemsNeoForge.GOLDEN_COOKED_COD.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_COOKED_COD.get());
                output.accept(ModItemsNeoForge.GOLDEN_COOKED_SALMON.get());
                output.accept(ModItemsNeoForge.ENCHANTED_GOLDEN_COOKED_SALMON.get());
            }).build());
}
