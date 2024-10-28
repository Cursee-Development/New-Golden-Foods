package com.cursee.golden_foods.core.registry;

import com.cursee.golden_foods.Constants;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraftforge.registries.RegistryObject;

public class ModTabsForge {

    public static void register() {}

    public static final RegistryObject<CreativeModeTab> GOLDEN_FOODS_TAB = RegistryForge.registerTab(Constants.MOD_ID, () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .icon(() -> new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_CARROT.get()))
            .title(Component.translatable("itemGroup.goldenFoods"))
            .displayItems((itemDisplayParameters, output) -> {

                output.accept(EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantmentsForge.GOLDEN_FOODS.get(), 1)));

                output.accept(Items.GOLDEN_APPLE);
                output.accept(Items.ENCHANTED_GOLDEN_APPLE);

                output.accept(Items.GOLDEN_CARROT);
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_CARROT.get());

                output.accept(ModItemsForge.GOLDEN_MELON_SLICE.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_MELON_SLICE.get());

                output.accept(ModItemsForge.GOLDEN_SWEET_BERRIES.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_SWEET_BERRIES.get());

                output.accept(ModItemsForge.GOLDEN_GLOW_BERRIES.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_GLOW_BERRIES.get());

                output.accept(ModItemsForge.GOLDEN_BAKED_POTATO.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_BAKED_POTATO.get());

                output.accept(ModItemsForge.GOLDEN_BEETROOT.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_BEETROOT.get());

                output.accept(ModItemsForge.GOLDEN_DRIED_KELP.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_DRIED_KELP.get());

                output.accept(ModItemsForge.GOLDEN_BREAD.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_BREAD.get());

                output.accept(ModItemsForge.GOLDEN_COOKIE.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_COOKIE.get());

                output.accept(ModItemsForge.GOLDEN_PUMPKIN_PIE.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_PUMPKIN_PIE.get());

                output.accept(ModBlocksForge.GOLDEN_CAKE.get().asItem());
                output.accept(ModBlocksForge.ENCHANTED_GOLDEN_CAKE.get().asItem());

                output.accept(ModItemsForge.GOLDEN_CHORUS_FRUIT.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_CHORUS_FRUIT.get());

                output.accept(ModItemsForge.GOLDEN_MILK_BUCKET.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_MILK_BUCKET.get());

                output.accept(ModItemsForge.GOLDEN_HONEY_BOTTLE.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_HONEY_BOTTLE.get());

                output.accept(ModItemsForge.GOLDEN_MUSHROOM_STEW.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_MUSHROOM_STEW.get());
                output.accept(ModItemsForge.GOLDEN_BEETROOT_SOUP.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_BEETROOT_SOUP.get());
                output.accept(ModItemsForge.GOLDEN_RABBIT_STEW.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_RABBIT_STEW.get());

                output.accept(ModItemsForge.GOLDEN_COOKED_BEEF.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_COOKED_BEEF.get());
                output.accept(ModItemsForge.GOLDEN_COOKED_PORKCHOP.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_COOKED_PORKCHOP.get());
                output.accept(ModItemsForge.GOLDEN_COOKED_MUTTON.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_COOKED_MUTTON.get());
                output.accept(ModItemsForge.GOLDEN_COOKED_CHICKEN.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_COOKED_CHICKEN.get());
                output.accept(ModItemsForge.GOLDEN_COOKED_RABBIT.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_COOKED_RABBIT.get());
                output.accept(ModItemsForge.GOLDEN_COOKED_COD.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_COOKED_COD.get());
                output.accept(ModItemsForge.GOLDEN_COOKED_SALMON.get());
                output.accept(ModItemsForge.ENCHANTED_GOLDEN_COOKED_SALMON.get());
            }).build());
}
