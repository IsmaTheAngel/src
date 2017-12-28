package fr.ardium.mod.items.crops;

import fr.ardium.mod.Ardium;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class SeedEarth extends ItemSeeds
{
	  public SeedEarth(Block p_i45352_1_, Block p_i45352_2_)
	  {
	    super(p_i45352_1_, p_i45352_2_);
	    this.maxStackSize = 64;
	    this.setTextureName("ardium:earthseed");
	    setCreativeTab(Ardium.ArdiumCreativeTab);
	  }
	  
	  
	}
