package com.ardium.pvp.items.crops;

import com.ardium.pvp.Ardium;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class SeedInferium extends ItemSeeds
{
    public SeedInferium(Block block, Block block1)
	  {
          super (block, block1);
	    this.maxStackSize = 64;
	    this.setTextureName("ardium:inferiumseed");
          setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);
	  }
	  

}