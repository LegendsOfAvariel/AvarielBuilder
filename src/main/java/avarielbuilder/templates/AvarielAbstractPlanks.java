package avarielbuilder.templates;

import avarielbuilder.AvarielTabs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public abstract class AvarielAbstractPlanks extends AvarielAbstractBlock implements AvarielBlock {

	public AvarielAbstractPlanks(String name) {
		super(name, Material.WOOD, 2.0F);
		this.setSoundType(SoundType.WOOD);
		this.setCreativeTab(AvarielTabs.tabAvarielTrees);
	}

}
