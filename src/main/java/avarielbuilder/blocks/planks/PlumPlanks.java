package avarielbuilder.blocks.planks;

import avarielbuilder.templates.AvarielAbstractPlanks;
import net.minecraft.item.ItemBlock;

public class PlumPlanks extends AvarielAbstractPlanks {

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
