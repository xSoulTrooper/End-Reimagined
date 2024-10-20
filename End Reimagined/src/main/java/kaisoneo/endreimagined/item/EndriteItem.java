
package kaisoneo.endreimagined.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EndriteItem extends Item {
	public EndriteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
