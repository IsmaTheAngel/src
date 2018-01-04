package com.ardium.pvp.items;

import com.ardium.pvp.Ardium;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

@SuppressWarnings("JavaDoc")
class ItemArdiumApple extends ItemAppleGold {
    public ItemArdiumApple(int healHungerAmount, float saturation, boolean canBeEatenByWolves) {
        super (healHungerAmount, saturation, canBeEatenByWolves);
        setUnlocalizedName ("ardium_apple");
        setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);
        setTextureName (Ardium.MOD_ID + ":" + getUnlocalizedName ().substring (5));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack itemStack, int metadata) {
        return true;
    }

    @Override
    public void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        entityPlayer.addPotionEffect (new PotionEffect (Potion.regeneration.id, 1200, 4));
        entityPlayer.addPotionEffect (new PotionEffect (Potion.heal.id, 1, 10));
        entityPlayer.addPotionEffect (new PotionEffect (Potion.damageBoost.id, 2400, 0));
        entityPlayer.addPotionEffect (new PotionEffect (Potion.moveSpeed.id, 2400, 0));
        entityPlayer.setAbsorptionAmount (5.0F);
    }

    @Override
    public EnumRarity getRarity(ItemStack itemStack) {
        return itemStack.getItem () instanceof ItemArdiumApple ? EnumRarity.epic : EnumRarity.common;
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs creativeTabs, List list) {
        list.add (new ItemStack (item, 1, 0));
    }
}
