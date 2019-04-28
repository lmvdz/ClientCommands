package io.github.cottonmc.clientcommands;

import net.fabricmc.loader.api.FabricLoader;

import java.util.List;

public final class ClientCommands {
    public static final String ENTRYPOINT_TYPE = "cotton-client-commands";

    public static List<CommandProvider> getCommandProviders() {
        return FabricLoader.getInstance().getEntrypoints(ENTRYPOINT_TYPE, CommandProvider.class);
    }
}
