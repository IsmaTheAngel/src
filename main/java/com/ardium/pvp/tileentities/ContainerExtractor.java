package com.ardium.pvp.tileentities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

class ContainerExtractor extends Container
{
	  private TileExtractor tile;

	public ContainerExtractor(TileExtractor tile, InventoryPlayer inventory)
	  {
	    this.tile = tile;
	    addSlotToContainer(new Slot(tile, 0 ,22, 101));
	    addSlotToContainer(new Slot(tile, 1, 60, 101));
	    addSlotToContainer(new Slot(tile, 2, 41, 120));
	    addSlotToContainer(new Slot(tile, 3, 22, 139));
	    addSlotToContainer(new Slot(tile, 4, 60, 139));
	    
	    addSlotToContainer(new SlotResult(tile, 5, 136, 120));
	    bindPlayerInventory(inventory);
	  }
	  
	 


	
	  private void bindPlayerInventory(InventoryPlayer inventory)
	  {
	    for (int i = 0; i < 3; i++) {
	      for (int j = 0; j < 9; j++) {
	        addSlotToContainer(new Slot(inventory, j + i * 9 + 9, 17 + j * 18, 171 + i * 18));
	      }
	    }
		  int i1;
		  for (i1 = 0; i1 < 9; i1++) {
			  addSlotToContainer (new Slot (inventory, i1, 17 + i1 * 18, 229));
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
			  slots.putStack (null);
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
