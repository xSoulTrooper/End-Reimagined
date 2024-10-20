
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package kaisoneo.endreimagined.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.core.registries.Registries;

import kaisoneo.endreimagined.enchantment.EndweaverEnchantment;
import kaisoneo.endreimagined.EndReimaginedMod;

public class EndReimaginedModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(Registries.ENCHANTMENT, EndReimaginedMod.MODID);
	public static final DeferredHolder<Enchantment, Enchantment> ENDWEAVER = REGISTRY.register("endweaver", () -> new EndweaverEnchantment());
}
