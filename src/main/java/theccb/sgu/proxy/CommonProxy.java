package theccb.sgu.proxy;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import theccb.sgu.handlers.RegistryHandler;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) {
		RegistryHandler.Common();
	}

	public void init(FMLInitializationEvent event) {
		
	}

	public void postInit(FMLPostInitializationEvent event) {
	
	}
}
