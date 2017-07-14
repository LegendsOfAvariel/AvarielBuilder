package avarielbuilder.blocks.trees.logs;

import avarielbuilder.templates.AAvarielLog;
import net.minecraft.item.ItemBlock;

public class CedarLog extends AAvarielLog {

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
