package avarielbuilder.registries;

import java.util.Iterator;
import java.util.LinkedList;

import avarielbuilder.blocks.logs.AshLog;
import avarielbuilder.templates.AvarielLog;
import net.minecraft.block.Block;

public class BlockRegistry {
	
	protected final LinkedList<Block> blockList;
	 
    public BlockRegistry() {
        blockList = new LinkedList<Block>();
 
        blockList.add(new AshLog());
    }
 
    public void serverInitAll() {
       
        Iterator i = blockList.iterator();
        while (i.hasNext()) {
            ((AvarielLog) i.next()).register();
        }
    }
   
    public void clientInitAll() {
        Iterator i = blockList.iterator();
        while (i.hasNext()) {
            ((AvarielLog) i.next()).render();
        }
    }
	
}
