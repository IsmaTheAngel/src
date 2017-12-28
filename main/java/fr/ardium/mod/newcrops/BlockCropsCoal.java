package fr.ardium.mod.newcrops;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.init.Blocks;

public class BlockCropsCoal extends BlockCrops {

	 protected boolean canPlaceBlockOn(Block p_149854_1_)
	    {
	        return p_149854_1_ == Blocks.diamond_block;
	    }
	
	
	
}
