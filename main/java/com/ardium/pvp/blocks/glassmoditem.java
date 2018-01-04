package com.ardium.pvp.blocks;

import com.ardium.pvp.itemblocks.MultiItemBlock;
import net.minecraft.block.Block;

class glassmoditem extends MultiItemBlock {
    private static final String[] blockTypes = {"white", "orange", "magenta", "lightblue", "yellow", "lime", "pink",
            "gray", "lightgray", "cyan", "purple", "blue", "brown", "green", "red", "black"};

    public glassmoditem(Block b) {
        super (b, "block.stainedglass", blockTypes);
        setMaxDamage (0);
        setHasSubtypes (true);
    }
}
