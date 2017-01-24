package avarielbuilder.blocks.logs;

import avarielbuilder.templates.AvarielAbstractLog;
import net.minecraft.item.ItemBlock;

public class WillowLog extends AvarielAbstractLog {

	private final ItemBlock willowLogItem;
	
	public WillowLog() {
		super("willow_log");
		willowLogItem = (ItemBlock) new ItemBlock(this).setRegistryName("willow_log");
	}

	@Override
	public ItemBlock getItemBlock() {
		return willowLogItem;
	}

}
