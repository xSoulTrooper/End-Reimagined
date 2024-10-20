
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package kaisoneo.endreimagined.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import kaisoneo.endreimagined.EndReimaginedMod;

public class EndReimaginedModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EndReimaginedMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> THE_END_UPDATE_NATURE = REGISTRY.register("the_end_update_nature",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.end_reimagined.the_end_update_nature")).icon(() -> new ItemStack(EndReimaginedModBlocks.ENDER_GRASS_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EndReimaginedModBlocks.ENDER_GRASS_BLOCK.get().asItem());
				tabData.accept(EndReimaginedModBlocks.SHADOW_GRASS_BLOCK.get().asItem());
				tabData.accept(EndReimaginedModBlocks.ENDER_DEBRIS.get().asItem());
				tabData.accept(EndReimaginedModBlocks.ETHEREAL_LOG.get().asItem());
				tabData.accept(EndReimaginedModBlocks.ETHEREAL_LEAVES.get().asItem());
				tabData.accept(EndReimaginedModBlocks.ENDER_MUSHROOM.get().asItem());
				tabData.accept(EndReimaginedModBlocks.END_GRASS.get().asItem());
				tabData.accept(EndReimaginedModBlocks.BUSHYGRASS.get().asItem());
				tabData.accept(EndReimaginedModBlocks.BUSHY_GRASS_TALL.get().asItem());
				tabData.accept(EndReimaginedModBlocks.SHADOW_PEAR_LOG.get().asItem());
				tabData.accept(EndReimaginedModBlocks.SHADOW_PEAR_LEAVES.get().asItem());
				tabData.accept(EndReimaginedModBlocks.SHADOW_MOSHROOM.get().asItem());
				tabData.accept(EndReimaginedModBlocks.SHADOW_GRASS.get().asItem());
				tabData.accept(EndReimaginedModBlocks.SHADOW_ROOTS.get().asItem());
				tabData.accept(EndReimaginedModItems.SHADOW_PEAR.get());
				tabData.accept(EndReimaginedModBlocks.PEAR_SAPLING.get().asItem());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> THE_END_UPDATE_COMABT = REGISTRY.register("the_end_update_comabt",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.end_reimagined.the_end_update_comabt")).icon(() -> new ItemStack(EndReimaginedModItems.ENDERITE_AXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EndReimaginedModItems.ENDERITE_SWORD.get());
				tabData.accept(EndReimaginedModItems.ENDERITE_AXE.get());
				tabData.accept(EndReimaginedModItems.ENDRITE_ARMOR_HELMET.get());
				tabData.accept(EndReimaginedModItems.ENDRITE_ARMOR_CHESTPLATE.get());
				tabData.accept(EndReimaginedModItems.ENDRITE_ARMOR_LEGGINGS.get());
				tabData.accept(EndReimaginedModItems.ENDRITE_ARMOR_BOOTS.get());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> THE_END_UPDATE_INGREDIENTS = REGISTRY.register("the_end_update_ingredients",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.end_reimagined.the_end_update_ingredients")).icon(() -> new ItemStack(EndReimaginedModItems.ENDERITE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EndReimaginedModItems.ENDRITE_STONE.get());
				tabData.accept(EndReimaginedModItems.ENDERITE.get());
				tabData.accept(EndReimaginedModItems.ENDERITE_UPGADE_SMITHING_TEMPLADE.get());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> THE_END_UPDATE_BUILDING_BLOCKS = REGISTRY.register("the_end_update_building_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.end_reimagined.the_end_update_building_blocks")).icon(() -> new ItemStack(EndReimaginedModBlocks.ETHEREAL_PLANKS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EndReimaginedModBlocks.ETHEREAL_LOG.get().asItem());
				tabData.accept(EndReimaginedModBlocks.ETHEREAL_WOOD.get().asItem());
				tabData.accept(EndReimaginedModBlocks.ETHEREAL_PLANKS.get().asItem());
				tabData.accept(EndReimaginedModBlocks.ETHEREAL_STAIRS.get().asItem());
				tabData.accept(EndReimaginedModBlocks.ETHEREAL_SLAB.get().asItem());
				tabData.accept(EndReimaginedModBlocks.ETHEREAL_FENCE.get().asItem());
				tabData.accept(EndReimaginedModBlocks.ETHEREAL_FENCE_GATE.get().asItem());
				tabData.accept(EndReimaginedModBlocks.ETHEREAL_DOOR.get().asItem());
				tabData.accept(EndReimaginedModBlocks.ETHEREAL_TRAPDOOR.get().asItem());
				tabData.accept(EndReimaginedModBlocks.ETHEREAL_PRESSURE_PLATE.get().asItem());
				tabData.accept(EndReimaginedModBlocks.ETHEREAL_BUTTON.get().asItem());
				tabData.accept(EndReimaginedModBlocks.SHADOW_PEAR_WOOD.get().asItem());
				tabData.accept(EndReimaginedModBlocks.SHADOW_PEAR_LOG.get().asItem());
				tabData.accept(EndReimaginedModBlocks.SHADOW_PEAR_PLANKS.get().asItem());
				tabData.accept(EndReimaginedModBlocks.SHADOW_PEAR_STAIRS.get().asItem());
				tabData.accept(EndReimaginedModBlocks.SHADOW_PEAR_SLAB.get().asItem());
				tabData.accept(EndReimaginedModBlocks.SHADOW_PEAR_FENCE.get().asItem());
				tabData.accept(EndReimaginedModBlocks.SHADOW_PEAR_FENCE_GATE.get().asItem());
				tabData.accept(EndReimaginedModBlocks.SHADOW_PEAR_DOOR.get().asItem());
				tabData.accept(EndReimaginedModBlocks.SHADOW_PEAR_TRAP_DOOR.get().asItem());
				tabData.accept(EndReimaginedModBlocks.SHADOW_PEAR_PRESSURE_PLATE.get().asItem());
				tabData.accept(EndReimaginedModBlocks.SHADOW_PEAR_BUTTON.get().asItem());
				tabData.accept(EndReimaginedModBlocks.PURPUR_BRICK_WALL.get().asItem());
				tabData.accept(EndReimaginedModBlocks.CRACKED_PURPUR_BLOCK.get().asItem());
				tabData.accept(EndReimaginedModBlocks.ENDRITE_BLOCK.get().asItem());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> THE_END_UPDATE_TOOLS = REGISTRY.register("the_end_update_tools",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.end_reimagined.the_end_update_tools")).icon(() -> new ItemStack(EndReimaginedModItems.ENDERITE_PICKAXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EndReimaginedModItems.ENDERITE_SHOVEL.get());
				tabData.accept(EndReimaginedModItems.ENDERITE_PICKAXE.get());
				tabData.accept(EndReimaginedModItems.ENDERITE_AXE.get());
				tabData.accept(EndReimaginedModItems.ENDERITE_HOE.get());
				tabData.accept(EndReimaginedModItems.MUSIC_DISC_ADVANTURE.get());
				tabData.accept(EndReimaginedModItems.MUSIC_DISC_CRYSTAL.get());
				tabData.accept(EndReimaginedModItems.MUSIC_DISC_JEAN.get());
				tabData.accept(EndReimaginedModItems.MUSIC_DISCSPIELCHIP.get());
				tabData.accept(EndReimaginedModItems.MUSIC_DISC_WANDERER.get());
			})

					.build());
}
