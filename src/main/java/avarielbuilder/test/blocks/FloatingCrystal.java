package avarielbuilder.test.blocks;

import avarielbuilder.templates.AAvarielBlock;
import avarielbuilder.templates.IAvarielBlock;
import avarielbuilder.test.tileentity.TEFloatingCrystal;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class FloatingCrystal extends AAvarielBlock implements IAvarielBlock, ITileEntityProvider {

	private final ItemBlock floatingCrystalItem; 
	
	public FloatingCrystal(String name, Material material, Float hardness) {
		super("floating_crystal", Material.GLASS, 1F);
		floatingCrystalItem = (ItemBlock) new ItemBlock(this).setRegistryName("floating_crystal");
	}

	@Override
	public ItemBlock getItemBlock() {
		return floatingCrystalItem;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		// TODO Auto-generated method stub
		return new TEFloatingCrystal();
	}

}
