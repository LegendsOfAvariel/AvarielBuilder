package avarielbuilder.templates;

import avarielbuilder.AvarielTabs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public abstract class AAvarielPlanks extends AAvarielBlock implements IAvarielBlock {

	public AAvarielPlanks(String name) {
		super(name, Material.WOOD, 2.0F);
		this.setSoundType(SoundType.WOOD);
		this.setCreativeTab(AvarielTabs.tabAvarielTrees);
	}

}
