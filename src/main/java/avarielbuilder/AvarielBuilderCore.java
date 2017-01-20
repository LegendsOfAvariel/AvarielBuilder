package avarielbuilder;

import org.apache.logging.log4j.Logger;

import avarielbuilder.proxy.ServerProxy;
import avarielbuilder.registries.BlockRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Info.name, modid = Info.modid, version = Info.version)

public class AvarielBuilderCore {
	
	//Proxy setup
	@SidedProxy(clientSide = Info.client, serverSide = Info.server)
	public static ServerProxy proxy; //Needs to be static
	
	//Create instance for interaction with other mods
	@Instance
	public static AvarielBuilderCore instance; //Needs to be static
	
	public Logger logger; //Blank logger for use in preinit
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog(); //Forge recommends that this is used.
		BlockRegistry blockRegistry = new BlockRegistry();
		proxy.preInit(e, blockRegistry);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
	
}
