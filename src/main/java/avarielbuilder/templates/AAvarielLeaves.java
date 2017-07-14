package avarielbuilder.templates;

import java.util.Random;

import avarielbuilder.AvarielTabs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class AAvarielLeaves extends AAvarielBlock implements IAvarielBlock {

	public AAvarielLeaves(String name) {
		super(name, Material.LEAVES, 0.5F);
		this.setSoundType(SoundType.PLANT);
		this.setCreativeTab(AvarielTabs.tabAvarielTrees);
	}
	
	//The following two methods define the block as transparent and stops it from culling faces.
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	//Leaves won't drop when broken (TODO Make them drop when using shears)
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return null;
	}
	
	//Renders on the same layer as ladders and vines do
	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT_MIPPED;
	}
	
}
