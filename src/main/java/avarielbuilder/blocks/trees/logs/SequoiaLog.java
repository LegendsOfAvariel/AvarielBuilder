package avarielbuilder.blocks.trees.logs;

import avarielbuilder.templates.AAvarielLog;
import net.minecraft.item.ItemBlock;

public class SequoiaLog extends AAvarielLog {

	private final ItemBlock sequoiaLogItem;
	
	public SequoiaLog() {
		super("sequoia_log");
		sequoiaLogItem = (ItemBlock) new ItemBlock(this).setRegistryName("sequoia_log");
	}

	@Override
	public ItemBlock getItemBlock() {
		return sequoiaLogItem;
	}

}
