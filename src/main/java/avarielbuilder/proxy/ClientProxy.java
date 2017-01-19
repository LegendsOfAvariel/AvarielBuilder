package avarielbuilder.proxy;

import avarielbuilder.registries.BlockRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends ServerProxy {
	
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		BlockRegistry.clientInitAll();
	}
	
	public void init(FMLInitializationEvent e) {
		super.init(e);
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}
	
}
