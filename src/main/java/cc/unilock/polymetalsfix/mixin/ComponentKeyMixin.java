package cc.unilock.polymetalsfix.mixin;

import net.minecraft.server.network.ServerPlayerEntity;
import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.sync.PlayerSyncPredicate;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ComponentKey.class)
public class ComponentKeyMixin {
	@Redirect(method = "syncWith(Lnet/minecraft/server/network/ServerPlayerEntity;Lorg/ladysnake/cca/api/v3/component/ComponentProvider;Lorg/ladysnake/cca/api/v3/component/sync/ComponentPacketWriter;Lorg/ladysnake/cca/api/v3/component/sync/PlayerSyncPredicate;)V", at = @At(value = "INVOKE", target = "Lorg/ladysnake/cca/api/v3/component/sync/PlayerSyncPredicate;shouldSyncWith(Lnet/minecraft/server/network/ServerPlayerEntity;)Z"))
	private boolean shouldSyncWith(PlayerSyncPredicate instance, ServerPlayerEntity player) {
		return false;
	}
}
