package avarielbuilder.blocks.logs;

import avarielbuilder.templates.AvarielAbstractLog;
import net.minecraft.item.ItemBlock;

public class JacarandaLog extends AvarielAbstractLog {

	private final ItemBlock jacarandaLogItem;
	
	public JacarandaLog() {
		super("jacaranda_log");
		jacarandaLogItem = (ItemBlock) new ItemBlock(this).setRegistryName("jacaranda_log");
	}

	@Override
	public ItemBlock getItemBlock() {
		return jacarandaLogItem;
	}

}
