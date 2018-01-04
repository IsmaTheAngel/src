package com.ardium.pvp.client;

import com.ardium.pvp.EventHandler;
import com.ardium.pvp.common.CommonProxy;
import com.ardium.pvp.entity.EntityDynamite;
import com.ardium.pvp.entity.RenderDynamite;
import com.ardium.pvp.items.ItemWandExplorer;
import com.ardium.pvp.newcrops.EventOnBlockCropBroked;
import com.ardium.pvp.render.ItemRenderingHandler;
import com.ardium.pvp.render.MekanismRenderer;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraftforge.client.event.GuiScreenEvent.InitGuiEvent;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {
    public ClientProxy() {
        MinecraftForge.EVENT_BUS.register (this);
        MinecraftForge.EVENT_BUS.register (new EventOnBlockCropBroked ());
    }


    public void registerRenders() {
        RenderingRegistry.registerEntityRenderingHandler (EntityDynamite.class, new RenderDynamite ());
        ItemRenderingHandler handler = new ItemRenderingHandler ();
        MinecraftForge.EVENT_BUS.register (new MekanismRenderer ());
        MinecraftForge.EVENT_BUS.register (new EventHandler ());

    }

    @Override
    public void initialization(FMLInitializationEvent initializationEvent) {
        if ( initializationEvent.getSide ().isClient () ) {
            MinecraftForge.EVENT_BUS.register (new ItemWandExplorer ());
        }
    }

    @SubscribeEvent
    public void RemoveVanillaButtons(InitGuiEvent.Post postInitGuiEvent) {
        if ( postInitGuiEvent.gui instanceof GuiMainMenu ) {
            for (Object button : postInitGuiEvent.buttonList) {
                switch (((GuiButton) button).id) {
                    case 0:
                        ((GuiButton) button).enabled = false;
                        ((GuiButton) button).visible = false;
                        break;
                    case 1:
                        ((GuiButton) button).enabled = false;
                        ((GuiButton) button).visible = false;
                        break;
                    case 2:
                        ((GuiButton) button).enabled = false;
                        ((GuiButton) button).visible = false;
                        break;
                    case 4:
                        ((GuiButton) button).enabled = false;
                        ((GuiButton) button).visible = false;
                        break;
                    case 5:
                        ((GuiButton) button).enabled = false;
                        ((GuiButton) button).visible = false;
                        break;
                    case 6:
                        ((GuiButton) button).enabled = false;
                        ((GuiButton) button).visible = false;
                        break;
                    case 14:
                        ((GuiButton) button).enabled = false;
                        ((GuiButton) button).visible = false;
                        break;
                    default:
                        break;
                }
                int par1 = postInitGuiEvent.gui.height / 4 + 18;
                int par2 = 24;
            }
        }
    }
}


