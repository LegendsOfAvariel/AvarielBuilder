package avarielbuilder.blocks.logs;

import avarielbuilder.templates.AvarielAbstractLog;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class WhiteOakLog extends AvarielAbstractLog {
	
	private final ItemBlock whiteOakLogItem;
	
	public WhiteOakLog() {
		super("white_oak_log");
		whiteOakLogItem = (ItemBlock) new ItemBlock(this).setRegistryName("white_oak_log");
	}

	@Override
	public ItemBlock getItemBlock() {
		return whiteOakLogItem;
	}

}
