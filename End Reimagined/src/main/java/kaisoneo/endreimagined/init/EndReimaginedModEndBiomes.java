package kaisoneo.endreimagined.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import kaisoneo.endreimagined.endbiomes.TheEndBiomes;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class EndReimaginedModEndBiomes {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TheEndBiomes.addHighlandsBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("end_reimagined:ash_graden")), 7.2d);
			TheEndBiomes.addMidlandsBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("end_reimagined:ash_graden")), ResourceKey.create(Registries.BIOME, new ResourceLocation("end_reimagined:ash_graden")), 7.2d);
			TheEndBiomes.addBarrensBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("end_reimagined:ash_graden")), ResourceKey.create(Registries.BIOME, new ResourceLocation("end_reimagined:ash_graden")), 7.2d);
			TheEndBiomes.addHighlandsBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("end_reimagined:umbrella_grassland")), 7.2d);
			TheEndBiomes.addMidlandsBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("end_reimagined:umbrella_grassland")), ResourceKey.create(Registries.BIOME, new ResourceLocation("end_reimagined:umbrella_grassland")), 7.2d);
			TheEndBiomes.addBarrensBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("end_reimagined:umbrella_grassland")), ResourceKey.create(Registries.BIOME, new ResourceLocation("end_reimagined:umbrella_grassland")), 7.2d);
		});
	}
}
