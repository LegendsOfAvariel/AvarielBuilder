package avarielbuilder.blocks.logs;

import avarielbuilder.templates.AvarielLog;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class AshLog extends AvarielLog {

	public AshLog() {
		super("ash_log");
	}
	
	public static final Block ashLogBlock = new AshLog();
	public static final ItemBlock ashLogItem = (ItemBlock) new ItemBlock(ashLogBlock).setRegistryName("ash_log");
	
	public static void serverInit() {
		register(ashLogBlock, ashLogItem);
	}
	
	public static void clientInit() {
		render(ashLogBlock);
	}

}
