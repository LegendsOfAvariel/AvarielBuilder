package avarielbuilder.blocks.trees.logs;

import avarielbuilder.templates.AAvarielLog;
import net.minecraft.item.ItemBlock;

public class JuniperLog extends AAvarielLog {

	private final ItemBlock juniperLogItem;
	
	public JuniperLog() {
		super("juniper_log");
		juniperLogItem = (ItemBlock) new ItemBlock(this).setRegistryName("juniper_log");
	}

	@Override
	public ItemBlock getItemBlock() {
		return juniperLogItem;
	}

}
