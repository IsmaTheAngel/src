package fr.ardium.mod.tile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerFertilizer extends Container
{
	  private TileEntityFertilizer tile;
	private int i;

	  
	  public ContainerFertilizer(TileEntityFertilizer tile, InventoryPlayer inventory)
	  {
	    this.tile = tile;
	    addSlotToContainer(new Slot(tile, 0 ,52, 92));
	    addSlotToContainer(new Slot(tile, 1, 52, 110));
	    addSlotToContainer(new Slot(tile, 2, 89, 92));
	    addSlotToContainer(new Slot(tile, 3, 125, 92));
	    addSlotToContainer(new Slot(tile, 4, 125, 110));
	    
	    addSlotToContainer(new SlotResult(tile, 5, 89, 131));
	    bindPlayerInventory(inventory);
	  }
	  
	 


	
	  private void bindPlayerInventory(InventoryPlayer inventory)
	  {
	    for (int i = 0; i < 3; i++) {
	      for (int j = 0; j < 9; j++) {
	        addSlotToContainer(new Slot(inventory, j + i * 9 + 9, 17 + j * 18, 171 + i * 18));
	      }
	    }
	    for (i = 0; i < 9; i++) {
	      addSlotToContainer(new Slot(inventory, i, 17 + i * 18, 229));
	    }
	  }
	  
	  
	  public ItemStack transferStackInSlot(EntityPlayer player, int slot)
	  {
	    ItemStack stack = null;
	    Slot slots = (Slot)this.inventorySlots.get(slot);
	    if ((slots != null) && (slots.getHasStack()))
	    {
	      ItemStack stack1 = slots.getStack();
	      stack = stack1.copy();
	      if (slot < 2)
	      {
	        if (!mergeItemStack(stack1, 3, 38, true)) {
	          return null;
	        }
	        slots.onSlotChange(stack1, stack);
	      }
	      if ((slot >= 2) && 
	        (!mergeItemStack(stack1, 0, 1, true))) {
	        return null;
	      }
	      if (stack1.stackSize == 0) {
	        slots.putStack((ItemStack)null);
	      } else {
	        slots.onSlotChanged();
	      }
	      if (stack1.stackSize == stack.stackSize) {
	        return null;
	      }
	      slots.onPickupFromSlot(player, stack1);
	    }
	    return stack;
	  }
	  
	  public void onContainerClosed(EntityPlayer player)
	  {
	    super.onContainerClosed(player);
	    this.tile.closeInventory();
	  }
	  
	  public boolean canInteractWith(EntityPlayer player)
	  {
	    return this.tile.isUseableByPlayer(player);
	  }
	}

