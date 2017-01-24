package avarielbuilder.blocks.logs;

import avarielbuilder.templates.AvarielAbstractLog;
import net.minecraft.item.ItemBlock;

public class PlumLog extends AvarielAbstractLog {

	private final ItemBlock plumLogItem;
	
	public PlumLog() {
		super("plum_log");
		plumLogItem = (ItemBlock) new ItemBlock(this).setRegistryName("plum_log");
	}

	@Override
	public ItemBlock getItemBlock() {
		return plumLogItem;
	}

}
