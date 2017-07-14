package avarielbuilder.templates;

import avarielbuilder.AvarielTabs;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class AAvarielDecoRotatable extends BlockHorizontal implements IAvarielBlock {

	public AAvarielDecoRotatable(String name, Material material) {
		super(material);
		
		this.setRegistryName(name);
		this.setUnlocalizedName(this.getRegistryName().toString());
		
		this.setCreativeTab(AvarielTabs.tabAvarielDeco);
		
		this.setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		IBlockState blockstate = getDefaultState();
		
		switch(meta) {
		case 0: blockstate = blockstate.withProperty(FACING, EnumFacing.NORTH); break;
		case 1: blockstate = blockstate.withProperty(FACING, EnumFacing.EAST); break;
		case 2: blockstate = blockstate.withProperty(FACING, EnumFacing.SOUTH); break;
		case 3: blockstate = blockstate.withProperty(FACING, EnumFacing.WEST);
		}
		
		return blockstate;
	}
	
	@Override
	@SuppressWarnings("incomplete-switch")
	public int getMetaFromState(IBlockState state) {
		int meta = 0;
		
		switch(state.getValue(FACING)) {
		case EAST: meta |= 1; break;
		case SOUTH: meta |= 2; break;
		case WEST: meta |= 3;
		}
		
		return meta;
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {FACING});
	}
	
	@Override
	public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT_MIPPED;
	}
	
	//Applies textures and models to the block and it's item form.
	@Override
	public void render() {
		Item item = Item.getItemFromBlock(this);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
		
	//Registers the block and itemblock pair.
	@Override
	public void register() {
		GameRegistry.register(this);
		GameRegistry.register(this.getItemBlock());
	}
	
}
