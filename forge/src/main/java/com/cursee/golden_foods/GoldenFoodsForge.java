package com.cursee.golden_foods;

import com.cursee.golden_foods.core.registry.ModEnchantmentsForge;
import com.cursee.golden_foods.core.registry.RegistryForge;
import com.cursee.monolib.core.sailing.Sailing;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class GoldenFoodsForge {
    
    public GoldenFoodsForge() {
        GoldenFoods.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);
        RegistryForge.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    @Mod.EventBusSubscriber(modid = Constants.MOD_ID)
    public static class CreativeModeTabsEvents {

        @SubscribeEvent
        public void onBuildCreativeModeTabContents(BuildCreativeModeTabContentsEvent event) {

            if (event.getTabKey() != CreativeModeTabs.TOOLS_AND_UTILITIES) return;

            final ItemStack[] lastEnchantedBookItemStack = new ItemStack[]{ItemStack.EMPTY};
            event.getEntries().forEach(itemStackTabVisibilityEntry -> lastEnchantedBookItemStack[0] = itemStackTabVisibilityEntry.getKey());

            event.getEntries().putAfter(lastEnchantedBookItemStack[0], EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantmentsForge.GOLDEN_FOODS.get(), 1)), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}