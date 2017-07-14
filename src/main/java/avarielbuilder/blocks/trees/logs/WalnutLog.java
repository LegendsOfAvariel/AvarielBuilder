package avarielbuilder.blocks.trees.logs;

import avarielbuilder.templates.AAvarielLog;
import net.minecraft.item.ItemBlock;

public class WalnutLog extends AAvarielLog {
	
	private final ItemBlock walnutLogItem;
	
	public WalnutLog() {
		super("walnut_log");
		walnutLogItem = (ItemBlock) new ItemBlock(this).setRegistryName("walnut_log");
	}

	@Override
	public ItemBlock getItemBlock() {
		return walnutLogItem;
	}
	
}
