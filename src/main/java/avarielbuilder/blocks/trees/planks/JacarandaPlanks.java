package avarielbuilder.blocks.trees.planks;

import avarielbuilder.templates.AAvarielPlanks;
import net.minecraft.item.ItemBlock;

public class JacarandaPlanks extends AAvarielPlanks {

	private final ItemBlock jacarandaPlanksItem;
	
	public JacarandaPlanks() {
		super("jacaranda_planks");
		jacarandaPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("jacaranda_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return jacarandaPlanksItem;
	}

}
