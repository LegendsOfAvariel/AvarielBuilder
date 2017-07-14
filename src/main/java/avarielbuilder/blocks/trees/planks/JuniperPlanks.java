package avarielbuilder.blocks.trees.planks;

import avarielbuilder.templates.AAvarielPlanks;
import net.minecraft.item.ItemBlock;

public class JuniperPlanks extends AAvarielPlanks {

	private final ItemBlock juniperPlanksItem;
	
	public JuniperPlanks() {
		super("juniper_planks");
		juniperPlanksItem = (ItemBlock) new ItemBlock(this).setRegistryName("juniper_planks");
	}

	@Override
	public ItemBlock getItemBlock() {
		return juniperPlanksItem;
	}

}
