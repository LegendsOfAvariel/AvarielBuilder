package avarielbuilder.test.blocks;

import avarielbuilder.templates.AAvarielBlock;
import avarielbuilder.templates.IAvarielBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class CullingTester extends AAvarielBlock implements IAvarielBlock {

	private final ItemBlock cullingTesterItem;
	
	public CullingTester() {
		super("culling_tester", Material.BARRIER, -1F);
		cullingTesterItem = (ItemBlock) new ItemBlock(this).setRegistryName("culling_tester");
	}

	@Override
	public ItemBlock getItemBlock() {
		return cullingTesterItem;
	}

}
