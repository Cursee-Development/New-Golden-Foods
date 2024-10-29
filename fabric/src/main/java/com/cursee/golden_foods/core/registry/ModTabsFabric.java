package com.cursee.golden_foods.core.registry;

import com.cursee.golden_foods.Constants;
import com.cursee.golden_foods.GoldenFoods;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;

import java.util.function.Predicate;

public class ModTabsFabric {

    public static void register() {}

    private static void generateGoldenFoodsEnchantmentBook(CreativeModeTab.Output output, HolderLookup<Enchantment> enchantmentHolderLookup, CreativeModeTab.TabVisibility tabVisibility) {

        if (enchantmentHolderLookup.listElementIds().anyMatch(Predicate.isEqual(GoldenFoods.GOLDEN_FOODS))) {}

        enchantmentHolderLookup.listElements().map(($$0x) -> {
            return EnchantedBookItem.createForEnchantment(new EnchantmentInstance($$0x, 1));
        }).forEach((itemStack) -> {
            output.accept(itemStack, tabVisibility);
        });
    }

    public static final CreativeModeTab GOLDEN_FOODS_TAB = RegistryFabric.registerTab(Constants.MOD_ID, () -> FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItemsFabric.ENCHANTED_GOLDEN_CARROT))
            .title(Component.translatable("itemGroup.goldenFoods"))
            .displayItems((itemDisplayParameters, output) -> {

                itemDisplayParameters.holders().lookup(Registries.ENCHANTMENT).ifPresent((enchantmentRegistryLookup) -> {
                    generateGoldenFoodsEnchantmentBook(output, enchantmentRegistryLookup, CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                });

                output.accept(Items.GOLDEN_APPLE);
                output.accept(Items.ENCHANTED_GOLDEN_APPLE);

                output.accept(Items.GOLDEN_CARROT);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_CARROT);

                output.accept(ModItemsFabric.GOLDEN_MELON_SLICE);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_MELON_SLICE);

                output.accept(ModItemsFabric.GOLDEN_SWEET_BERRIES);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_SWEET_BERRIES);

                output.accept(ModItemsFabric.GOLDEN_GLOW_BERRIES);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_GLOW_BERRIES);

                output.accept(ModItemsFabric.GOLDEN_BAKED_POTATO);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_BAKED_POTATO);

                output.accept(ModItemsFabric.GOLDEN_BEETROOT);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_BEETROOT);

                output.accept(ModItemsFabric.GOLDEN_DRIED_KELP);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_DRIED_KELP);

                output.accept(ModItemsFabric.GOLDEN_BREAD);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_BREAD);

                output.accept(ModItemsFabric.GOLDEN_COOKIE);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_COOKIE);

                output.accept(ModItemsFabric.GOLDEN_PUMPKIN_PIE);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_PUMPKIN_PIE);

                output.accept(ModBlocksFabric.GOLDEN_CAKE.asItem());
                output.accept(ModBlocksFabric.ENCHANTED_GOLDEN_CAKE.asItem());

                output.accept(ModItemsFabric.GOLDEN_CHORUS_FRUIT);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_CHORUS_FRUIT);

                output.accept(ModItemsFabric.GOLDEN_MILK_BUCKET);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_MILK_BUCKET);

                output.accept(ModItemsFabric.GOLDEN_HONEY_BOTTLE);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_HONEY_BOTTLE);

                output.accept(ModItemsFabric.GOLDEN_MUSHROOM_STEW);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_MUSHROOM_STEW);
                output.accept(ModItemsFabric.GOLDEN_BEETROOT_SOUP);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_BEETROOT_SOUP);
                output.accept(ModItemsFabric.GOLDEN_RABBIT_STEW);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_RABBIT_STEW);

                output.accept(ModItemsFabric.GOLDEN_COOKED_BEEF);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_COOKED_BEEF);
                output.accept(ModItemsFabric.GOLDEN_COOKED_PORKCHOP);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_COOKED_PORKCHOP);
                output.accept(ModItemsFabric.GOLDEN_COOKED_MUTTON);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_COOKED_MUTTON);
                output.accept(ModItemsFabric.GOLDEN_COOKED_CHICKEN);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_COOKED_CHICKEN);
                output.accept(ModItemsFabric.GOLDEN_COOKED_RABBIT);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_COOKED_RABBIT);
                output.accept(ModItemsFabric.GOLDEN_COOKED_COD);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_COOKED_COD);
                output.accept(ModItemsFabric.GOLDEN_COOKED_SALMON);
                output.accept(ModItemsFabric.ENCHANTED_GOLDEN_COOKED_SALMON);
            }).build());
}
