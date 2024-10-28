package com.cursee.golden_foods.core;

import com.cursee.golden_foods.Constants;
import com.cursee.golden_foods.core.registry.ModBlocksForge;
import com.cursee.golden_foods.core.registry.ModEnchantmentsForge;
import com.cursee.golden_foods.core.registry.ModItemsForge;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID)
public class EnchantedGoldenFoodCreationMethodForge {

    @SubscribeEvent
    public static void onAnvilUpdate(AnvilUpdateEvent anvil) {
        
        ItemStack slotLeft = anvil.getLeft();
        ItemStack slotRight = anvil.getRight();
        ItemStack slotOutput = anvil.getOutput();
        
        if (!EnchantmentHelper.getEnchantments(slotRight).containsKey(ModEnchantmentsForge.GOLDEN_FOODS.get())) return;

        final Integer experienceCost = Math.min(slotLeft.getCount(), 40);

        if (slotLeft.is(Items.GOLDEN_APPLE)) {
            final ItemStack toReturn = new ItemStack(Items.ENCHANTED_GOLDEN_APPLE);
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(Items.GOLDEN_CARROT)) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_CARROT.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_MELON_SLICE.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_MELON_SLICE.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_SWEET_BERRIES.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_SWEET_BERRIES.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_GLOW_BERRIES.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_GLOW_BERRIES.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_BAKED_POTATO.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_BAKED_POTATO.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_BEETROOT.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_BEETROOT.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_DRIED_KELP.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_DRIED_KELP.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_BREAD.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_BREAD.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_COOKIE.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_COOKIE.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_PUMPKIN_PIE.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_PUMPKIN_PIE.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModBlocksForge.GOLDEN_CAKE.get().asItem())) {
            final ItemStack toReturn = new ItemStack(ModBlocksForge.ENCHANTED_GOLDEN_CAKE.get().asItem());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_CHORUS_FRUIT.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_CHORUS_FRUIT.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_MILK_BUCKET.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_MILK_BUCKET.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_HONEY_BOTTLE.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_HONEY_BOTTLE.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_MUSHROOM_STEW.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_MUSHROOM_STEW.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_BEETROOT_SOUP.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_BEETROOT_SOUP.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_RABBIT_STEW.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_RABBIT_STEW.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_COOKED_BEEF.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_COOKED_BEEF.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_COOKED_PORKCHOP.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_COOKED_PORKCHOP.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_COOKED_MUTTON.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_COOKED_MUTTON.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_COOKED_CHICKEN.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_COOKED_CHICKEN.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_COOKED_RABBIT.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_COOKED_RABBIT.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_COOKED_COD.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_COOKED_COD.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }

        else if (slotLeft.is(ModItemsForge.GOLDEN_COOKED_SALMON.get())) {
            final ItemStack toReturn = new ItemStack(ModItemsForge.ENCHANTED_GOLDEN_COOKED_SALMON.get());
            anvil.setCost(experienceCost);
            anvil.setMaterialCost(slotLeft.getCount());
            anvil.setOutput(toReturn);
            return;
        }
    }
}
