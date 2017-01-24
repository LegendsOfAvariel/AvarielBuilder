package avarielbuilder.blocks.planks;

import avarielbuilder.templates.AvarielAbstractPlanks;
import net.minecraft.item.ItemBlock;

public class PalmPlanks extends AvarielAbstractPlanks {

	private final ItemBlock palmPlanksItem;
	
	public PalmPlanks() {
		super("palm_planks");
		palmPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("palm_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return palmPlanksItem;
	}

}
