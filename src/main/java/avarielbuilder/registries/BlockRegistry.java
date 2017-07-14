package avarielbuilder.registries;

import java.util.HashMap;
import java.util.Iterator;

import avarielbuilder.blocks.decoration.fixed.Barrel;
import avarielbuilder.blocks.decoration.fixed.Crate;
import avarielbuilder.blocks.decoration.rotatable.CouchLeft;
import avarielbuilder.blocks.decoration.rotatable.CouchMid;
import avarielbuilder.blocks.decoration.rotatable.CouchRight;
import avarielbuilder.blocks.decoration.rotatable.DisplayCase;
import avarielbuilder.blocks.decoration.rotatable.MeathookBeef;
import avarielbuilder.blocks.decoration.rotatable.MeathookChicken;
import avarielbuilder.blocks.decoration.rotatable.MeathookClownfish;
import avarielbuilder.blocks.decoration.rotatable.MeathookCod;
import avarielbuilder.blocks.decoration.rotatable.MeathookEmpty;
import avarielbuilder.blocks.decoration.rotatable.MeathookMutton;
import avarielbuilder.blocks.decoration.rotatable.MeathookPork;
import avarielbuilder.blocks.decoration.rotatable.MeathookRabbit;
import avarielbuilder.blocks.decoration.rotatable.MeathookSalmon;
import avarielbuilder.blocks.decoration.rotatable.Tankard;
import avarielbuilder.blocks.trees.leaves.AshLeaves;
import avarielbuilder.blocks.trees.leaves.BalsaLeaves;
import avarielbuilder.blocks.trees.leaves.CedarLeaves;
import avarielbuilder.blocks.trees.leaves.CherryBlossomsLeaves;
import avarielbuilder.blocks.trees.leaves.EbonyLeaves;
import avarielbuilder.blocks.trees.leaves.JacarandaLeaves;
import avarielbuilder.blocks.trees.leaves.JuniperLeaves;
import avarielbuilder.blocks.trees.leaves.PalmLeaves;
import avarielbuilder.blocks.trees.leaves.PersimmonLeaves;
import avarielbuilder.blocks.trees.leaves.PlumLeaves;
import avarielbuilder.blocks.trees.leaves.SequoiaLeaves;
import avarielbuilder.blocks.trees.leaves.SugarMapleLeaves;
import avarielbuilder.blocks.trees.leaves.WalnutLeaves;
import avarielbuilder.blocks.trees.leaves.WhiteAlderLeaves;
import avarielbuilder.blocks.trees.leaves.WhiteOakLeaves;
import avarielbuilder.blocks.trees.leaves.WillowLeaves;
import avarielbuilder.blocks.trees.logs.AshLog;
import avarielbuilder.blocks.trees.logs.BalsaLog;
import avarielbuilder.blocks.trees.logs.CedarLog;
import avarielbuilder.blocks.trees.logs.CherryLog;
import avarielbuilder.blocks.trees.logs.EbonyLog;
import avarielbuilder.blocks.trees.logs.JacarandaLog;
import avarielbuilder.blocks.trees.logs.JuniperLog;
import avarielbuilder.blocks.trees.logs.PalmLog;
import avarielbuilder.blocks.trees.logs.PersimmonLog;
import avarielbuilder.blocks.trees.logs.PlumLog;
import avarielbuilder.blocks.trees.logs.SequoiaLog;
import avarielbuilder.blocks.trees.logs.SugarMapleLog;
import avarielbuilder.blocks.trees.logs.WalnutLog;
import avarielbuilder.blocks.trees.logs.WhiteAlderLog;
import avarielbuilder.blocks.trees.logs.WhiteOakLog;
import avarielbuilder.blocks.trees.logs.WillowLog;
import avarielbuilder.blocks.trees.planks.AshPlanks;
import avarielbuilder.blocks.trees.planks.BalsaPlanks;
import avarielbuilder.blocks.trees.planks.CedarPlanks;
import avarielbuilder.blocks.trees.planks.CherryPlanks;
import avarielbuilder.blocks.trees.planks.EbonyPlanks;
import avarielbuilder.blocks.trees.planks.JacarandaPlanks;
import avarielbuilder.blocks.trees.planks.JuniperPlanks;
import avarielbuilder.blocks.trees.planks.PalmPlanks;
import avarielbuilder.blocks.trees.planks.PersimmonPlanks;
import avarielbuilder.blocks.trees.planks.PlumPlanks;
import avarielbuilder.blocks.trees.planks.SequoiaPlanks;
import avarielbuilder.blocks.trees.planks.SugarMaplePlanks;
import avarielbuilder.blocks.trees.planks.WalnutPlanks;
import avarielbuilder.blocks.trees.planks.WhiteAlderPlanks;
import avarielbuilder.blocks.trees.planks.WhiteOakPlanks;
import avarielbuilder.blocks.trees.planks.WillowPlanks;
import avarielbuilder.templates.IAvarielBlock;
import avarielbuilder.test.blocks.CullingTester;

public class BlockRegistry {

    private HashMap<String,IAvarielBlock> blockMap;

    public BlockRegistry() {
        blockMap = new HashMap<String,IAvarielBlock>();

        //Trees - Leaves
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
        
        //Trees - Logs
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
        
        //Trees - Planks
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
        
        //Decoration
        blockMap.put("Barrel", new Barrel());
        blockMap.put("CouchLeft", new CouchLeft());
        blockMap.put("CouchMid", new CouchMid());
        blockMap.put("CouchRight", new CouchRight());
        blockMap.put("Crate", new Crate());
        blockMap.put("DisplayCase", new DisplayCase());
        blockMap.put("MeathookBeef", new MeathookBeef());
        blockMap.put("MeathookChicken", new MeathookChicken());
        blockMap.put("MeathookClownfish", new MeathookClownfish());
        blockMap.put("MeathookCod", new MeathookCod());
        blockMap.put("MeathookEmpty", new MeathookEmpty());
        blockMap.put("MeathookMutton", new MeathookMutton());
        blockMap.put("MeathookPork", new MeathookPork());
        blockMap.put("MeathookRabbit", new MeathookRabbit());
        blockMap.put("MeathookSalmon", new MeathookSalmon());
        blockMap.put("Tankard", new Tankard());
        
        //Utility
        
        //Test
        blockMap.put("CullingTester", new CullingTester());
    }

    public IAvarielBlock getBlock(String name) {
        return blockMap.get(name);
    }

    public void serverInitAll() {
        Iterator<IAvarielBlock> i = blockMap.values().iterator();
        while (i.hasNext()) {
            i.next().register();
        }
    }

    public void clientInitAll() {
        Iterator<IAvarielBlock> i = blockMap.values().iterator();
        while (i.hasNext()) {
            i.next().render();
        }
    }

}
