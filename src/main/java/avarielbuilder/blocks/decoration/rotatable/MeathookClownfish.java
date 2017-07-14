package avarielbuilder.blocks.decoration.rotatable;

import avarielbuilder.templates.AAvarielDecoRotatable;
import avarielbuilder.templates.IAvarielBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class MeathookClownfish extends AAvarielDecoRotatable {

	private final ItemBlock meathookClownfishItem;
	
	public MeathookClownfish() {
		super("meathook_clownfish", Material.IRON);
		meathookClownfishItem = (ItemBlock) new ItemBlock(this).setRegistryName("meathook_clownfish");
	}

	@Override
	public ItemBlock getItemBlock() {
		return meathookClownfishItem;
	}

}
