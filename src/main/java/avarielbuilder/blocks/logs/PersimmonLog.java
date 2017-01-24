package avarielbuilder.blocks.logs;

import avarielbuilder.templates.AvarielAbstractLog;
import net.minecraft.item.ItemBlock;

public class PersimmonLog extends AvarielAbstractLog {

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
