package avarielbuilder.blocks.trees.logs;

import avarielbuilder.templates.AAvarielLog;
import net.minecraft.item.ItemBlock;

public class PersimmonLog extends AAvarielLog {

	private final ItemBlock persimmonLogItem;
	
	public PersimmonLog() {
		super("persimmon_log");
		persimmonLogItem = (ItemBlock) new ItemBlock(this).setRegistryName("persimmon_log");
	}

	@Override
	public ItemBlock getItemBlock() {
		return persimmonLogItem;
	}

}
