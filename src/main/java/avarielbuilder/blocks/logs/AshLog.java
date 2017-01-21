package avarielbuilder.blocks.logs;

import avarielbuilder.templates.AvarielAbstractLog;
import net.minecraft.item.ItemBlock;

public class AshLog extends AvarielAbstractLog {

	private final ItemBlock ashLogItem;
	 
    public AshLog() {
        super("ash_log");
        ashLogItem = (ItemBlock) new ItemBlock(this).setRegistryName("ash_log");
    }

	@Override
	public ItemBlock getItemBlock() {
		return ashLogItem;
	}

}
