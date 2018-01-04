package com.ardium.pvp.blocks;

import com.ardium.pvp.Ardium;
import com.ardium.pvp.tileentities.TileEntityArdiumFurnace;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class BlockArdiumFurnace extends BlockContainer {
    private static final String __OBFID = "CL_00000248";
    private static boolean field_149934_M;
    private final Random field_149933_a = new Random ();
    private final boolean field_149932_b;
    public String texture;
    @SideOnly(Side.CLIENT)
    private IIcon field_149935_N;
    @SideOnly(Side.CLIENT)
    private IIcon field_149936_O;

    BlockArdiumFurnace(boolean p_i45407_1_, String texture) {
        super (Material.rock);
        this.field_149932_b = p_i45407_1_;
    }

    public static void updateBlockState(boolean p_149931_0_, World world, int x, int y, int z) {
        int l = world.getBlockMetadata (x, y, z);
        TileEntity tileentity = world.getTileEntity (x, y, z);
        field_149934_M = true;
        if ( p_149931_0_ ) {
            world.setBlock (x, y, z, RegistryBlocks.ardium_furnace);
        } else {
            world.setBlock (x, y, z, RegistryBlocks.ardium_furnace);
        }
        field_149934_M = false;
        world.setBlockMetadataWithNotify (x, y, z, l, 2);
        if ( tileentity != null ) {
            tileentity.validate ();
            world.setTileEntity (x, y, z, tileentity);
        }
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return Item.getItemFromBlock (RegistryBlocks.ardium_furnace);
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        super.onBlockAdded (world, x, y, z);
        this.func_149930_e (world, x, y, z);
    }

    private void func_149930_e(World world, int x, int y, int z) {
        if ( !world.isRemote ) {
            Block block = world.getBlock (x, y, z - 1);
            Block block1 = world.getBlock (x, y, z + 1);
            Block block2 = world.getBlock (x - 1, y, z);
            Block block3 = world.getBlock (x + 1, y, z);
            byte b0 = 3;

            if ( block.func_149730_j () && !block1.func_149730_j () ) {
                b0 = 3;
            }

            if ( block1.func_149730_j () && !block.func_149730_j () ) {
                b0 = 2;
            }

            if ( block2.func_149730_j () && !block3.func_149730_j () ) {
                b0 = 5;
            }

            if ( block3.func_149730_j () && !block2.func_149730_j () ) {
                b0 = 4;
            }

            world.setBlockMetadataWithNotify (x, y, z, b0, 2);
        }
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
        return p_149691_1_ == 1 ? this.field_149935_N : (p_149691_1_ == 0 ? this.field_149935_N : (p_149691_1_ != p_149691_2_ ? this.blockIcon : this.field_149936_O));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_) {
        this.blockIcon = p_149651_1_.registerIcon (Ardium.MOD_ID + ":ardium_block");
        this.field_149936_O = p_149651_1_.registerIcon (this.field_149932_b ? Ardium.MOD_ID + ":furnace_front_off" :
                Ardium.MOD_ID + ":furnace_front_on");
        this.field_149935_N = p_149651_1_.registerIcon (Ardium.MOD_ID + ":ardium_block");
    }

    /**
     * Update which block the furnace is using depending on whether or not it is burning
     */
    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileEntityArdiumFurnace ();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {

        player.openGui (Ardium.instance, 5, world, x, y, z);
        return true;
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World p_149689_1_, int p_149689_2_, int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_, ItemStack p_149689_6_) {
        int l = MathHelper.floor_double ((double) (p_149689_5_.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if ( l == 0 ) {
            p_149689_1_.setBlockMetadataWithNotify (p_149689_2_, p_149689_3_, p_149689_4_, 2, 2);
        }

        if ( l == 1 ) {
            p_149689_1_.setBlockMetadataWithNotify (p_149689_2_, p_149689_3_, p_149689_4_, 5, 2);
        }

        if ( l == 2 ) {
            p_149689_1_.setBlockMetadataWithNotify (p_149689_2_, p_149689_3_, p_149689_4_, 3, 2);
        }

        if ( l == 3 ) {
            p_149689_1_.setBlockMetadataWithNotify (p_149689_2_, p_149689_3_, p_149689_4_, 4, 2);
        }

        if ( p_149689_6_.hasDisplayName () ) {
            ((TileEntityFurnace) p_149689_1_.getTileEntity (p_149689_2_, p_149689_3_, p_149689_4_)).func_145951_a (p_149689_6_.getDisplayName ());
        }
    }

    public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_) {
        if ( !field_149934_M ) {
            TileEntityArdiumFurnace TileEntityArdiumFurnace = (TileEntityArdiumFurnace) p_149749_1_.getTileEntity (p_149749_2_, p_149749_3_, p_149749_4_);

            if ( TileEntityArdiumFurnace != null ) {
                for (int i1 = 0; i1 < TileEntityArdiumFurnace.getSizeInventory (); ++i1) {
                    ItemStack itemstack = TileEntityArdiumFurnace.getStackInSlot (i1);

                    if ( itemstack != null ) {
                        float f = this.field_149933_a.nextFloat () * 0.8F + 0.1F;
                        float f1 = this.field_149933_a.nextFloat () * 0.8F + 0.1F;
                        float f2 = this.field_149933_a.nextFloat () * 0.8F + 0.1F;

                        while (itemstack.stackSize > 0) {
                            int j1 = this.field_149933_a.nextInt (21) + 10;

                            if ( j1 > itemstack.stackSize ) {
                                j1 = itemstack.stackSize;
                            }

                            itemstack.stackSize -= j1;
                            EntityItem entityitem = new EntityItem (p_149749_1_, (double) ((float) p_149749_2_ + f), (double) ((float) p_149749_3_ + f1), (double) ((float) p_149749_4_ + f2), new ItemStack (itemstack.getItem (), j1, itemstack.getItemDamage ()));

                            if ( itemstack.hasTagCompound () ) {
                                entityitem.getEntityItem ().setTagCompound ((NBTTagCompound) itemstack.getTagCompound ().copy ());
                            }

                            float f3 = 0.05F;
                            entityitem.motionX = (double) ((float) this.field_149933_a.nextGaussian () * f3);
                            entityitem.motionY = (double) ((float) this.field_149933_a.nextGaussian () * f3 + 0.2F);
                            entityitem.motionZ = (double) ((float) this.field_149933_a.nextGaussian () * f3);
                            p_149749_1_.spawnEntityInWorld (entityitem);
                        }
                    }
                }

                p_149749_1_.func_147453_f (p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_);
            }
        }

        super.breakBlock (p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_, p_149749_6_);
    }

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_) {
        if ( this.field_149932_b ) {
            int l = p_149734_1_.getBlockMetadata (p_149734_2_, p_149734_3_, p_149734_4_);
            float f = (float) p_149734_2_ + 0.5F;
            float f1 = (float) p_149734_3_ + 0.0F + p_149734_5_.nextFloat () * 6.0F / 16.0F;
            float f2 = (float) p_149734_4_ + 0.5F;
            float f3 = 0.52F;
            float f4 = p_149734_5_.nextFloat () * 0.6F - 0.3F;

            switch (l) {
                case 4:
                    p_149734_1_.spawnParticle ("smoke", (double) (f - f3), (double) f1, (double) (f2 + f4), 0.0D, 0.0D, 0.0D);
                    p_149734_1_.spawnParticle ("flame", (double) (f - f3), (double) f1, (double) (f2 + f4), 0.0D, 0.0D, 0.0D);
                    break;
                case 5:
                    p_149734_1_.spawnParticle ("smoke", (double) (f + f3), (double) f1, (double) (f2 + f4), 0.0D, 0.0D, 0.0D);
                    p_149734_1_.spawnParticle ("flame", (double) (f + f3), (double) f1, (double) (f2 + f4), 0.0D, 0.0D, 0.0D);
                    break;
                case 2:
                    p_149734_1_.spawnParticle ("smoke", (double) (f + f4), (double) f1, (double) (f2 - f3), 0.0D, 0.0D, 0.0D);
                    p_149734_1_.spawnParticle ("flame", (double) (f + f4), (double) f1, (double) (f2 - f3), 0.0D, 0.0D, 0.0D);
                    break;
                case 3:
                    p_149734_1_.spawnParticle ("smoke", (double) (f + f4), (double) f1, (double) (f2 + f3), 0.0D, 0.0D, 0.0D);
                    p_149734_1_.spawnParticle ("flame", (double) (f + f4), (double) f1, (double) (f2 + f3), 0.0D, 0.0D, 0.0D);
                    break;
            }
        }
    }

    /**
     * If this returns true, then comparators facing away from this block will use the value from
     * getComparatorInputOverride instead of the actual redstone signal strength.
     */
    public boolean hasComparatorInputOverride() {
        return true;
    }

    /**
     * If hasComparatorInputOverride returns true, the return value from this is used instead of the redstone signal
     * strength when this block inputs to a comparator.
     */
    public int getComparatorInputOverride(World p_149736_1_, int p_149736_2_, int p_149736_3_, int p_149736_4_, int p_149736_5_) {
        return Container.calcRedstoneFromInventory ((IInventory) p_149736_1_.getTileEntity (p_149736_2_, p_149736_3_, p_149736_4_));
    }

    /**
     * Gets an item for the block being called on. Args: world, x, y, z
     */
    @SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
        return Item.getItemFromBlock (RegistryBlocks.ardium_furnace);
    }
}