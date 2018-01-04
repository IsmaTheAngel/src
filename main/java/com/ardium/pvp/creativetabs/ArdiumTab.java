package com.ardium.pvp.creativetabs;

import com.ardium.pvp.items.RegistryItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ArdiumTab extends CreativeTabs {
    public ArdiumTab(int creativeTabIndex, String p_i1853_2_) {
        super (creativeTabIndex, p_i1853_2_);
    }

    @Override
    public Item getTabIconItem() {
        return RegistryItems.ardium_ingot;
    }

    @Override
    public CreativeTabs setBackgroundImageName(String backgroundImageReference) {
        return super.setBackgroundImageName (backgroundImageReference);
    }
}
