package fr.ardium.mod.armors;

import fr.ardium.mod.Ardium;
import fr.ardium.mod.StackUntil;
import fr.ardium.mod.items.RegistryItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemOxiumArmor extends ItemArmor
{

	public ItemOxiumArmor(ArmorMaterial material, int p_i45325_3_) {
		super(material, 0, p_i45325_3_);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(slot == 2)
		{
			return Ardium.MODID + ":textures/models/armor/oxium_layer_2.png";
		}
		return Ardium.MODID + ":textures/models/armor/oxium_layer_1.png";
	}
public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
	{
		if(this.armorType == 0 )
		{
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 220, 1));
		}
		if(this.armorType == 1 )
		{
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 220, 0));
		}
		if(this.armorType == 2 )
		{
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 220, 1));
		}
		if(this.armorType == 3 )
		{
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 220, 1));
		}
	}

		

	}
