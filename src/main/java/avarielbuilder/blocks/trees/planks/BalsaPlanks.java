package avarielbuilder.blocks.trees.planks;

import avarielbuilder.templates.AAvarielPlanks;
import net.minecraft.item.ItemBlock;

public class BalsaPlanks extends AAvarielPlanks {

	private final ItemBlock balsaPlanksItem;
	
	public BalsaPlanks() {
		super("balsa_planks");
		balsaPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("balsa_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return balsaPlanksItem;
	}

}
