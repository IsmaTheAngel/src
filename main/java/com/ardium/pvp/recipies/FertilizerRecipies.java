package com.ardium.pvp.recipies;

import com.ardium.pvp.items.RegistryItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FertilizerRecipies {
private static final FertilizerRecipies craftingBase = new FertilizerRecipies();


private Map craftingList = new HashMap();

    private FertilizerRecipies()
{
	registerRecipe(new ItemStack(RegistryItems.CropEssencesT1,1,0), new ItemStack(RegistryItems.CropEssencesT1,1,0), new ItemStack(RegistryItems.CropEssencesT1,1,0), new ItemStack(RegistryItems.CropEssencesT1,1,0), new ItemStack(RegistryItems.CropEssencesT1,1,0), new ItemStack(Items.iron_ingot,1,0));
	registerRecipe(new ItemStack(RegistryItems.CropEssencesT1,1,1), new ItemStack(RegistryItems.CropEssencesT1,1,1), new ItemStack(RegistryItems.CropEssencesT1,1,1), new ItemStack(RegistryItems.CropEssencesT1,1,1), new ItemStack(RegistryItems.CropEssencesT1,1,1), new ItemStack(Items.coal,1,0));
	registerRecipe(new ItemStack(RegistryItems.CropEssencesT1,1,2), new ItemStack(RegistryItems.CropEssencesT1,1,2), new ItemStack(RegistryItems.CropEssencesT1,1,2), new ItemStack(RegistryItems.CropEssencesT1,1,2), new ItemStack(RegistryItems.CropEssencesT1,1,2), new ItemStack(Items.dye,1,4));
	
	registerRecipe(new ItemStack(RegistryItems.CropEssencesT2,1,0), new ItemStack(RegistryItems.CropEssencesT2,1,0), new ItemStack(RegistryItems.CropEssencesT2,1,0), new ItemStack(RegistryItems.CropEssencesT2,1,0), new ItemStack(RegistryItems.CropEssencesT2,1,0), new ItemStack(Items.gold_ingot,1,0));
	registerRecipe(new ItemStack(RegistryItems.CropEssencesT2,1,1), new ItemStack(RegistryItems.CropEssencesT2,1,1), new ItemStack(RegistryItems.CropEssencesT2,1,1), new ItemStack(RegistryItems.CropEssencesT2,1,1), new ItemStack(RegistryItems.CropEssencesT2,1,1), new ItemStack(Items.redstone,1,0));
	registerRecipe(new ItemStack(RegistryItems.CropEssencesT2,1,2), new ItemStack(RegistryItems.CropEssencesT2,1,2), new ItemStack(RegistryItems.CropEssencesT2,1,2), new ItemStack(RegistryItems.CropEssencesT2,1,2), new ItemStack(RegistryItems.CropEssencesT2,1,2), new ItemStack(Items.emerald,1,4));
	
	registerRecipe(new ItemStack(RegistryItems.CropEssencesT3,1,0), new ItemStack(RegistryItems.CropEssencesT3,1,0), new ItemStack(RegistryItems.CropEssencesT3,1,0), new ItemStack(RegistryItems.CropEssencesT3,1,0), new ItemStack(RegistryItems.CropEssencesT3,1,0), new ItemStack(Items.diamond,1,0));

	registerRecipe(new ItemStack(RegistryItems.amorpha_petal,1,0), new ItemStack(RegistryItems.amorpha_petal,1,0), new ItemStack(Blocks.dirt,1,0), new ItemStack(RegistryItems.amorpha_petal,1,0), new ItemStack(RegistryItems.amorpha_petal,1,0), new ItemStack(Blocks.coal_block,1,0));
    registerRecipe (new ItemStack (RegistryItems.leaf, 1, 0), new ItemStack (RegistryItems.leaf, 1, 0), new ItemStack (RegistryItems.leaf, 1, 0), new ItemStack (RegistryItems.leaf, 1, 0), new ItemStack (RegistryItems.leaf, 1, 0), new ItemStack (Blocks.leaves, 1, 0));
	
	registerRecipe(new ItemStack(RegistryItems.element_essences,1,0), new ItemStack(RegistryItems.element_essences,1,0), new ItemStack(RegistryItems.element_essences,1,0), new ItemStack(RegistryItems.element_essences,1,0), new ItemStack(RegistryItems.element_essences,1,0), new ItemStack(Items.water_bucket,1,0));
	registerRecipe(new ItemStack(RegistryItems.element_essences,1,1), new ItemStack(RegistryItems.element_essences,1,1), new ItemStack(RegistryItems.element_essences,1,1), new ItemStack(RegistryItems.element_essences,1,1), new ItemStack(RegistryItems.element_essences,1,1), new ItemStack(Items.lava_bucket,1,0));
	registerRecipe(new ItemStack(RegistryItems.element_essences,1,2), new ItemStack(RegistryItems.element_essences,1,2), new ItemStack(RegistryItems.element_essences,1,2), new ItemStack(RegistryItems.element_essences,1,2), new ItemStack(RegistryItems.element_essences,1,2), new ItemStack(Blocks.dirt,1,0));
}


    private void registerRecipe(ItemStack stack1, ItemStack stack2, ItemStack stack3, ItemStack stack4, ItemStack stack5, ItemStack stack)
{
  ItemStack[] stackList = { stack1, stack2, stack3, stack4, stack5 };
  this.craftingList.put(stackList, stack);
}

public void registerRecipe(Item item1, Block item2, Item item3, Block item4, Item item5, ItemStack stack)
{
  registerRecipe(new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), new ItemStack(item4), new ItemStack(item5), stack);
}

public void registerRecipe(Block item1, Block item2, Block item3, Block item4, Block item5, ItemStack stack)
{
  registerRecipe(new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), new ItemStack(item4), new ItemStack(item5), stack);
}

public void registerRecipe(Item item1, Item item2, Item item3, Item item4, Item item5, ItemStack stack)
{
  registerRecipe(new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), new ItemStack(item4), new ItemStack(item5), stack);
}

public void registerRecipe(Block item1, Block item2, Item item3, Block item4, Block item5, ItemStack stack)
{
  registerRecipe(new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), new ItemStack(item4), new ItemStack(item5), stack);
}

public void registerRecipe(Item item1, Block item2, Block item3, Block item4, Block item5, ItemStack stack)
{
  registerRecipe(new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), new ItemStack(item4), new ItemStack(item5), stack);
}

public void registerRecipe(Item item1, Item item2, Block item3, Item item4, Item item5, ItemStack stack)
{
  registerRecipe(new ItemStack(item1), new ItemStack(item2), new ItemStack(item3), new ItemStack(item4), new ItemStack(item5), stack);
}

public ItemStack getSmeltingResult(ItemStack[] stack)
{
  Iterator iterator = this.craftingList.entrySet().iterator();
  Map.Entry entry;
  do
  {
    if (!iterator.hasNext()) {
      return null;
    }
    entry = (Map.Entry)iterator.next();
  } while (!isSameKey(stack, (ItemStack[])entry.getKey()));
  return (ItemStack)entry.getValue();
}

private boolean isSameKey(ItemStack[] stackList, ItemStack[] stackList2)
{
  boolean isSame = false;
  for (int i = 0; i <= 4; i++) {
    if ((stackList[i].getItem() == stackList2[i].getItem()) && (
      (stackList[i].getItemDamage() == stackList2[i].getItemDamage()))) {
      isSame = true;
    } else {
      return false;
    }
  }
  return isSame;
}

public Map getCraftingList()
{
  return this.craftingList;
}

public static FertilizerRecipies crafting()
{
  return craftingBase;
}
}
