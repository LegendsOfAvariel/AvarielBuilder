package avarielbuilder.blocks.trees.planks;

import avarielbuilder.templates.AAvarielPlanks;
import net.minecraft.item.ItemBlock;

public class WhiteOakPlanks extends AAvarielPlanks {

	private final ItemBlock whiteOakPlanksItem;
	
	public WhiteOakPlanks() {
		super("white_oak_planks");
		whiteOakPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("white_oak_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return whiteOakPlanksItem;
	}

}
