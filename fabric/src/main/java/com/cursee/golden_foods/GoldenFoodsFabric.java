package com.cursee.golden_foods;

import com.cursee.golden_foods.core.EnchantedGoldenFoodCreationMethodFabric;
import com.cursee.golden_foods.core.registry.RegistryFabric;
import com.cursee.monolib.callback.AnvilEventsFabric;
import com.cursee.monolib.core.sailing.Sailing;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.*;

public class GoldenFoodsFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        GoldenFoods.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);
        RegistryFabric.register();

//        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(content -> {
//            // content.accept(EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantmentsFabric.GOLDEN_FOODS, 1)));
//            content.addAfter(Items.ENCHANTED_BOOK, EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantmentsFabric.GOLDEN_FOODS, 1)));
//        });

        AnvilEventsFabric.UPDATE.register(EnchantedGoldenFoodCreationMethodFabric::createGoldenFoods);
    }
}
