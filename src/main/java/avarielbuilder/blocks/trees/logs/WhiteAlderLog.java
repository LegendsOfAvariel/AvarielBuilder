package avarielbuilder.blocks.trees.logs;

import avarielbuilder.templates.AAvarielLog;
import net.minecraft.item.ItemBlock;

public class WhiteAlderLog extends AAvarielLog {

	private final ItemBlock whiteAlderLogItem;
	
	public WhiteAlderLog() {
		super("white_alder_log");
		whiteAlderLogItem = (ItemBlock) new ItemBlock(this).setRegistryName("white_alder_log");
	}

	@Override
	public ItemBlock getItemBlock() {
		return whiteAlderLogItem;
	}

}
