package avarielbuilder.blocks.trees.planks;

import avarielbuilder.templates.AAvarielPlanks;
import net.minecraft.item.ItemBlock;

public class SequoiaPlanks extends AAvarielPlanks {

	private final ItemBlock sequoiaPlanksItem;
	
	public SequoiaPlanks() {
		super("sequoia_planks");
		sequoiaPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("sequoia_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return sequoiaPlanksItem;
	}

}
