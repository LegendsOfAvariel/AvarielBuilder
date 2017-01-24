package avarielbuilder.blocks.logs;

import avarielbuilder.templates.AvarielAbstractLog;
import net.minecraft.item.ItemBlock;

public class BalsaLog extends AvarielAbstractLog {

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
