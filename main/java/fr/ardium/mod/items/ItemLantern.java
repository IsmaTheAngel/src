package fr.ardium.mod.items;



import fr.ardium.mod.Ardium;
import fr.ardium.mod.blocks.RegistryBlocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemLantern extends Item
{
	  String texture;
	  
	  public ItemLantern(String texture)
	  {
	    setCreativeTab(Ardium.ArdiumCreativeTab);
	    this.canRepair = false;
	    setMaxStackSize(1);
	    setMaxDamage(32);
	    this.texture = texture;
	  }
	  
	  public void onUpdate(ItemStack i, World w, Entity e, int slot, boolean par5)
	  {
	    if ((e instanceof EntityPlayer))
	    {
	      EntityPlayer p = (EntityPlayer)e;
	      ItemStack blah = new ItemStack(RegistryItems.itemLantern, 1);
	      if ((slot >= 0) && (i.equals(blah))) {
	        p.inventory.mainInventory[slot] = new ItemStack(RegistryItems.itemLantern, 1);
	      }
	    }
	  }
	  
	  public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	  {
	    if (!par3World.getBlock(par4, par5, par6).equals(Blocks.snow))
	    {
	      if (par7 == 0) {
	        par5--;
	      }
	      if (par7 == 1) {
	        par5++;
	      }
	      if (par7 == 2) {
	        par6--;
	      }
	      if (par7 == 3) {
	        par6++;
	      }
	      if (par7 == 4) {
	        par4--;
	      }
	      if (par7 == 5) {
	        par4++;
	      }
	      if (par3World.getBlock(par4, par5, par6) != Blocks.air) {
	        return false;
	      }
	    }
	    if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack)) {
	      return false;
	    }
	    if (RegistryBlocks.lanternPhys.canPlaceBlockAt(par3World, par4, par5, par6))
	    {
	      par1ItemStack.stackSize -= 1;
	      par3World.setBlock(par4, par5, par6, RegistryBlocks.lanternPhys);
	    }
	    return true;
	  }
	}
