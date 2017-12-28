package fr.ardium.mod.armors;

import fr.ardium.mod.Ardium;
import fr.ardium.mod.StackUntil;
import fr.ardium.mod.items.RegistryItems;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArdiumArmor 
extends ItemArmor
{

	public ItemArdiumArmor(ArmorMaterial material, int p_i45325_3_) {
		super(material, 0, p_i45325_3_);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(slot == 2)
		{
			return Ardium.MODID + ":textures/models/armor/ardium_layer_2.png";
		}
		return Ardium.MODID + ":textures/models/armor/ardium_layer_1.png";
	}

public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
{
  return StackUntil.equalsWildcard(getRepairStack(), stack2) ? true : super.getIsRepairable(stack1, stack2);
}

		public  ItemStack getRepairStack()
		{
		  if ((getArmorMaterial() == RegistryArmors.Ardium)){
		    return new ItemStack(RegistryItems.ardium_ingot, 1, 0);
		  }

		  return new ItemStack(getArmorMaterial().func_151685_b());
			
		}

	}

