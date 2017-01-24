package avarielbuilder.blocks.logs;

import avarielbuilder.templates.AvarielAbstractLog;
import net.minecraft.item.ItemBlock;

public class EbonyLog extends AvarielAbstractLog {

	private final ItemBlock ebonyLogItem;
	
	public EbonyLog() {
		super("ebony_log");
		ebonyLogItem = (ItemBlock) new ItemBlock(this).setRegistryName("ebony_log");
	}

	@Override
	public ItemBlock getItemBlock() {
		return ebonyLogItem;
	}

}
