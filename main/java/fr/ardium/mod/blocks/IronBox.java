package fr.ardium.mod.blocks;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

import fr.ardium.mod.items.RegistryItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class IronBox extends Block {

	protected IronBox(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	}
	 public Item getItemDropped(int par1, Random par2Random, int par3)
	  {
	    return Item.getItemFromBlock(Blocks.air);
	  }

	  public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
	  {
	    ArrayList<ItemStack> stack = super.getDrops(world, x, y, z, metadata, fortune);
	    int randInt = world.rand.nextInt(14);
	    switch (randInt)
	    {
	    case 0: 
	      stack.add(new ItemStack(RegistryItems.ardium_ingot,1));
	      break;
	    case 1: 
	      stack.add(new ItemStack(Items.poisonous_potato, 1));
	      break;
	    case 2: 
	      stack.add(new ItemStack(RegistryItems.ardium_ingot, 1));
	      break;
	    case 3: 
	      stack.add(new ItemStack(Blocks.jukebox, 1));
	      break;
	    case 4: 
	      stack.add(new ItemStack(RegistryItems.ardium_ingot, 1));
	      break;
	    case 5: 
	      stack.add(new ItemStack(Blocks.coal_block, 1));
	      break;
	    case 6: 
	    stack.add(new ItemStack(Blocks.coal_block, 1));
		      break;
	    case 7: 
		    stack.add(new ItemStack(Blocks.coal_block, 1));
			      break;
	    case 8: 
		    stack.add(new ItemStack(Blocks.coal_block, 1));
			      break;
	    case 9: 
		    stack.add(new ItemStack(Blocks.coal_block, 1));
			      break;
	    case 10: 
		    stack.add(new ItemStack(Blocks.coal_block, 1));
			      break;
	    case 11: 
		    stack.add(new ItemStack(Blocks.coal_block, 1));
			      break;
	    case 12: 
		    stack.add(new ItemStack(Blocks.coal_block, 1));
			      break;
	    case 13: 
		    stack.add(new ItemStack(Blocks.coal_block, 1));
			      break;
	    case 14: 
		    stack.add(new ItemStack(Blocks.coal_block, 1));
			      break;
	    case 15: 
		    stack.add(new ItemStack(Blocks.coal_block, 1));
			      break;
	    case 16: 
		    stack.add(new ItemStack(Blocks.coal_block, 1));
			      break;
	    case 17: 
		    stack.add(new ItemStack(Blocks.coal_block, 1));
			      break;
	    case 18: 
		    stack.add(new ItemStack(Blocks.coal_block, 1));
			      break;
	    case 19: 
		    stack.add(new ItemStack(Blocks.coal_block, 1));
			      break;
	    case 20: 
		    stack.add(new ItemStack(Blocks.coal_block, 1));
			      break;
	    case 21: 
		    stack.add(new ItemStack(Blocks.coal_block, 1));
			      break;
	    case 22: 
		    stack.add(new ItemStack(Blocks.coal_block, 1));
			      break;
	    case 23: 
		    stack.add(new ItemStack(Blocks.coal_block, 1));
			      break;
	    case 24: 
		    stack.add(new ItemStack(Blocks.coal_block, 1));
			      break;
	    case 25: 
		    stack.add(new ItemStack(Blocks.coal_block, 1));
			      break;
			      
			      
	    }
	    return stack;
	  }
	  
}

// Loots :
// 4% de gagner 5 blocs d'ardium
// 10% de gagner 2 blocs d'ardium
// 20% de gagner 8 blocs de fer
// 28% de gagner 4 blocs de fer
// 38% de gagner 64 charbons