package avarielbuilder.blocks.trees.planks;

import avarielbuilder.templates.AAvarielPlanks;
import net.minecraft.item.ItemBlock;

public class EbonyPlanks extends AAvarielPlanks {

	private final ItemBlock ebonyPlanksItem;
	
	public EbonyPlanks() {
		super("ebony_planks");
		ebonyPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("ebony_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return ebonyPlanksItem;
	}

}
