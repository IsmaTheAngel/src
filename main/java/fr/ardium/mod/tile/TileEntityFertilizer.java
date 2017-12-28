package fr.ardium.mod.tile;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.ardium.mod.recipies.FertilizerRecipies;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityFertilizer extends TileEntity
implements IInventory
{
private ItemStack[] contents = new ItemStack[6];
private int workingTime = 0;
private int workingTimeNeeded = 150;

public void writeToNBT(NBTTagCompound compound)
{
  super.writeToNBT(compound);
  NBTTagList nbttaglist = new NBTTagList();
  for (int i = 0; i < this.contents.length; i++) {
    if (this.contents[i] != null)
    {
      NBTTagCompound nbttagcompound1 = new NBTTagCompound();
      nbttagcompound1.setByte("Slot", (byte)i);
      this.contents[i].writeToNBT(nbttagcompound1);
      nbttaglist.appendTag(nbttagcompound1);
    }
  }
  compound.setTag("Items", nbttaglist);
  compound.setShort("workingTime", (short)this.workingTime);
  compound.setShort("workingTimeNeeded", (short)this.workingTimeNeeded);
}

@SideOnly(Side.CLIENT)
public int getCookProgress()
{
  return this.workingTime * 16 / this.workingTimeNeeded;
}

public void readFromNBT(NBTTagCompound compound)
{
  super.readFromNBT(compound);
  
  NBTTagList nbttaglist = compound.getTagList("Items", 10);
  this.contents = new ItemStack[getSizeInventory()];
  for (int i = 0; i < nbttaglist.tagCount(); i++)
  {
    NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
    int j = nbttagcompound1.getByte("Slot") & 0xFF;
    if ((j >= 0) && (j < this.contents.length)) {
      this.contents[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
    }
  }
  this.workingTime = compound.getShort("workingTime");
  this.workingTimeNeeded = compound.getShort("workingTimeNeeded");
}

public int getSizeInventory()
{
  return this.contents.length;
}

public ItemStack getStackInSlot(int slotIndex)
{
  return this.contents[slotIndex];
}

public ItemStack decrStackSize(int slotIndex, int amount)
{
  if (this.contents[slotIndex] != null)
  {
    if (this.contents[slotIndex].stackSize <= amount)
    {
      ItemStack itemstack = this.contents[slotIndex];
      this.contents[slotIndex] = null;
      markDirty();
      return itemstack;
    }
    ItemStack itemstack = this.contents[slotIndex].splitStack(amount);
    if (this.contents[slotIndex].stackSize == 0) {
      this.contents[slotIndex] = null;
    }
    markDirty();
    return itemstack;
  }
  return null;
}

public ItemStack getStackInSlotOnClosing(int slotIndex)
{
  if (this.contents[slotIndex] != null)
  {
    ItemStack itemstack = this.contents[slotIndex];
    this.contents[slotIndex] = null;
    return itemstack;
  }
  return null;
}

public void setInventorySlotContents(int slotIndex, ItemStack stack)
{
  this.contents[slotIndex] = stack;
  if ((stack != null) && (stack.stackSize > getInventoryStackLimit())) {
    stack.stackSize = getInventoryStackLimit();
  }
  markDirty();
}

public String getInventoryName()
{
  return "tileentity.ScientificMachine";
}

public boolean hasCustomInventoryName()
{
  return false;
}

public int getInventoryStackLimit()
{
  return 64;
}

public boolean isUseableByPlayer(EntityPlayer player)
{
  return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) == this;
}

public void openInventory() {}

public void closeInventory() {}

public boolean isItemValidForSlot(int slot, ItemStack stack)
{
  return slot != 5;
}

public boolean isBurning()
{
  return this.workingTime > 0;
}

private boolean canSmelt()
{
  if ((this.contents[0] == null) || (this.contents[1] == null) || (this.contents[2] == null) || (this.contents[3] == null) || (this.contents[4] == null)) {
    return false;
  }
  ItemStack itemstack = FertilizerRecipies.crafting().getSmeltingResult(new ItemStack[] { this.contents[0], this.contents[1], this.contents[2], this.contents[3], this.contents[4] });
  if (itemstack == null) {
    return false;
  }
  if (this.contents[5] == null) {
    return true;
  }
  if (!this.contents[5].isItemEqual(itemstack)) {
    return false;
  }
  int result = this.contents[5].stackSize + itemstack.stackSize;
  return (result <= getInventoryStackLimit()) && (result <= this.contents[5].getMaxStackSize());
}

public void updateEntity()
{
  if ((isBurning()) && (canSmelt())) {
    this.workingTime += 1;
  }
  if ((canSmelt()) && (!isBurning())) {
    this.workingTime = 1;
  }
  if ((canSmelt()) && (this.workingTime == this.workingTimeNeeded))
  {
    smeltItem();
    this.workingTime = 0;
  }
  if (!canSmelt()) {
    this.workingTime = 0;
  }
}

public void smeltItem()
{
  if (canSmelt())
  {
    ItemStack itemstack = FertilizerRecipies.crafting().getSmeltingResult(new ItemStack[] { this.contents[0], this.contents[1], this.contents[2], this.contents[3], this.contents[4] });
    if (this.contents[5] == null) {
      this.contents[5] = itemstack.copy();
    } else if (this.contents[5].getItem() == itemstack.getItem()) {
      this.contents[5].stackSize += itemstack.stackSize;
    }
    this.contents[0].stackSize -= 1;
    this.contents[1].stackSize -= 1;
    this.contents[2].stackSize -= 1;
    this.contents[3].stackSize -= 1;
    this.contents[4].stackSize -= 1;
    if (this.contents[0].stackSize <= 0) {
      this.contents[0] = null;
    }
    if (this.contents[1].stackSize <= 0) {
      this.contents[1] = null;
    }
    if (this.contents[2].stackSize <= 0) {
      this.contents[2] = null;
    }
    if (this.contents[3].stackSize <= 0) {
      this.contents[3] = null;
    }
    if (this.contents[4].stackSize <= 0) {
      this.contents[4] = null;
    }
  }
}
}

