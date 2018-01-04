package com.ardium.pvp.blocks;

import com.ardium.pvp.items.RegistryItems;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

class BlockDarkOakDoor extends BlockDoor {

	public BlockDarkOakDoor(Material p_i45402_1_) {
		super(p_i45402_1_);
		// TODO Auto-generated constructor stub
	}
	 public Item getItemDropped(int par1, Random par2Random, int par3)
	  {
	    return Item.getItemFromBlock(Blocks.air);
	  }
	 public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
	  {
	    ArrayList<ItemStack> stack = super.getDrops(world, x, y, z, metadata, fortune);
	    int randInt = world.rand.nextInt(11);
	    switch (randInt)
	    {
	    case 0: 
	      stack.add(new ItemStack(RegistryItems.dark_oak_door,1));

	    }
	    return stack;
	  }
	}