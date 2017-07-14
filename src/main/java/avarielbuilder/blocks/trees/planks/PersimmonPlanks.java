package avarielbuilder.blocks.trees.planks;

import avarielbuilder.templates.AAvarielPlanks;
import net.minecraft.item.ItemBlock;

public class PersimmonPlanks extends AAvarielPlanks {

	private final ItemBlock persimmonPlanksItem;
	
	public PersimmonPlanks() {
		super("persimmon_planks");
		persimmonPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("persimmon_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return persimmonPlanksItem;
	}

}
