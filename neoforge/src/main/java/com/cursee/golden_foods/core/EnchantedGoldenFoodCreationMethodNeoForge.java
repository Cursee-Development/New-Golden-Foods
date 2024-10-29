package com.cursee.golden_foods.core;

import com.cursee.golden_foods.Constants;
import com.cursee.golden_foods.GoldenFoods;
import com.cursee.golden_foods.core.registry.ModBlocksNeoForge;
import com.cursee.golden_foods.core.registry.ModItemsNeoForge;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.AnvilUpdateEvent;

import java.util.concurrent.atomic.AtomicBoolean;

@EventBusSubscriber(modid = Constants.MOD_ID)
public class EnchantedGoldenFoodCreationMethodNeoForge {

    @SubscribeEvent
    public static void onAnvilUpdate(AnvilUpdateEvent anvil) {
        
        ItemStack slotLeft = anvil.getLeft();
        ItemStack slotRight = anvil.getRight();
        ItemStack slotOutput = anvil.getOutput();

        final AtomicBoolean foundEnchantment = new AtomicBoolean(false);
        EnchantmentHelper.getEnchantmentsForCrafting(slotRight).keySet().forEach(enchantmentHolder -> {
            if (enchantmentHolder.is(GoldenFoods.GOLDEN_FOODS)) foundEnchantment.set(true);
        });
        if (!foundEnchantment.get()) return;

        final Integer experienceCost = Math.min(slotLeft.getCount(), 40);

        if (slotLeft.is(Items.GOLDEN_APPLE)) {
            final ItemStack toReturn = new ItemStack(Items.ENCHANTED_GOLDEN_APPLE);
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(Items.GOLDEN_CARROT)) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_CARROT.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_MELON_SLICE.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_MELON_SLICE.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_SWEET_BERRIES.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_SWEET_BERRIES.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_GLOW_BERRIES.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_GLOW_BERRIES.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_BAKED_POTATO.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_BAKED_POTATO.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_BEETROOT.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_BEETROOT.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_DRIED_KELP.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_DRIED_KELP.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_BREAD.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_BREAD.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_COOKIE.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_COOKIE.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_PUMPKIN_PIE.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_PUMPKIN_PIE.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModBlocksNeoForge.GOLDEN_CAKE.get().asItem())) {
            final ItemStack toReturn = new ItemStack(ModBlocksNeoForge.ENCHANTED_GOLDEN_CAKE.get().asItem());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_CHORUS_FRUIT.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_CHORUS_FRUIT.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_MILK_BUCKET.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_MILK_BUCKET.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_HONEY_BOTTLE.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_HONEY_BOTTLE.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_MUSHROOM_STEW.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_MUSHROOM_STEW.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_BEETROOT_SOUP.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_BEETROOT_SOUP.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_RABBIT_STEW.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_RABBIT_STEW.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_COOKED_BEEF.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_COOKED_BEEF.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_COOKED_PORKCHOP.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_COOKED_PORKCHOP.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_COOKED_MUTTON.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_COOKED_MUTTON.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_COOKED_CHICKEN.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_COOKED_CHICKEN.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_COOKED_RABBIT.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_COOKED_RABBIT.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_COOKED_COD.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_COOKED_COD.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsNeoForge.GOLDEN_COOKED_SALMON.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsNeoForge.ENCHANTED_GOLDEN_COOKED_SALMON.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }
    }
}
