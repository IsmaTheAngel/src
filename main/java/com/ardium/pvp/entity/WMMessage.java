package com.ardium.pvp.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;

abstract class WMMessage {
	 public abstract void encodeInto(ChannelHandlerContext paramChannelHandlerContext, ByteBuf paramByteBuf);
	  
	  public abstract void decodeInto(ChannelHandlerContext paramChannelHandlerContext, ByteBuf paramByteBuf);
	  
	  @SideOnly(Side.CLIENT)
	  public abstract void handleClientSide(EntityPlayer paramEntityPlayer);
	  
	  public abstract void handleServerSide(EntityPlayer paramEntityPlayer);
}
