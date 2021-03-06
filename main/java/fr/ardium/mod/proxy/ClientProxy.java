package fr.ardium.mod.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import fr.ardium.mod.EventHandler;
import fr.ardium.mod.entity.EntityDynamite;
import fr.ardium.mod.entity.RenderDynamite;
import fr.ardium.mod.newcrops.EventOnBlockCropBroked;
import fr.ardium.mod.render.ItemRenderingHandler;
import fr.ardium.mod.render.MekanismRenderer;
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

    @SubscribeEvent
    public void RemoveVanillaButtons(InitGuiEvent.Post event) {
        if ( event.gui instanceof GuiMainMenu ) {
            for (Object b : event.buttonList) {
                if ( ((GuiButton) b).id == 14 ) {
                    ((GuiButton) b).visible = false;
                } else if ( ((GuiButton) b).id == 0 ) {
                    ((GuiButton) b).visible = false;
                } else if ( ((GuiButton) b).id == 4 ) {
                    ((GuiButton) b).visible = false;
                } else if ( ((GuiButton) b).id == 5 ) {
                    ((GuiButton) b).visible = false;
                } else if ( ((GuiButton) b).id == 1 ) {
                    ((GuiButton) b).visible = false;
                } else if ( ((GuiButton) b).id == 2 ) {
                    ((GuiButton) b).visible = false;
                } else if ( ((GuiButton) b).id == 6 ) {
                    ((GuiButton) b).visible = false;
                }


                int par1 = event.gui.height / 4 + 18;
                int par2 = 24;


            }
        }
    }
}


