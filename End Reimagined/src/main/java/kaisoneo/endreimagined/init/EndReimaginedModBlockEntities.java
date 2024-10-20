
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package kaisoneo.endreimagined.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import kaisoneo.endreimagined.block.entity.PearSaplingBlockEntity;
import kaisoneo.endreimagined.EndReimaginedMod;

public class EndReimaginedModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, EndReimaginedMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> PEAR_SAPLING = register("pear_sapling", EndReimaginedModBlocks.PEAR_SAPLING, PearSaplingBlockEntity::new);

	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
