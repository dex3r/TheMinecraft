package net.minecraft.client.proxyClient;

import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.proxyServer.proxyServer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class proxyClient extends proxyServer {
	
	// Ka�dy z Was ma w�asn� metode do wywo�ywania rejestacji z poziomu moda.
	// ew. mo�na dorobi� jeszcze jakie� nie b�dzie syfu!:(
	
	@Override
	public void Oskar13()  {

	}
	
	@Override
	public void Dexter() {}
	
	@Override
	public void Omlet() {}

	
	@SideOnly(Side.CLIENT)
	public static EntityPlayer getPlayer() {
		return FMLClientHandler.instance().getClient().thePlayer;
	}

	
	

}
