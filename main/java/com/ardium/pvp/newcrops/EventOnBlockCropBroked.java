package com.ardium.pvp.newcrops;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.world.BlockEvent;

public class EventOnBlockCropBroked {

	@SubscribeEvent
	public void onCropPlantBreak(BlockEvent.HarvestDropsEvent event)
	{
	  if (event.harvester != null) {
	    if (((event.block instanceof BlockCropMod1)) && (event.blockMetadata == 7)) {
	      event.world.setBlock(event.x, event.y, event.z, event.block, 1, 2);
	    }
	  }
	}
	}
