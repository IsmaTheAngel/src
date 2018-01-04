package com.ardium.pvp.items.crops;

import com.ardium.pvp.Ardium;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import java.util.List;

public class ItemCropEssencesT1 extends Item {
    private static final String[] field_150923_a = {"iron", "coal", "lapis"};
    private static final String[] field_150921_b = {"essence_iron", "essence_coal", "essence_lapis"};
    @SideOnly(Side.CLIENT)
    private IIcon[] field_150920_d;

    public ItemCropEssencesT1() {
        setUnlocalizedName ("CropEssences");
        setHasSubtypes (true);
        setMaxDamage (0);
        setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int damage) {
        int j = MathHelper.clamp_int (damage, 0, 2);
        return this.field_150920_d[j];
    }

    public String getUnlocalizedName(ItemStack itemStack) {
        int i = MathHelper.clamp_int (itemStack.getItemDamage (), 0, 2);
        return super.getUnlocalizedName () + "." + field_150923_a[i];
    }

    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs creativeTabs, List list) {
        for (int i = 0; i < 3; i++) {
            list.add (new ItemStack (item, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconsRegister) {
        this.field_150920_d = new IIcon[field_150921_b.length];
        for (int i = 0; i < field_150921_b.length; i++) {
            this.field_150920_d[i] = iconsRegister.registerIcon (Ardium.MOD_ID + ":" + field_150921_b[i]);
        }
    }
}
