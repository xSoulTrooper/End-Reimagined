
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package kaisoneo.endreimagined.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import kaisoneo.endreimagined.block.ShadowRootsBlock;
import kaisoneo.endreimagined.block.ShadowPearWoodBlock;
import kaisoneo.endreimagined.block.ShadowPearTrapDoorBlock;
import kaisoneo.endreimagined.block.ShadowPearStairsBlock;
import kaisoneo.endreimagined.block.ShadowPearSlabBlock;
import kaisoneo.endreimagined.block.ShadowPearPressurePlateBlock;
import kaisoneo.endreimagined.block.ShadowPearPlanksBlock;
import kaisoneo.endreimagined.block.ShadowPearLogBlock;
import kaisoneo.endreimagined.block.ShadowPearLeavesBlock;
import kaisoneo.endreimagined.block.ShadowPearFenceGateBlock;
import kaisoneo.endreimagined.block.ShadowPearFenceBlock;
import kaisoneo.endreimagined.block.ShadowPearDoorBlock;
import kaisoneo.endreimagined.block.ShadowPearButtonBlock;
import kaisoneo.endreimagined.block.ShadowMoshroomBlock;
import kaisoneo.endreimagined.block.ShadowGrassBlockBlock;
import kaisoneo.endreimagined.block.ShadowGrassBlock;
import kaisoneo.endreimagined.block.PurpurbrickwallBlock;
import kaisoneo.endreimagined.block.PearSaplingBlock;
import kaisoneo.endreimagined.block.EtherealWoodBlock;
import kaisoneo.endreimagined.block.EtherealTrapdoorBlock;
import kaisoneo.endreimagined.block.EtherealStairsBlock;
import kaisoneo.endreimagined.block.EtherealSlabBlock;
import kaisoneo.endreimagined.block.EtherealPressurePlateBlock;
import kaisoneo.endreimagined.block.EtherealPlanksBlock;
import kaisoneo.endreimagined.block.EtherealLogBlock;
import kaisoneo.endreimagined.block.EtherealLeavesBlock;
import kaisoneo.endreimagined.block.EtherealFenceGateBlock;
import kaisoneo.endreimagined.block.EtherealFenceBlock;
import kaisoneo.endreimagined.block.EtherealDoorBlock;
import kaisoneo.endreimagined.block.EtherealButtonBlock;
import kaisoneo.endreimagined.block.EndriteOreBlock;
import kaisoneo.endreimagined.block.EndriteBlockBlock;
import kaisoneo.endreimagined.block.EndermoshroomBlock;
import kaisoneo.endreimagined.block.EnderGrassBlock;
import kaisoneo.endreimagined.block.EndGrassBlock;
import kaisoneo.endreimagined.block.CrackedPurpurBlockBlock;
import kaisoneo.endreimagined.block.BushygrassBlock;
import kaisoneo.endreimagined.block.BushyGrassTallBlock;
import kaisoneo.endreimagined.EndReimaginedMod;

public class EndReimaginedModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(EndReimaginedMod.MODID);
	public static final DeferredHolder<Block, Block> ENDER_DEBRIS = REGISTRY.register("ender_debris", EndriteOreBlock::new);
	public static final DeferredHolder<Block, Block> ENDRITE_BLOCK = REGISTRY.register("endrite_block", EndriteBlockBlock::new);
	public static final DeferredHolder<Block, Block> ENDER_GRASS_BLOCK = REGISTRY.register("ender_grass_block", EnderGrassBlock::new);
	public static final DeferredHolder<Block, Block> BUSHYGRASS = REGISTRY.register("bushygrass", BushygrassBlock::new);
	public static final DeferredHolder<Block, Block> BUSHY_GRASS_TALL = REGISTRY.register("bushy_grass_tall", BushyGrassTallBlock::new);
	public static final DeferredHolder<Block, Block> ETHEREAL_WOOD = REGISTRY.register("ethereal_wood", EtherealWoodBlock::new);
	public static final DeferredHolder<Block, Block> ETHEREAL_LOG = REGISTRY.register("ethereal_log", EtherealLogBlock::new);
	public static final DeferredHolder<Block, Block> ETHEREAL_PLANKS = REGISTRY.register("ethereal_planks", EtherealPlanksBlock::new);
	public static final DeferredHolder<Block, Block> ETHEREAL_STAIRS = REGISTRY.register("ethereal_stairs", EtherealStairsBlock::new);
	public static final DeferredHolder<Block, Block> ETHEREAL_SLAB = REGISTRY.register("ethereal_slab", EtherealSlabBlock::new);
	public static final DeferredHolder<Block, Block> ETHEREAL_FENCE = REGISTRY.register("ethereal_fence", EtherealFenceBlock::new);
	public static final DeferredHolder<Block, Block> ETHEREAL_FENCE_GATE = REGISTRY.register("ethereal_fence_gate", EtherealFenceGateBlock::new);
	public static final DeferredHolder<Block, Block> ETHEREAL_PRESSURE_PLATE = REGISTRY.register("ethereal_pressure_plate", EtherealPressurePlateBlock::new);
	public static final DeferredHolder<Block, Block> ETHEREAL_BUTTON = REGISTRY.register("ethereal_button", EtherealButtonBlock::new);
	public static final DeferredHolder<Block, Block> END_GRASS = REGISTRY.register("end_grass", EndGrassBlock::new);
	public static final DeferredHolder<Block, Block> ETHEREAL_DOOR = REGISTRY.register("ethereal_door", EtherealDoorBlock::new);
	public static final DeferredHolder<Block, Block> ETHEREAL_TRAPDOOR = REGISTRY.register("ethereal_trapdoor", EtherealTrapdoorBlock::new);
	public static final DeferredHolder<Block, Block> ENDER_MUSHROOM = REGISTRY.register("ender_mushroom", EndermoshroomBlock::new);
	public static final DeferredHolder<Block, Block> SHADOW_GRASS_BLOCK = REGISTRY.register("shadow_grass_block", ShadowGrassBlockBlock::new);
	public static final DeferredHolder<Block, Block> PURPUR_BRICK_WALL = REGISTRY.register("purpur_brick_wall", PurpurbrickwallBlock::new);
	public static final DeferredHolder<Block, Block> SHADOW_GRASS = REGISTRY.register("shadow_grass", ShadowGrassBlock::new);
	public static final DeferredHolder<Block, Block> CRACKED_PURPUR_BLOCK = REGISTRY.register("cracked_purpur_block", CrackedPurpurBlockBlock::new);
	public static final DeferredHolder<Block, Block> SHADOW_PEAR_WOOD = REGISTRY.register("shadow_pear_wood", ShadowPearWoodBlock::new);
	public static final DeferredHolder<Block, Block> SHADOW_PEAR_LOG = REGISTRY.register("shadow_pear_log", ShadowPearLogBlock::new);
	public static final DeferredHolder<Block, Block> SHADOW_PEAR_PLANKS = REGISTRY.register("shadow_pear_planks", ShadowPearPlanksBlock::new);
	public static final DeferredHolder<Block, Block> SHADOW_PEAR_LEAVES = REGISTRY.register("shadow_pear_leaves", ShadowPearLeavesBlock::new);
	public static final DeferredHolder<Block, Block> SHADOW_PEAR_STAIRS = REGISTRY.register("shadow_pear_stairs", ShadowPearStairsBlock::new);
	public static final DeferredHolder<Block, Block> SHADOW_PEAR_SLAB = REGISTRY.register("shadow_pear_slab", ShadowPearSlabBlock::new);
	public static final DeferredHolder<Block, Block> SHADOW_PEAR_FENCE = REGISTRY.register("shadow_pear_fence", ShadowPearFenceBlock::new);
	public static final DeferredHolder<Block, Block> SHADOW_PEAR_FENCE_GATE = REGISTRY.register("shadow_pear_fence_gate", ShadowPearFenceGateBlock::new);
	public static final DeferredHolder<Block, Block> SHADOW_PEAR_PRESSURE_PLATE = REGISTRY.register("shadow_pear_pressure_plate", ShadowPearPressurePlateBlock::new);
	public static final DeferredHolder<Block, Block> SHADOW_PEAR_BUTTON = REGISTRY.register("shadow_pear_button", ShadowPearButtonBlock::new);
	public static final DeferredHolder<Block, Block> SHADOW_ROOTS = REGISTRY.register("shadow_roots", ShadowRootsBlock::new);
	public static final DeferredHolder<Block, Block> SHADOW_MOSHROOM = REGISTRY.register("shadow_moshroom", ShadowMoshroomBlock::new);
	public static final DeferredHolder<Block, Block> SHADOW_PEAR_DOOR = REGISTRY.register("shadow_pear_door", ShadowPearDoorBlock::new);
	public static final DeferredHolder<Block, Block> SHADOW_PEAR_TRAP_DOOR = REGISTRY.register("shadow_pear_trap_door", ShadowPearTrapDoorBlock::new);
	public static final DeferredHolder<Block, Block> ETHEREAL_LEAVES = REGISTRY.register("ethereal_leaves", EtherealLeavesBlock::new);
	public static final DeferredHolder<Block, Block> PEAR_SAPLING = REGISTRY.register("pear_sapling", PearSaplingBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
