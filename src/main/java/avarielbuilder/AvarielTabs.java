package avarielbuilder;

import avarielbuilder.blocks.logs.AshLog;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class AvarielTabs {
	
	//Creative tabs need to be static
	
	//Tree tab
	public static final CreativeTabs tabAvarielTrees = new CreativeTabs("AvarielTrees") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(AshLog.ashLogBlock);
		}
	};
	
}