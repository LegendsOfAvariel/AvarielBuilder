package avarielbuilder.blocks.logs;

import avarielbuilder.templates.AvarielAbstractLog;
import net.minecraft.item.ItemBlock;

public class CherryLog extends AvarielAbstractLog {

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
