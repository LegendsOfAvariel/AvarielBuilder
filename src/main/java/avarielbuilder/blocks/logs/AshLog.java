package avarielbuilder.blocks.logs;

import avarielbuilder.templates.AvarielLog;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class AshLog extends AvarielLog {

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
