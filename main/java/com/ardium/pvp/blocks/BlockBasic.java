package com.ardium.pvp.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

class BlockBasic extends Block {
    BlockBasic(Material material, int level) {
        super (material);
        this.setHarvestLevel ("pickaxe", level);
    }
}