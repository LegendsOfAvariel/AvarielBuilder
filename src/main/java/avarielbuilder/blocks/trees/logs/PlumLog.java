package avarielbuilder.blocks.trees.logs;

import avarielbuilder.templates.AAvarielLog;
import net.minecraft.item.ItemBlock;

public class PlumLog extends AAvarielLog {

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
