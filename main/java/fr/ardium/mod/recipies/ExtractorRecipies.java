package fr.ardium.mod.recipies;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import fr.ardium.mod.blocks.RegistryBlocks;
import fr.ardium.mod.items.RegistryItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ExtractorRecipies {
private static final ExtractorRecipies craftingBase = new ExtractorRecipies();


private Map craftingList = new HashMap();

public ExtractorRecipies()
{
	registerRecipe(new ItemStack(RegistryBlocks.big_ardium_block,1,0), new ItemStack(RegistryBlocks.ardium_block,1,0), new ItemStack(Items.ghast_tear,1,0), new ItemStack(RegistryBlocks.ardium_block,1,0), new ItemStack(RegistryBlocks.big_ardium_block,1,0), new ItemStack(RegistryItems.heal_stone,1,0));
	registerRecipe(new ItemStack(RegistryBlocks.big_ardium_block,1,0), new ItemStack(RegistryBlocks.ardium_block,1,0), new ItemStack(Items.sugar,1,0), new ItemStack(RegistryBlocks.ardium_block,1,0), new ItemStack(RegistryBlocks.big_ardium_block,1,0), new ItemStack(RegistryItems.speed_stone,1,0));
	registerRecipe(new ItemStack(RegistryBlocks.big_ardium_block,1,0), new ItemStack(RegistryBlocks.ardium_block,1,0), new ItemStack(Items.slime_ball,1,0), new ItemStack(RegistryBlocks.ardium_block,1,0), new ItemStack(RegistryBlocks.big_ardium_block,1,0), new ItemStack(RegistryItems.jump_stone,1,0));
	registerRecipe(new ItemStack(RegistryBlocks.big_ardium_block,1,0), new ItemStack(RegistryBlocks.ardium_block,1,0), new ItemStack(Items.fire_charge,1,0), new ItemStack(RegistryBlocks.ardium_block,1,0), new ItemStack(RegistryBlocks.big_ardium_block,1,0), new ItemStack(RegistryItems.fire_stone,1,0));
	registerRecipe(new ItemStack(RegistryBlocks.ardium_block,1,0), new ItemStack(RegistryBlocks.ardium_block,1,0), new ItemStack(RegistryBlocks.ardium_block,1,0), new ItemStack(RegistryBlocks.ardium_block,1,0), new ItemStack(RegistryBlocks.ardium_block,1,0), new ItemStack(RegistryBlocks.big_ardium_block,1,0));
	registerRecipe(new ItemStack(Items.iron_ingot,1,0), new ItemStack(Items.iron_ingot,1,0), new ItemStack(Blocks.glowstone,1,0), new ItemStack(Items.iron_ingot,1,0), new ItemStack(Items.iron_ingot,1,0), new ItemStack(RegistryBlocks.lanternPhys,1,0));


}
	



public void registerRecipe(ItemStack stack1, ItemStack stack2, ItemStack stack3, ItemStack stack4, ItemStack stack5, ItemStack stack)
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

public static ExtractorRecipies crafting()
{
  return craftingBase;
}
}
