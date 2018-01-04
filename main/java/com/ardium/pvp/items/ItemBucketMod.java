package com.ardium.pvp.items;

import com.ardium.pvp.Ardium;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBucket;

public class ItemBucketMod extends ItemBucket
{
	  public ItemBucketMod(Block block, String name, String texture)
	  {
	    super(block);
	    setUnlocalizedName(name);
	    setMaxStackSize(1);
          setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);
	    setTextureName("ardium:" + texture);
	  }
	}