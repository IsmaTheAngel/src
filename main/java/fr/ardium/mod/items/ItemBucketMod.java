package fr.ardium.mod.items;

import fr.ardium.mod.Ardium;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBucket;

public class ItemBucketMod extends ItemBucket
{
	  public ItemBucketMod(Block block, String name, String texture)
	  {
	    super(block);
	    setUnlocalizedName(name);
	    setMaxStackSize(1);
	    setCreativeTab(Ardium.ArdiumCreativeTab);
	    setTextureName("ardium:" + texture);
	  }
	}