package avarielbuilder.blocks.trees.planks;

import avarielbuilder.templates.AAvarielPlanks;
import net.minecraft.item.ItemBlock;

public class WalnutPlanks extends AAvarielPlanks {

	private final ItemBlock walnutPlanksItem;
	
	public WalnutPlanks() {
		super("walnut_planks");
		walnutPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("walnut_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return walnutPlanksItem;
	}

}
