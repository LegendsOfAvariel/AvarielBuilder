package avarielbuilder.blocks.decoration.rotatable;

import avarielbuilder.templates.AAvarielDecoRotatable;
import avarielbuilder.templates.IAvarielBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class CouchRight extends AAvarielDecoRotatable {

	private final ItemBlock couchRightItem;
	
	public CouchRight() {
		super("couch_right", Material.WOOD);
		couchRightItem = (ItemBlock) new ItemBlock(this).setRegistryName("couch_right");
	}

	@Override
	public ItemBlock getItemBlock() {
		return couchRightItem;
	}

}
