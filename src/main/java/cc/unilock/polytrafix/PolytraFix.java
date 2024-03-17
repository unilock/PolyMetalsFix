package cc.unilock.polytrafix;

import io.github.theepicblock.polymc.api.PolyMcEntrypoint;
import io.github.theepicblock.polymc.api.PolyRegistry;
import io.github.theepicblock.polymc.api.item.CustomModelDataManager;
import io.github.theepicblock.polymc.impl.poly.item.CustomModelDataPoly;
import net.minecraft.item.Items;
import nourl.mythicmetals.armor.MythicArmor;

public class PolytraFix implements PolyMcEntrypoint {
	@Override
	public void registerPolys(PolyRegistry registry) {
        registry.registerItemPoly(MythicArmor.CELESTIUM_ELYTRA, new CustomModelDataPoly(registry.getSharedValues(CustomModelDataManager.KEY), MythicArmor.CELESTIUM_ELYTRA, Items.ELYTRA));
	}
}
