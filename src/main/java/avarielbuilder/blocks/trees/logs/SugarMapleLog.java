package avarielbuilder.blocks.trees.logs;

import avarielbuilder.templates.AAvarielLog;
import net.minecraft.item.ItemBlock;

public class SugarMapleLog extends AAvarielLog {

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
