package avarielbuilder.blocks.trees.planks;

import avarielbuilder.templates.AAvarielPlanks;
import net.minecraft.item.ItemBlock;

public class PalmPlanks extends AAvarielPlanks {

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
