package avarielbuilder.proxy;

import avarielbuilder.registries.BlockRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy {

    protected BlockRegistry br;

    public void preInit(FMLPreInitializationEvent e, BlockRegistry br) {
        this.br = br;
        this.br.serverInitAll();
    }
   
    public void init(FMLInitializationEvent e) {
       
    }
   
    public void postInit(FMLPostInitializationEvent e) {
       
    }
	
}
