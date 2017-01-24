package avarielbuilder.blocks.planks;

import avarielbuilder.templates.AvarielAbstractPlanks;
import net.minecraft.item.ItemBlock;

public class PersimmonPlanks extends AvarielAbstractPlanks {

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
