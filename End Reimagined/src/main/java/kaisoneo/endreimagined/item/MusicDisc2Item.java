
package kaisoneo.endreimagined.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class MusicDisc2Item extends RecordItem {
	public MusicDisc2Item() {
		super(0, () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("end_reimagined:crystal")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2400);
	}
}
