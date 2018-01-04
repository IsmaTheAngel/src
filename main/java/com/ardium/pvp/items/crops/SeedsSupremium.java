package com.ardium.pvp.items.crops;

import com.ardium.pvp.Ardium;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class SeedsSupremium extends ItemSeeds
{
	  public SeedsSupremium(Block p_i45352_1_, Block p_i45352_2_)
	  {
	    super(p_i45352_1_, p_i45352_2_);
	    this.maxStackSize = 64;
	    this.setTextureName("ardium:supremiumseed");
          setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);
	  }
	  

}