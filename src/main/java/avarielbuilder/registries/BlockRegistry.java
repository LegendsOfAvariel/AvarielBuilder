package avarielbuilder.registries;

import avarielbuilder.blocks.logs.AshLog;
import avarielbuilder.templates.AvarielAbstractBlock;
import avarielbuilder.templates.AvarielAbstractLog;
import avarielbuilder.templates.AvarielBlock;
import net.minecraft.block.Block;

import java.util.HashMap;
import java.util.Iterator;

public class BlockRegistry {

    private HashMap<String,AvarielBlock> blockMap;

    public BlockRegistry() {
        blockMap = new HashMap<String,AvarielBlock>();

        blockMap.put("AshLog", new AshLog());
    }

    public AvarielBlock getBlock(String name) {
        return blockMap.get(name);
    }

    public void serverInitAll() {
        Iterator<AvarielBlock> i = blockMap.values().iterator();
        while (i.hasNext()) {
            i.next().register();
        }
    }

    public void clientInitAll() {
        Iterator<AvarielBlock> i = blockMap.values().iterator();
        while (i.hasNext()) {
            i.next().render();
        }
    }

}
