package fr.ardium.mod.api;

import mantle.blocks.abstracts.MultiItemBlock;
import net.minecraft.block.Block;

public class ArcSmelteryItemBlock extends MultiItemBlock
{
	  public static final String[] blockTypes = { "controller", "drain", "brick" };
	  
	  public ArcSmelteryItemBlock(Block b)
	  {
	    super(b, "tile.arc.smeltery", blockTypes);
	  }
	}
