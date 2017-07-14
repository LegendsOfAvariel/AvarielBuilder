package avarielbuilder.blocks.trees.logs;

import avarielbuilder.templates.AAvarielLog;
import net.minecraft.item.ItemBlock;

public class PalmLog extends AAvarielLog {

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
