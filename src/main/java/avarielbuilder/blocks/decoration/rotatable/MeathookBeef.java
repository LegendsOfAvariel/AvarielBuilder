package avarielbuilder.blocks.decoration.rotatable;

import avarielbuilder.templates.AAvarielDecoRotatable;
import avarielbuilder.templates.IAvarielBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class MeathookBeef extends AAvarielDecoRotatable {

	private final ItemBlock meathookBeefItem;
	
	public MeathookBeef() {
		super("meathook_beef", Material.IRON);
		meathookBeefItem = (ItemBlock) new ItemBlock(this).setRegistryName("meathook_beef");
	}

	@Override
	public ItemBlock getItemBlock() {
		return meathookBeefItem;
	}

}
