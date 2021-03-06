package fr.ardium.mod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArdiumApple  extends ItemFood
{
	public ItemArdiumApple(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
	}
		
		 @SideOnly(Side.CLIENT)
		    public boolean hasEffect(ItemStack p_77636_1_)
		    {
		        return true;
		    }


		 public void onFoodEaten(ItemStack items, World world, EntityPlayer player)
		  {
		    player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 1200, 4));
		    player.addPotionEffect(new PotionEffect(Potion.heal.id, 1, 10));
		    player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 2400, 0));
		    player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 2400, 0));
		    player.setAbsorptionAmount(5.0F);
		  }
}
