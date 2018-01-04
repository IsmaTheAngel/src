package com.ardium.pvp;

import com.ardium.pvp.blocks.RegistryBlocks;
import com.ardium.pvp.items.RegistryItems;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class EventHandler {

    private static final String[] directions = {"South", "West", "North", "East"};

    public static boolean hasLitLanternOnHotbar(InventoryPlayer inv) {

        for (int i = 0; i < 9; i++) {
            ItemStack item = inv.mainInventory[i];
            if ( item != null && item.getItem () == RegistryItems.itemLantern ) {
                return true;
            }
        }
        return false;
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onRenderPre(RenderGameOverlayEvent.Pre renderGameOverlayEvent) {

        if ( renderGameOverlayEvent.type == RenderGameOverlayEvent.ElementType.DEBUG ) {
            FontRenderer f = Minecraft.getMinecraft ().fontRenderer;

            renderGameOverlayEvent.setCanceled (true);
            drawString (Minecraft.getMinecraft ().fontRenderer, EnumChatFormatting.GOLD + "Ardium Special Edition" + EnumChatFormatting.DARK_RED + " / " + EnumChatFormatting.GOLD + Minecraft.getMinecraft ().debug.split (",", 2)[0], 2, 2, 16777215);
            drawString (Minecraft.getMinecraft ().fontRenderer, EnumChatFormatting.GOLD + "X : " + EnumChatFormatting.DARK_RED + (int) Minecraft.getMinecraft ().thePlayer.posX + " / " + EnumChatFormatting.GOLD + "Y : " + EnumChatFormatting.DARK_RED + (int) Minecraft.getMinecraft ().thePlayer.posY + " / " + EnumChatFormatting.GOLD + "Z : " + EnumChatFormatting.DARK_RED + (int) Minecraft.getMinecraft ().thePlayer.posZ, 2, 12, 16777215);

            drawString (Minecraft.getMinecraft ().fontRenderer, EnumChatFormatting.GOLD + "Direction: " + EnumChatFormatting.DARK_RED + directions[
                    (net.minecraft.util.MathHelper.floor_double (
                            Minecraft.getMinecraft ().thePlayer.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3)], 2, 22, 16777215);

        }


    }

    private void drawString(FontRenderer par1FontRenderer, String par2Str, int par3, int par4, int par5) {
        par1FontRenderer.drawStringWithShadow (par2Str, par3, par4, par5);
    }

    @SubscribeEvent
    public void onClick(PlayerInteractEvent e) {

        EntityPlayer player = e.entityPlayer;
        if ( (e.action == PlayerInteractEvent.Action.RIGHT_CLICK_AIR) &&
                (player.getHeldItem () != null) && (player.getHeldItem ().equals (new ItemStack (RegistryBlocks.barrier))) ) {
            RegistryBlocks.barrier.setBlockTextureName ("ardium:barrier");
        }
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void openGuiEvent(GuiOpenEvent v1) {

        if ( (v1.gui instanceof net.minecraft.client.gui.GuiMainMenu) ) {
            v1.gui = new GuiCustomMainMenu ();
        }
    }

}
