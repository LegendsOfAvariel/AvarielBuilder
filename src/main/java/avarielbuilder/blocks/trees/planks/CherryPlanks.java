package avarielbuilder.blocks.trees.planks;

import avarielbuilder.templates.AAvarielPlanks;
import net.minecraft.item.ItemBlock;

public class CherryPlanks extends AAvarielPlanks {

	private final ItemBlock cherryPlanksItem;
	
	public CherryPlanks() {
		super("cherry_planks");
		cherryPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("cherry_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return cherryPlanksItem;
	}

}
