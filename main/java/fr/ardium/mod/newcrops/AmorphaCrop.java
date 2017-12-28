package fr.ardium.mod.newcrops;

import fr.ardium.mod.items.RegistryItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class AmorphaCrop extends BlockCropMod1 {


    protected Item func_149865_P()
    {
        return RegistryItems.amorpha_petal;
    }
    
    protected Item func_149866_i()
    {
        return RegistryItems.leave;
    }
}
