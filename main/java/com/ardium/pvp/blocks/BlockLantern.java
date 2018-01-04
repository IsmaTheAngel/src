package com.ardium.pvp.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

class BlockLantern extends Block
{
	  public BlockLantern()
	  {
	    super(Material.air);
	    setLightLevel(1.0F);
	    setHardness(0.1F);
	    setBlockBounds(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
	    setTickRandomly(true);
	  }
	  
	  public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	  {
	    return null;
	  }
	  
	  public boolean isOpaqueCube()
	  {
	    return false;
	  }
	  
	  public void updateTick(World w, int x, int y, int z, Random r)
	  {
	    if (w.getBlock(x, y, z) == RegistryBlocks.lantern) {
	      w.setBlock(x, y, z, Blocks.air);
	    }
	  }
	  
	  public boolean isAir(IBlockAccess world, int x, int y, int z)
	  {
          return world.getBlock (x, y, z).equals (this);
      }
	  
	  public int quantityDropped(Random random)
	  {
	    return 0;
	  }
	  
	  public int idPicked(int i, Random random, int j)
	  {
	    return 0;
	  }
	  
	  public int idDropped(int i, Random random, int j)
	  {
	    return 0;
	  }

}

