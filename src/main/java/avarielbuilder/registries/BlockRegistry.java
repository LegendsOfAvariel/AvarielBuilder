package avarielbuilder.registries;

import avarielbuilder.blocks.logs.AshLog;

public class BlockRegistry {
	
	public static void serverInitAll() {
		AshLog.serverInit();
	}
	
	public static void clientInitAll() {
		AshLog.clientInit();
	}
	
}
