package avarielbuilder.blocks.logs;

import avarielbuilder.templates.AvarielAbstractLog;
import net.minecraft.item.ItemBlock;

public class JuniperLog extends AvarielAbstractLog {

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
