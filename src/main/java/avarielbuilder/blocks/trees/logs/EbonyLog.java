package avarielbuilder.blocks.trees.logs;

import avarielbuilder.templates.AAvarielLog;
import net.minecraft.item.ItemBlock;

public class EbonyLog extends AAvarielLog {

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
