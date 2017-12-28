package fr.ardium.mod.tile;

import fr.ardium.mod.items.ItemBackpack;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotBackpack extends Slot {
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

