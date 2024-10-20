
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package kaisoneo.endreimagined.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import kaisoneo.endreimagined.EndReimaginedMod;

public class EndReimaginedModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, EndReimaginedMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> ADVENTURE = REGISTRY.register("adventure", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("end_reimagined", "adventure")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CRYSTAL = REGISTRY.register("crystal", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("end_reimagined", "crystal")));
	public static final DeferredHolder<SoundEvent, SoundEvent> WANDERER = REGISTRY.register("wanderer", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("end_reimagined", "wanderer")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SPIELCHIP = REGISTRY.register("spielchip", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("end_reimagined", "spielchip")));
	public static final DeferredHolder<SoundEvent, SoundEvent> JEAN = REGISTRY.register("jean", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("end_reimagined", "jean")));
	public static final DeferredHolder<SoundEvent, SoundEvent> UMBRELLA_GRASSLAND = REGISTRY.register("umbrella_grassland", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("end_reimagined", "umbrella_grassland")));
}
