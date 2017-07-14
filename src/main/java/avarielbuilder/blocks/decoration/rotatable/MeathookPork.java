package avarielbuilder.blocks.decoration.rotatable;

import avarielbuilder.templates.AAvarielDecoRotatable;
import avarielbuilder.templates.IAvarielBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class MeathookPork extends AAvarielDecoRotatable {

	private final ItemBlock meathookPorkItem;
	
	public MeathookPork() {
		super("meathook_pork", Material.IRON);
		meathookPorkItem = (ItemBlock) new ItemBlock(this).setRegistryName("meathook_pork");
	}

	@Override
	public ItemBlock getItemBlock() {
		return meathookPorkItem;
	}

}
