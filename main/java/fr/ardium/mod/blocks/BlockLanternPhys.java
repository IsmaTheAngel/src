package fr.ardium.mod.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.ardium.mod.items.RegistryItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BlockLanternPhys extends Block
{
	  String texture;
	  
	  public BlockLanternPhys(String texture)
	  {
	    super(Material.ground);
	    setLightLevel(1.0F);
	    setHardness(0.1F);
	    this.texture = texture;
	    float f = 0.4F;
	    setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
	    setTickRandomly(true);
	  }
	  
	  public AxisAlignedBB getCollisionBoundingBoxFromPool(World w, int x, int y, int z)
	  {
	    setBlockBoundsBasedOnState(w, x, y, z);
	    return super.getCollisionBoundingBoxFromPool(w, x, y, z);
	  }
	  
	  public boolean renderAsNormalBlock()
	  {
	    return false;
	  }
	  
	  public boolean isOpaqueCube()
	  {
	    return false;
	  }
	  
	  public int getRenderType()
	  {
	    return 1;
	  }
	  
	  public Item getItemDropped(int i, Random random, int j)
	  {
	    return RegistryItems.itemLantern;
	  }
	  
	  @SideOnly(Side.CLIENT)
	  public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
	  {
	    return new ItemStack(RegistryItems.itemLantern);
	  }
	}
