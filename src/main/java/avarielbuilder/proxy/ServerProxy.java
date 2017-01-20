package avarielbuilder.proxy;

import avarielbuilder.registries.BlockRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy {
	
	BlockRegistry blockRegistry;
	 
    public void preInit(FMLPreInitializationEvent e, BlockRegistry br) {
        blockRegistry = br;
        blockRegistry.serverInitAll();
    }
   
    public void init(FMLInitializationEvent e) {
       
    }
   
    public void postInit(FMLPostInitializationEvent e) {
       
    }
	
}
