package avarielbuilder.registries;

import java.util.HashMap;
import java.util.Iterator;

import avarielbuilder.blocks.leaves.AshLeaves;
import avarielbuilder.blocks.leaves.BalsaLeaves;
import avarielbuilder.blocks.leaves.CedarLeaves;
import avarielbuilder.blocks.leaves.CherryBlossomsLeaves;
import avarielbuilder.blocks.leaves.EbonyLeaves;
import avarielbuilder.blocks.leaves.JacarandaLeaves;
import avarielbuilder.blocks.leaves.JuniperLeaves;
import avarielbuilder.blocks.leaves.PalmLeaves;
import avarielbuilder.blocks.leaves.PersimmonLeaves;
import avarielbuilder.blocks.leaves.PlumLeaves;
import avarielbuilder.blocks.leaves.SequoiaLeaves;
import avarielbuilder.blocks.leaves.SugarMapleLeaves;
import avarielbuilder.blocks.leaves.WalnutLeaves;
import avarielbuilder.blocks.leaves.WhiteAlderLeaves;
import avarielbuilder.blocks.leaves.WhiteOakLeaves;
import avarielbuilder.blocks.leaves.WillowLeaves;
import avarielbuilder.blocks.logs.AshLog;
import avarielbuilder.blocks.logs.BalsaLog;
import avarielbuilder.blocks.logs.CedarLog;
import avarielbuilder.blocks.logs.CherryLog;
import avarielbuilder.blocks.logs.EbonyLog;
import avarielbuilder.blocks.logs.JacarandaLog;
import avarielbuilder.blocks.logs.JuniperLog;
import avarielbuilder.blocks.logs.PalmLog;
import avarielbuilder.blocks.logs.PersimmonLog;
import avarielbuilder.blocks.logs.PlumLog;
import avarielbuilder.blocks.logs.SequoiaLog;
import avarielbuilder.blocks.logs.SugarMapleLog;
import avarielbuilder.blocks.logs.WalnutLog;
import avarielbuilder.blocks.logs.WhiteAlderLog;
import avarielbuilder.blocks.logs.WhiteOakLog;
import avarielbuilder.blocks.logs.WillowLog;
import avarielbuilder.blocks.planks.AshPlanks;
import avarielbuilder.blocks.planks.BalsaPlanks;
import avarielbuilder.blocks.planks.CedarPlanks;
import avarielbuilder.blocks.planks.CherryPlanks;
import avarielbuilder.blocks.planks.EbonyPlanks;
import avarielbuilder.blocks.planks.JacarandaPlanks;
import avarielbuilder.blocks.planks.JuniperPlanks;
import avarielbuilder.blocks.planks.PalmPlanks;
import avarielbuilder.blocks.planks.PersimmonPlanks;
import avarielbuilder.blocks.planks.PlumPlanks;
import avarielbuilder.blocks.planks.SequoiaPlanks;
import avarielbuilder.blocks.planks.SugarMaplePlanks;
import avarielbuilder.blocks.planks.WalnutPlanks;
import avarielbuilder.blocks.planks.WhiteAlderPlanks;
import avarielbuilder.blocks.planks.WhiteOakPlanks;
import avarielbuilder.blocks.planks.WillowPlanks;
import avarielbuilder.templates.AvarielBlock;

public class BlockRegistry {

    private HashMap<String,AvarielBlock> blockMap;

    public BlockRegistry() {
        blockMap = new HashMap<String,AvarielBlock>();

        blockMap.put("AshLeaves", new AshLeaves());
        blockMap.put("BalsaLeaves", new BalsaLeaves());
        blockMap.put("CedarLeaves", new CedarLeaves());
        blockMap.put("CherryBlossomsLeaves", new CherryBlossomsLeaves());
        blockMap.put("EbonyLeaves", new EbonyLeaves());
        blockMap.put("JacarandaLeaves", new JacarandaLeaves());
        blockMap.put("JuniperLeaves", new JuniperLeaves());
        blockMap.put("PalmLeaves", new PalmLeaves());
        blockMap.put("PersimmonLeaves", new PersimmonLeaves());
        blockMap.put("PlumLeaves", new PlumLeaves());
        blockMap.put("SequoiaLeaves", new SequoiaLeaves());
        blockMap.put("SugarMapleLeaves", new SugarMapleLeaves());
        blockMap.put("WalnutLeaves", new WalnutLeaves());
        blockMap.put("WhiteAlderLeaves", new WhiteAlderLeaves());
        blockMap.put("WhiteOakLeaves", new WhiteOakLeaves());
        blockMap.put("WillowLeaves", new WillowLeaves());
        
        blockMap.put("AshLog", new AshLog());
        blockMap.put("BalsaLog", new BalsaLog());
        blockMap.put("CedarLog", new CedarLog());
        blockMap.put("CherryLog", new CherryLog());
        blockMap.put("EbonyLog", new EbonyLog());
        blockMap.put("JacarandaLog", new JacarandaLog());
        blockMap.put("JuniperLog", new JuniperLog());
        blockMap.put("PalmLog", new PalmLog());
        blockMap.put("PersimmonLog", new PersimmonLog());
        blockMap.put("PlumLog", new PlumLog());
        blockMap.put("SequoiaLog", new SequoiaLog());
        blockMap.put("SugarMapleLog", new SugarMapleLog());
        blockMap.put("WalnutLog", new WalnutLog());
        blockMap.put("WhiteAlderLog", new WhiteAlderLog());
        blockMap.put("WhiteOakLog", new WhiteOakLog());
        blockMap.put("WillowLog", new WillowLog());
        
        blockMap.put("AshPlanks", new AshPlanks());
        blockMap.put("BalsaPlanks", new BalsaPlanks());
        blockMap.put("CedarPlanks", new CedarPlanks());
        blockMap.put("CherryPlanks", new CherryPlanks());
        blockMap.put("EbonyPlanks", new EbonyPlanks());
        blockMap.put("JacarandaPlanks", new JacarandaPlanks());
        blockMap.put("JuniperPlanks", new JuniperPlanks());
        blockMap.put("PalmPlanks", new PalmPlanks());
        blockMap.put("PersimmonPlanks", new PersimmonPlanks());
        blockMap.put("PlumPlanks", new PlumPlanks());
        blockMap.put("SequoiaPlanks", new SequoiaPlanks());
        blockMap.put("SugarMaplePlanks", new SugarMaplePlanks());
        blockMap.put("WalnutPlanks", new WalnutPlanks());
        blockMap.put("WhiteAlderPlanks", new WhiteAlderPlanks());
        blockMap.put("WhiteOakPlanks", new WhiteOakPlanks());
        blockMap.put("WillowPlanks", new WillowPlanks());
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
