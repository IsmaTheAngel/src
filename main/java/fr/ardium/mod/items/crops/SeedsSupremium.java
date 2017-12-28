package fr.ardium.mod.items.crops;

import fr.ardium.mod.Ardium;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class SeedsSupremium extends ItemSeeds
{
	  public SeedsSupremium(Block p_i45352_1_, Block p_i45352_2_)
	  {
	    super(p_i45352_1_, p_i45352_2_);
	    this.maxStackSize = 64;
	    this.setTextureName("ardium:supremiumseed");
	    setCreativeTab(Ardium.ArdiumCreativeTab);
	  }
	  

}