package avarielbuilder.blocks.trees.planks;

import avarielbuilder.templates.AAvarielPlanks;
import net.minecraft.item.ItemBlock;

public class PlumPlanks extends AAvarielPlanks {

	private final ItemBlock plumPlanksItem;
	
	public PlumPlanks() {
		super("plum_planks");
		plumPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("plum_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return plumPlanksItem;
	}

}
