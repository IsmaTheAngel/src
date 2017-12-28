package fr.ardium.mod.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.ardium.mod.items.RegistryItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class BlockOxiumBush extends Block
implements IPlantable
{
public IIcon[] fastIcons;
public IIcon[] fancyIcons;
public String[] textureNames;
public IIcon icon;
public Item item;

public BlockOxiumBush(Item item)
{
  super(Material.leaves);
  setTickRandomly(true);
  setHardness(0.0F);
  setBlockName("obush");
  setStepSound(soundTypeGrass);
  setCreativeTab(fr.ardium.mod.Ardium.ArdiumCreativeTab);
  disableStats();
  setTickRandomly(true);
  
  
  this.item = item;
  
  this.textureNames = new String[2];
  this.textureNames[0] = "Oxium_Bush_1";
  this.textureNames[1] = "Oxium_Bush_2";
}

public int getLightOpacity()
{
  return 0;
}
public boolean isOpaqueCube()
{
	  return false;
}


public boolean renderAsNormalBlock()
{
  return false;
}

public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player)
{
  if (!world.isRemote)
  {
    int meta = world.getBlockMetadata(x, y, z);
    if (meta > 1)
    {
      world.setBlock(x, y, z, this, 0, 3);
      world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(this.item)));
    }
  }
}

public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
{
  int meta = world.getBlockMetadata(x, y, z);
  if (meta >= 1)
  {
    if (world.isRemote) {
      return true;
    }
    world.setBlock(x, y, z, this, 0, 3);
    world.spawnEntityInWorld(new EntityItem(world, player.posX, player.posY, player.posZ, new ItemStack(RegistryItems.oxium_ingot)));
    return true;
  }
  return false;
}

public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
{
  return Item.getItemFromBlock(RegistryBlocks.oxium_bush);
}

public void updateTick(World world, int x, int y, int z, Random random1)
{
  if (world.isRemote) {
    return;
  }
  if (random1.nextInt(20) == 0)
  {
    int meta = world.getBlockMetadata(x, y, z);
    if (meta < 2) {
      world.setBlock(x, y, z, this, meta + 1, 3);
    }
  }
}

public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z)
{
  return EnumPlantType.Cave;
}

public Block getPlant(IBlockAccess world, int x, int y, int z)
{
  return this;
}

public int getPlantMetadata(IBlockAccess world, int x, int y, int z)
{
  return world.getBlockMetadata(x, y, z);
}

@SideOnly(Side.CLIENT)
public void registerBlockIcons(IIconRegister icon)
{
  this.fastIcons = new IIcon[2];
  this.fancyIcons = new IIcon[2];
  for (int i = 0; i < this.fastIcons.length; i++) {
    if (this.textureNames[i] != "")
    {
      this.fancyIcons[i] = icon.registerIcon("ardium:" + this.textureNames[i] + "_Fancy");
      this.fastIcons[i] = icon.registerIcon("ardium:" + this.textureNames[i] + "_Fast");
      this.icon = icon.registerIcon("ardium:Oxium_Bush_2_Fast");
    }
  }
}

@SideOnly(Side.CLIENT)
public IIcon getIcon(int side, int metadata)
{
  if (metadata < 2) {
    return this.fancyIcons[metadata];
  }
  return this.icon;
}

public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int x, int y, int z, int meta)
{
  if (meta > 1) {
    return super.shouldSideBeRendered(iblockaccess, x, y, z, meta);
  }
  return true;
}



}

