
package kaisoneo.endreimagined.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class EnderGrassBlock extends Block {
	public EnderGrassBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM)
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.stone.break")), () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.wart_block.step")),
						() -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.stone.place")), () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.stone.hit")),
						() -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.stone.fall"))))
				.strength(3f, 6f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
