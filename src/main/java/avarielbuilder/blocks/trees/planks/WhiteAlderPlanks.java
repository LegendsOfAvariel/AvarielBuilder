package avarielbuilder.blocks.trees.planks;

import avarielbuilder.templates.AAvarielPlanks;
import net.minecraft.item.ItemBlock;

public class WhiteAlderPlanks extends AAvarielPlanks {

	private final ItemBlock whiteAlderPlanksItem;
	
	public WhiteAlderPlanks() {
		super("white_alder_planks");
		whiteAlderPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("white_alder_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return whiteAlderPlanksItem;
	}

}
