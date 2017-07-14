package avarielbuilder.blocks.trees.logs;

import avarielbuilder.templates.AAvarielLog;
import net.minecraft.item.ItemBlock;

public class CherryLog extends AAvarielLog {

	private final ItemBlock cherryLogItem;
	
	public CherryLog() {
		super("cherry_log");
		cherryLogItem = (ItemBlock) new ItemBlock(this).setRegistryName("cherry_log");
	}

	@Override
	public ItemBlock getItemBlock() {
		return cherryLogItem;
	}

}
