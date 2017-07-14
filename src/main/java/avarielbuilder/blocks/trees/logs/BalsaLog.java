package avarielbuilder.blocks.trees.logs;

import avarielbuilder.templates.AAvarielLog;
import net.minecraft.item.ItemBlock;

public class BalsaLog extends AAvarielLog {

	private final ItemBlock balsaLogItem;
	
	public BalsaLog() {
		super("balsa_log");
		balsaLogItem = (ItemBlock) new ItemBlock(this).setRegistryName("balsa_log");
	}

	@Override
	public ItemBlock getItemBlock() {
		return balsaLogItem;
	}

}
