package avarielbuilder.blocks.logs;

import avarielbuilder.templates.AvarielAbstractLog;
import net.minecraft.item.ItemBlock;

public class WhiteAlderLog extends AvarielAbstractLog {

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
