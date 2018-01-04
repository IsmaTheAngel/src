package com.ardium.pvp.recipies;

import com.ardium.pvp.blocks.RegistryBlocks;
import com.ardium.pvp.items.RegistryItems;
import net.minecraft.block.BlockColored;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class RFertilizerRecipies implements IRecipe
{
    private static final Item[][] matrix = {{RegistryItems.ardium_ingot, RegistryItems.ardium_ingot, RegistryItems.ardium_ingot}, {RegistryItems.ardium_ingot, RegistryItems.ardium_ingot, RegistryItems.ardium_ingot}, {RegistryItems.ardium_ingot, RegistryItems.ardium_ingot, RegistryItems.ardium_ingot}};
	  
	  public boolean matches(InventoryCrafting inv, World world)
	  {
	    for (int i = 0; i < 3; i++) {
	      for (int j = 0; j < 3; j++) {
	        if (!corresponds(matrix[i][j], inv.getStackInSlot(i * 3 + j))) {
	          return false;
	        }
	      }
	    }
	    return true;
	  }
	  
	  public ItemStack getCraftingResult(InventoryCrafting inv)
	  {
	    ItemStack stack = new ItemStack(RegistryBlocks.fertilizer);
	    if (!stack.hasTagCompound()) {
	      stack.setTagCompound(new NBTTagCompound());
	    }
	    stack.getTagCompound().setInteger("Color", BlockColored.func_150032_b(inv.getStackInSlot(4).getItemDamage()));
	    return stack;
	  }
	  
	  public int getRecipeSize()
	  {
	    return 9;
	  }
	  
	  public ItemStack getRecipeOutput()
	  {
	    return new ItemStack(RegistryBlocks.fertilizer);
	  }

    private static boolean corresponds(Item item, ItemStack stack) {
        if ( (stack == null) && (item == null) ) {
            return true;
        }
        if ( (stack == null) && (item != null) ) {
            return false;
        }
        return ((stack == null) || (item != null)) && stack.getItem () == item;
    }
	}
