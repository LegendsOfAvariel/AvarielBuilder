package avarielbuilder.blocks.logs;

import avarielbuilder.templates.AvarielAbstractLog;
import net.minecraft.item.ItemBlock;

public class SugarMapleLog extends AvarielAbstractLog {

	private final ItemBlock sugarMapleLogItem;
	
	public SugarMapleLog() {
		super("sugar_maple_log");
		sugarMapleLogItem = (ItemBlock) new ItemBlock(this).setRegistryName("sugar_maple_log");
	}

	@Override
	public ItemBlock getItemBlock() {
		return sugarMapleLogItem;
	}

}
