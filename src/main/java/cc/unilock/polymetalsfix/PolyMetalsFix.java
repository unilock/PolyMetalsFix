package cc.unilock.polymetalsfix;

import io.github.theepicblock.polymc.api.PolyMcEntrypoint;
import io.github.theepicblock.polymc.api.PolyRegistry;
import io.github.theepicblock.polymc.api.item.CustomModelDataManager;
import io.github.theepicblock.polymc.api.resource.ModdedResources;
import io.github.theepicblock.polymc.api.resource.PolyMcResourcePack;
import io.github.theepicblock.polymc.api.resource.SoundAsset;
import io.github.theepicblock.polymc.impl.misc.logging.SimpleLogger;
import io.github.theepicblock.polymc.impl.poly.item.DamageableItemPoly;
import net.minecraft.item.Items;
import nourl.mythicmetals.MythicMetals;
import nourl.mythicmetals.armor.MythicArmor;

public class PolyMetalsFix implements PolyMcEntrypoint {
	@Override
	public void registerModSpecificResources(ModdedResources moddedResources, PolyMcResourcePack pack, SimpleLogger logger) {
		pack.setAsset(MythicMetals.MOD_ID, "music_disc.dog4", new SoundAsset(() -> moddedResources.getInputStream(MythicMetals.MOD_ID, "sounds/dog4.ogg")));
	}

	@Override
	public void registerPolys(PolyRegistry registry) {
        registry.registerItemPoly(MythicArmor.CELESTIUM_ELYTRA, new DamageableItemPoly(registry.getSharedValues(CustomModelDataManager.KEY), MythicArmor.CELESTIUM_ELYTRA, Items.ELYTRA));
	}
}
