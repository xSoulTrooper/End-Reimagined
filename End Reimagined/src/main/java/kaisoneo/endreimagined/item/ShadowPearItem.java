
package kaisoneo.endreimagined.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class ShadowPearItem extends Item {
	public ShadowPearItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationModifier(2.5f).alwaysEdible().build()));
	}
}
