package avarielbuilder.blocks.decoration.rotatable;

import avarielbuilder.templates.AAvarielDecoRotatable;
import avarielbuilder.templates.IAvarielBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class CouchLeft extends AAvarielDecoRotatable {

	private final ItemBlock couchLeftItem;
	
	public CouchLeft() {
		super("couch_left", Material.WOOD);
		couchLeftItem = (ItemBlock) new ItemBlock(this).setRegistryName("couch_left");
	}

	@Override
	public ItemBlock getItemBlock() {
		return couchLeftItem;
	}

}
