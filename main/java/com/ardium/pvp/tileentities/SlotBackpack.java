package com.ardium.pvp.tileentities;

import com.ardium.pvp.items.ItemBackpack;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

class SlotBackpack extends Slot {
	public SlotBackpack(IInventory inv, int index, int x, int y) {
		super(inv, index, x, y);
	}

	/**
	 * Method used to prevent backpack-ception (backpacks inside backpacks)
	 */
	@Override
	public boolean isItemValid(ItemStack stack) {
		return !(stack.getItem() instanceof ItemBackpack);
	}
}

