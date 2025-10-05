package survivalblock.disablekillcommand.mixin;

import net.minecraft.server.command.KillCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(KillCommand.class)
public class KillCommandMixin {

	@Inject(at = @At("HEAD"), method = "execute", cancellable = true)
	private static void noKill(CallbackInfoReturnable<Integer> cir) {
		cir.setReturnValue(0);
	}
}