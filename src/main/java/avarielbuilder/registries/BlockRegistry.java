package avarielbuilder.registries;

import avarielbuilder.blocks.logs.AshLog;
import avarielbuilder.templates.AvarielBlock;
import avarielbuilder.templates.AvarielLog;
import net.minecraft.block.Block;

import java.util.HashMap;
import java.util.Iterator;

public class BlockRegistry {

    HashMap<String,Block> blockMap;

    public BlockRegistry() {
        blockMap = new HashMap<String,Block>();

        blockMap.put("AshLog", new AshLog());
    }

    public Block getBlock(String name) {
        return blockMap.get(name);
    }

    public void serverInitAll() {
        Iterator<Block> i = blockMap.values().iterator();
        while (i.hasNext()) {
            Block block = i.next();
            if (block instanceof AvarielLog) {
                ((AvarielLog)block).register();
            }
			else if (block instanceof AvarielBlock) {
                ((AvarielBlock)block).register();
            }
        }
    }

    public void clientInitAll() {
        Iterator<Block> i = blockMap.values().iterator();
        while (i.hasNext()) {
            Block block = i.next();
            if (block instanceof AvarielLog) {
                ((AvarielLog)block).render();
            }
			else if (block instanceof AvarielBlock) {
                ((AvarielBlock)block).render();
            }
        }
    }

}
