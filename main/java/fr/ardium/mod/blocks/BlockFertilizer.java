package fr.ardium.mod.blocks;

import fr.ardium.mod.Ardium;
import fr.ardium.mod.tile.TileEntityFertilizer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockFertilizer extends BlockContainer
{
	  private IIcon autreface;
	  
	  public BlockFertilizer()
	  {
	    super(Material.rock);
	    setResistance(8.0F);
	    setHarvestLevel("pickaxe", 2);
	    setCreativeTab(Ardium.ArdiumCreativeTab);
	    setHardness(10.0F);
	  }
	  
	
	    
		  public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
		  {
			  
			      if (!world.isRemote) {
		    player.openGui(Ardium.instance, 36, world, x, y, z);
			      }
			      return true;
			    }
			    
	  
	  
	  public void breakBlock(World world, int x, int y, int z, Block block, int metadata)
	  {
	    TileEntity tileentity = world.getTileEntity(x, y, z);
	    if ((tileentity instanceof IInventory))
	    {
	      IInventory inv = (IInventory)tileentity;
	      for (int i1 = 0; i1 < inv.getSizeInventory(); i1++)
	      {
	        ItemStack itemstack = inv.getStackInSlot(i1);
	        if (itemstack != null)
	        {
	          float f = world.rand.nextFloat() * 0.8F + 0.1F;
	          float f1 = world.rand.nextFloat() * 0.8F + 0.1F;
	          EntityItem entityitem;
	          for (float f2 = world.rand.nextFloat() * 0.8F + 0.1F; itemstack.stackSize > 0; world
	                .spawnEntityInWorld(entityitem))
	          {
	            int j1 = world.rand.nextInt(21) + 10;
	            if (j1 > itemstack.stackSize) {
	              j1 = itemstack.stackSize;
	            }
	            itemstack.stackSize -= j1;
	            
	            entityitem = new EntityItem(world, x + f, y + f1, z + f2, new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));
	            float f3 = 0.05F;
	            entityitem.motionX = ((float)world.rand.nextGaussian() * f3);
	            entityitem.motionY = ((float)world.rand.nextGaussian() * f3 + 0.2F);
	            entityitem.motionZ = ((float)world.rand.nextGaussian() * f3);
	            if (itemstack.hasTagCompound()) {
	              entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
	            }
	          }
	        }
	      }
	      world.func_147453_f(x, y, z, block);
	    }
	  }
	  
	 
	  
	  public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
	  {
	    return new TileEntityFertilizer();
	  }
	  
	  public boolean hasTileEntity()
	  {
	    return true;
	  }
	  
	  public void registerBlockIcons(IIconRegister iiconRegister)
	  {
	    this.blockIcon = iiconRegister.registerIcon("ardium:ardium_block");
	    this.autreface = iiconRegister.registerIcon("ardium:fertilizer_front");
	  }
	  
	  public IIcon getIcon(int side, int metadata)
	  {
	    if ((metadata == 0) && (side == 3)) {
	      return this.autreface;
	    }
	    return side != metadata ? this.blockIcon : this.autreface;
	  }
	  
	  public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
	  {
	    super.onBlockPlacedBy(world, x, y, z, entity, stack);
	    
	    byte b0 = 4;
	    b0 = rotateBlock(b0, entity);
	    world.setBlockMetadataWithNotify(x, y, z, b0, 2);
	  }
	  
	  public byte rotateBlock(byte b0, EntityLivingBase entity)
	  {
	    if (((entity.rotationYaw >= 135.0F) && (entity.rotationYaw <= 181.0F)) || ((entity.rotationYaw <= -135.0F) && (entity.rotationYaw >= -181.0F)))
	    {
	      b0 = 3;
	    }
	    else if ((entity.rotationYaw > -135.0F) && (entity.rotationYaw < -45.0F))
	    {
	      b0 = 4;
	    }
	    else if ((entity.rotationYaw >= -45.0F) && (entity.rotationYaw <= 45.0F))
	    {
	      b0 = 2;
	    }
	    else if ((entity.rotationYaw > 45.0F) && (entity.rotationYaw < 135.0F))
	    {
	      b0 = 5;
	    }
	    else if (entity.rotationYaw >= 181.0F)
	    {
	      entity.rotationYaw -= 360.0F;
	      b0 = rotateBlock(b0, entity);
	    }
	    else if (entity.rotationYaw <= -181.0F)
	    {
	      entity.rotationYaw += 360.0F;
	      b0 = rotateBlock(b0, entity);
	    }
	    return b0;
	  }
	}
