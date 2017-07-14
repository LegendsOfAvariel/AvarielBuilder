package avarielbuilder.blocks.trees.logs;

import avarielbuilder.templates.AAvarielLog;
import net.minecraft.item.ItemBlock;

public class WillowLog extends AAvarielLog {

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
