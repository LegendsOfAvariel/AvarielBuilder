package avarielbuilder.templates;

import avarielbuilder.AvarielTabs;
import net.minecraft.block.BlockLog;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public abstract class AvarielLog extends BlockLog {
	
	public AvarielLog(String name){
		this.setRegistryName(name);
		this.setUnlocalizedName(this.getRegistryName().toString());
		
		this.setCreativeTab(AvarielTabs.tabAvarielTrees);
		
		this.setDefaultState(blockState.getBaseState().withProperty(LOG_AXIS, BlockLog.EnumAxis.Y));
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		IBlockState blockstate = getDefaultState();
		
		switch(meta & 3) {
		case 0: blockstate = blockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Y); break;
		case 1: blockstate = blockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.X); break;
		case 2: blockstate = blockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Z); break;
		default: blockstate = blockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.NONE);
		}
		
		return blockstate;
	}
	
	@Override
	@SuppressWarnings("incomplete-switch")
	public int getMetaFromState(IBlockState state) {
		int meta = 0;
		
		switch(state.getValue(LOG_AXIS)) {
		case X: meta |= 1; break;
		case Z: meta |= 2; break;
		case NONE: meta |= 3;
		}
		
		return meta;
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {LOG_AXIS});
	}
	
	//Applies textures and models to a given block and it's item form.
	public void render() {
		Item item = Item.getItemFromBlock(this);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
		
	//Registers a block and itemblock pair. This exists for the sake of compactness.
	public void register() {
		GameRegistry.register(this);
		GameRegistry.register(this.getItemBlock());
	}
	
	public abstract ItemBlock getItemBlock();
    
}
