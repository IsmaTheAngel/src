package com.ardium.pvp.items.crops;

import com.ardium.pvp.Ardium;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import java.util.List;

public class ItemInfusedFragment extends Item {
    private static final String[] field_150923_a = {"weak", "regular", "strong", "extreme", "master"};
    private static final String[] field_150921_b = {"infusion_stone_0", "infusion_stone_1", "infusion_stone_2", "infusion_stone_3", "infusion_stone_4"};
    private static final String __OBFID = "CL_00000022";
    @SideOnly(Side.CLIENT)
    private IIcon[] field_150920_d;

    public ItemInfusedFragment() {
        setHasSubtypes (true);
        setMaxDamage (0);
        setCreativeTab (Ardium.ARDIUM_CREATIVE_TAB);
        setMaxStackSize (1);
    }

    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
        return false;
    }

    public ItemStack getContainerItem(ItemStack itemStack) {
        return itemStack.copy ();
    }

    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int par1) {
        int j = MathHelper.clamp_int (par1, 0, 4);
        return this.field_150920_d[j];
    }

    public String getUnlocalizedName(ItemStack par1ItemStack) {
        int i = MathHelper.clamp_int (par1ItemStack.getItemDamage (), 0, 4);
        return super.getUnlocalizedName () + "." + field_150923_a[i];
    }

    @SideOnly(Side.CLIENT)
    public void getSubItems(Item p_150895_1_, CreativeTabs p_150895_2_, List p_150895_3_) {
        for (int i = 0; i < 5; i++) {
            p_150895_3_.add (new ItemStack (p_150895_1_, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par2) {
        switch (par2.getItemDamage ()) {
            case 0:
                return EnumRarity.common;
            case 1:
                return EnumRarity.common;
            case 2:
                return EnumRarity.uncommon;
            case 3:
                return EnumRarity.rare;
            case 4:
                return EnumRarity.epic;
        }
        return EnumRarity.rare;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack itemStack, int metadata) {
        metadata = itemStack.getItemDamage ();
        switch (metadata) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return true;
        }
        return false;
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister) {
        this.field_150920_d = new IIcon[field_150921_b.length];
        for (int i = 0; i < field_150921_b.length; i++) {
            this.field_150920_d[i] = par1IconRegister.registerIcon ("ardium:" + field_150921_b[i]);
        }
    }
}
