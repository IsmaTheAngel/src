package fr.ardium.mod.armors;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.ardium.mod.Ardium;
import fr.ardium.mod.render.ModelArdium3DArmor;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArdium3DArmor extends ItemArmor
{

	public ItemArdium3DArmor(ArmorMaterial material, int p_i45325_3_) {
		super(material, 0, p_i45325_3_);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	
		return Ardium.MODID + ":textures/models/armor/3D.png";
	}
public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
	{
		if(this.armorType == 0 )
		{
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 220, 0));
		}
		if(this.armorType == 1 )
		{
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 220, 0));
		}
		if(this.armorType == 2 )
		{
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 220, 0));
		}
		if(this.armorType == 3 )
		{
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 220, 0));
		}
		
	}
@SideOnly(Side.CLIENT)
public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot)
{
  return new ModelArdium3DArmor(armorSlot);
}


	}


