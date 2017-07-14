package avarielbuilder.blocks.trees.planks;

import avarielbuilder.templates.AAvarielPlanks;
import net.minecraft.item.ItemBlock;

public class WillowPlanks extends AAvarielPlanks {

	private final ItemBlock willowPlanksItem;
	
	public WillowPlanks() {
		super("willow_planks");
		willowPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("willow_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return willowPlanksItem;
	}

}
