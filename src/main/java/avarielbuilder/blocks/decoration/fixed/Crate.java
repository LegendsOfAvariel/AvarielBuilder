package avarielbuilder.blocks.decoration.fixed;

import avarielbuilder.templates.AAvarielDecoFixed;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class Crate extends AAvarielDecoFixed {

	private final ItemBlock crateItem;
	
	public Crate() {
		super("crate", Material.WOOD);
		crateItem = (ItemBlock) new ItemBlock(this).setRegistryName("crate");
	}

	@Override
	public ItemBlock getItemBlock() {
		return crateItem;
	}

}
