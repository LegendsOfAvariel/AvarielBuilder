package avarielbuilder.blocks.trees.logs;

import avarielbuilder.templates.AAvarielLog;
import net.minecraft.item.ItemBlock;

public class JacarandaLog extends AAvarielLog {

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
