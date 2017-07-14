package avarielbuilder.blocks.trees.planks;

import avarielbuilder.templates.AAvarielPlanks;
import net.minecraft.item.ItemBlock;

public class CedarPlanks extends AAvarielPlanks {

	private final ItemBlock cedarPlanksItem;
	
	public CedarPlanks() {
		super("cedar_planks");
		cedarPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("cedar_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return cedarPlanksItem;
	}

}
