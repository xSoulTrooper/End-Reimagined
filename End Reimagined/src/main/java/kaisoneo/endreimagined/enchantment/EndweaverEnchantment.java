
package kaisoneo.endreimagined.enchantment;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.tags.ItemTags;

public class EndweaverEnchantment extends Enchantment {
	public EndweaverEnchantment(EquipmentSlot... slots) {
		super(Enchantment.definition(ItemTags.FOOT_ARMOR_ENCHANTABLE, 2, 3, Enchantment.dynamicCost(1, 10), Enchantment.dynamicCost(6, 10), 4, EquipmentSlot.FEET));
	}
}
