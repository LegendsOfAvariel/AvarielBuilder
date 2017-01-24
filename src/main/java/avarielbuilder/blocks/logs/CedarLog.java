package avarielbuilder.blocks.logs;

import avarielbuilder.templates.AvarielAbstractLog;
import net.minecraft.item.ItemBlock;

public class CedarLog extends AvarielAbstractLog {

	private final ItemBlock cedarLogItem;
	
	public CedarLog() {
		super("cedar_log");
		cedarLogItem = (ItemBlock) new ItemBlock(this).setRegistryName("cedar_log");
	}

	@Override
	public ItemBlock getItemBlock() {
		return cedarLogItem;
	}

}
