package avarielbuilder.blocks.trees.planks;

import avarielbuilder.templates.AAvarielPlanks;
import net.minecraft.item.ItemBlock;

public class AshPlanks extends AAvarielPlanks {

	private final ItemBlock ashPlanksItem;
	
	public AshPlanks() {
		super("ash_planks");
		ashPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("ash_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return ashPlanksItem;
	}

}
