package com.ardium.pvp.armors;

import com.ardium.pvp.Ardium;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

class ItemOxiumArmor extends ItemArmor {

    public ItemOxiumArmor(ArmorMaterial armorMaterial, int armorType) {
        super (armorMaterial, 0, armorType);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if ( slot == 2 ) {
            return Ardium.MOD_ID + ":textures/models/armor/oxium_layer_2.png";
        }
        return Ardium.MOD_ID + ":textures/models/armor/oxium_layer_1.png";
    }

    public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {

        switch (armorType) {
            case 0:
                player.addPotionEffect (new PotionEffect (Potion.nightVision.id, 220, 1));
                break;
            case 1:
                player.addPotionEffect (new PotionEffect (Potion.damageBoost.id, 220, 0));
                break;
            case 2:
                player.addPotionEffect (new PotionEffect (Potion.digSpeed.id, 220, 1));
                break;
            case 3:
                player.addPotionEffect (new PotionEffect (Potion.moveSpeed.id, 220, 1));
                break;
        }
    }


}
