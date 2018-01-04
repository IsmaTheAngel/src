package com.ardium.pvp.items.crops;

import com.ardium.pvp.Ardium;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class SeedCertus extends ItemSeeds
{
	  public SeedCertus(Block p_i45352_1_, Block p_i45352_2_,String texture)
	  {
	    super(p_i45352_1_, p_i45352_2_);
	    this.maxStackSize = 64;
	    this.setTextureName("ardium:"+texture);
          setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);
	  }
	  
	  
	}