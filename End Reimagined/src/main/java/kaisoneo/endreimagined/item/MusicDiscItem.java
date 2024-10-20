
package kaisoneo.endreimagined.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class MusicDiscItem extends RecordItem {
	public MusicDiscItem() {
		super(0, () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("end_reimagined:adventure")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4800);
	}
}
