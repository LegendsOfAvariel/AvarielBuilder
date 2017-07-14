package avarielbuilder;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import avarielbuilder.blocks.trees.logs.AshLog;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;

public class AvarielTabs {
	
	//Creative tabs need to be static
	protected static Block avarielTreesTabIcon = Blocks.SAPLING;
	//protected static Item avarielUtilityTabIcon = Items.IRON_PICKAXE;
	protected static Block avarielDecoTabIcon = Blocks.OAK_FENCE;
	
	//Tree tab
	public static final CreativeTabs tabAvarielTrees = new CreativeTabs("AvarielTrees") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(avarielTreesTabIcon);
		}
		
	//	@Override
	//	public void displayAllRelevantItems(List<ItemStack> items) {
	//		super.displayAllRelevantItems(items);
	//	}
	};
	
	//Utility tab
	//public static final CreativeTabs tabAvarielUtility = new CreativeTabs("AvarielUtility") {
	//	@Override
	//	public Item getTabIconItem() {
	//		return avarielUtilityTabIcon;
	//	}
	//	
	//	@Override
	//	public void displayAllRelevantItems(List<ItemStack> items) {
	//		super.displayAllRelevantItems(items);
	//	}
	//	
	//};
	
	//Decoration Tab
	public static final CreativeTabs tabAvarielDeco = new CreativeTabs("AvarielDeco") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(avarielDecoTabIcon);
		}
	};
	
}
