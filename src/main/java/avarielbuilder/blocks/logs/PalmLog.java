package avarielbuilder.blocks.logs;

import avarielbuilder.templates.AvarielAbstractLog;
import net.minecraft.item.ItemBlock;

public class PalmLog extends AvarielAbstractLog {

	private final ItemBlock palmLogItem;
	
	public PalmLog() {
		super("palm_log");
		palmLogItem = (ItemBlock) new ItemBlock(this).setRegistryName("palm_log");
	}

	@Override
	public ItemBlock getItemBlock() {
		return palmLogItem;
	}

}
