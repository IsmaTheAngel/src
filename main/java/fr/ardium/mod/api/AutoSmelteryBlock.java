package fr.ardium.mod.api;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class AutoSmelteryBlock extends BlockContainer
{
	  public AutoSmelteryBlock()
	  {
	    super(Material.iron);
	  }
	  
	  public TileEntity createNewTileEntity(World world, int meta)
	  {
	    return new TileEntityAutoSmeltery();
	  }
	}
