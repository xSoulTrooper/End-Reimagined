
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package kaisoneo.endreimagined.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

import kaisoneo.endreimagined.item.ShadowPearItem;
import kaisoneo.endreimagined.item.MusicDiscspielchipItem;
import kaisoneo.endreimagined.item.MusicDiscWandererItem;
import kaisoneo.endreimagined.item.MusicDiscJeanItem;
import kaisoneo.endreimagined.item.MusicDiscItem;
import kaisoneo.endreimagined.item.MusicDisc2Item;
import kaisoneo.endreimagined.item.Endrite_ArmorArmorItem;
import kaisoneo.endreimagined.item.EndriteItem;
import kaisoneo.endreimagined.item.EnderiteUpgadeItem;
import kaisoneo.endreimagined.item.EnderiteToolSwordItem;
import kaisoneo.endreimagined.item.EnderiteToolShovelItem;
import kaisoneo.endreimagined.item.EnderiteToolPickaxeItem;
import kaisoneo.endreimagined.item.EnderiteToolHoeItem;
import kaisoneo.endreimagined.item.EnderiteToolAxeItem;
import kaisoneo.endreimagined.item.EnderiteItem;
import kaisoneo.endreimagined.EndReimaginedMod;

public class EndReimaginedModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, EndReimaginedMod.MODID);
	public static final DeferredHolder<Item, Item> MUSIC_DISC_ADVANTURE = REGISTRY.register("music_disc_advanture", MusicDiscItem::new);
	public static final DeferredHolder<Item, Item> ENDRITE_STONE = REGISTRY.register("endrite_stone", EndriteItem::new);
	public static final DeferredHolder<Item, Item> ENDER_DEBRIS = block(EndReimaginedModBlocks.ENDER_DEBRIS);
	public static final DeferredHolder<Item, Item> ENDRITE_BLOCK = block(EndReimaginedModBlocks.ENDRITE_BLOCK);
	public static final DeferredHolder<Item, Item> ENDRITE_ARMOR_HELMET = REGISTRY.register("endrite_armor_helmet", Endrite_ArmorArmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> ENDRITE_ARMOR_CHESTPLATE = REGISTRY.register("endrite_armor_chestplate", Endrite_ArmorArmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> ENDRITE_ARMOR_LEGGINGS = REGISTRY.register("endrite_armor_leggings", Endrite_ArmorArmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> ENDRITE_ARMOR_BOOTS = REGISTRY.register("endrite_armor_boots", Endrite_ArmorArmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> ENDERITE_UPGADE_SMITHING_TEMPLADE = REGISTRY.register("enderite_upgade_smithing_templade", EnderiteUpgadeItem::new);
	public static final DeferredHolder<Item, Item> MUSIC_DISC_CRYSTAL = REGISTRY.register("music_disc_crystal", MusicDisc2Item::new);
	public static final DeferredHolder<Item, Item> MUSIC_DISC_JEAN = REGISTRY.register("music_disc_jean", MusicDiscJeanItem::new);
	public static final DeferredHolder<Item, Item> MUSIC_DISCSPIELCHIP = REGISTRY.register("music_discspielchip", MusicDiscspielchipItem::new);
	public static final DeferredHolder<Item, Item> MUSIC_DISC_WANDERER = REGISTRY.register("music_disc_wanderer", MusicDiscWandererItem::new);
	public static final DeferredHolder<Item, Item> ENDERITE = REGISTRY.register("enderite", EnderiteItem::new);
	public static final DeferredHolder<Item, Item> ENDERITE_PICKAXE = REGISTRY.register("enderite_pickaxe", EnderiteToolPickaxeItem::new);
	public static final DeferredHolder<Item, Item> ENDERITE_AXE = REGISTRY.register("enderite_axe", EnderiteToolAxeItem::new);
	public static final DeferredHolder<Item, Item> ENDERITE_SWORD = REGISTRY.register("enderite_sword", EnderiteToolSwordItem::new);
	public static final DeferredHolder<Item, Item> ENDERITE_SHOVEL = REGISTRY.register("enderite_shovel", EnderiteToolShovelItem::new);
	public static final DeferredHolder<Item, Item> ENDERITE_HOE = REGISTRY.register("enderite_hoe", EnderiteToolHoeItem::new);
	public static final DeferredHolder<Item, Item> ENDER_GRASS_BLOCK = block(EndReimaginedModBlocks.ENDER_GRASS_BLOCK);
	public static final DeferredHolder<Item, Item> BUSHYGRASS = block(EndReimaginedModBlocks.BUSHYGRASS);
	public static final DeferredHolder<Item, Item> BUSHY_GRASS_TALL = block(EndReimaginedModBlocks.BUSHY_GRASS_TALL);
	public static final DeferredHolder<Item, Item> ETHEREAL_WOOD = block(EndReimaginedModBlocks.ETHEREAL_WOOD);
	public static final DeferredHolder<Item, Item> ETHEREAL_LOG = block(EndReimaginedModBlocks.ETHEREAL_LOG);
	public static final DeferredHolder<Item, Item> ETHEREAL_PLANKS = block(EndReimaginedModBlocks.ETHEREAL_PLANKS);
	public static final DeferredHolder<Item, Item> ETHEREAL_STAIRS = block(EndReimaginedModBlocks.ETHEREAL_STAIRS);
	public static final DeferredHolder<Item, Item> ETHEREAL_SLAB = block(EndReimaginedModBlocks.ETHEREAL_SLAB);
	public static final DeferredHolder<Item, Item> ETHEREAL_FENCE = block(EndReimaginedModBlocks.ETHEREAL_FENCE);
	public static final DeferredHolder<Item, Item> ETHEREAL_FENCE_GATE = block(EndReimaginedModBlocks.ETHEREAL_FENCE_GATE);
	public static final DeferredHolder<Item, Item> ETHEREAL_PRESSURE_PLATE = block(EndReimaginedModBlocks.ETHEREAL_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> ETHEREAL_BUTTON = block(EndReimaginedModBlocks.ETHEREAL_BUTTON);
	public static final DeferredHolder<Item, Item> END_GRASS = block(EndReimaginedModBlocks.END_GRASS);
	public static final DeferredHolder<Item, Item> ETHEREAL_DOOR = doubleBlock(EndReimaginedModBlocks.ETHEREAL_DOOR);
	public static final DeferredHolder<Item, Item> ETHEREAL_TRAPDOOR = block(EndReimaginedModBlocks.ETHEREAL_TRAPDOOR);
	public static final DeferredHolder<Item, Item> ENDER_MUSHROOM = block(EndReimaginedModBlocks.ENDER_MUSHROOM);
	public static final DeferredHolder<Item, Item> SHADOW_GRASS_BLOCK = block(EndReimaginedModBlocks.SHADOW_GRASS_BLOCK);
	public static final DeferredHolder<Item, Item> PURPUR_BRICK_WALL = block(EndReimaginedModBlocks.PURPUR_BRICK_WALL);
	public static final DeferredHolder<Item, Item> SHADOW_GRASS = block(EndReimaginedModBlocks.SHADOW_GRASS);
	public static final DeferredHolder<Item, Item> CRACKED_PURPUR_BLOCK = block(EndReimaginedModBlocks.CRACKED_PURPUR_BLOCK);
	public static final DeferredHolder<Item, Item> SHADOW_PEAR_WOOD = block(EndReimaginedModBlocks.SHADOW_PEAR_WOOD);
	public static final DeferredHolder<Item, Item> SHADOW_PEAR_LOG = block(EndReimaginedModBlocks.SHADOW_PEAR_LOG);
	public static final DeferredHolder<Item, Item> SHADOW_PEAR_PLANKS = block(EndReimaginedModBlocks.SHADOW_PEAR_PLANKS);
	public static final DeferredHolder<Item, Item> SHADOW_PEAR_LEAVES = block(EndReimaginedModBlocks.SHADOW_PEAR_LEAVES);
	public static final DeferredHolder<Item, Item> SHADOW_PEAR_STAIRS = block(EndReimaginedModBlocks.SHADOW_PEAR_STAIRS);
	public static final DeferredHolder<Item, Item> SHADOW_PEAR_SLAB = block(EndReimaginedModBlocks.SHADOW_PEAR_SLAB);
	public static final DeferredHolder<Item, Item> SHADOW_PEAR_FENCE = block(EndReimaginedModBlocks.SHADOW_PEAR_FENCE);
	public static final DeferredHolder<Item, Item> SHADOW_PEAR_FENCE_GATE = block(EndReimaginedModBlocks.SHADOW_PEAR_FENCE_GATE);
	public static final DeferredHolder<Item, Item> SHADOW_PEAR_PRESSURE_PLATE = block(EndReimaginedModBlocks.SHADOW_PEAR_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> SHADOW_PEAR_BUTTON = block(EndReimaginedModBlocks.SHADOW_PEAR_BUTTON);
	public static final DeferredHolder<Item, Item> SHADOW_ROOTS = block(EndReimaginedModBlocks.SHADOW_ROOTS);
	public static final DeferredHolder<Item, Item> SHADOW_MOSHROOM = block(EndReimaginedModBlocks.SHADOW_MOSHROOM);
	public static final DeferredHolder<Item, Item> SHADOW_PEAR_DOOR = doubleBlock(EndReimaginedModBlocks.SHADOW_PEAR_DOOR);
	public static final DeferredHolder<Item, Item> SHADOW_PEAR_TRAP_DOOR = block(EndReimaginedModBlocks.SHADOW_PEAR_TRAP_DOOR);
	public static final DeferredHolder<Item, Item> ETHEREAL_LEAVES = block(EndReimaginedModBlocks.ETHEREAL_LEAVES);
	public static final DeferredHolder<Item, Item> SHADOW_PEAR = REGISTRY.register("shadow_pear", ShadowPearItem::new);
	public static final DeferredHolder<Item, Item> PEAR_SAPLING = block(EndReimaginedModBlocks.PEAR_SAPLING);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static DeferredHolder<Item, Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
