package avarielbuilder.blocks.logs;

import avarielbuilder.templates.AvarielAbstractLog;
import net.minecraft.item.ItemBlock;

public class WalnutLog extends AvarielAbstractLog {
	
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
