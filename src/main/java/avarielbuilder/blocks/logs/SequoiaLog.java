package avarielbuilder.blocks.logs;

import avarielbuilder.templates.AvarielAbstractLog;
import net.minecraft.item.ItemBlock;

public class SequoiaLog extends AvarielAbstractLog {

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
