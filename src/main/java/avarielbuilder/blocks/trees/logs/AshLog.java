package avarielbuilder.blocks.trees.logs;

import avarielbuilder.templates.AAvarielLog;
import net.minecraft.item.ItemBlock;

public class AshLog extends AAvarielLog {

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
