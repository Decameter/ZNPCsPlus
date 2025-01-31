package lol.pyr.znpcsplus.commands;

import lol.pyr.director.adventure.command.CommandContext;
import lol.pyr.director.adventure.command.CommandHandler;
import lol.pyr.director.common.command.CommandExecutionException;
import lol.pyr.znpcsplus.npc.NpcRegistryImpl;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

public class ForceUnloadCommand implements CommandHandler {
    private final NpcRegistryImpl registry;

    public ForceUnloadCommand(NpcRegistryImpl registry) {
        this.registry = registry;
    }

    @Override
    public void run(CommandContext context) throws CommandExecutionException {
        registry.npcIdLookupMap.clear();
        registry.npcList.clear();
        registry.npcUuidLookupMap.clear();

        context.send(Component.text("Force unloaded all npcs!", NamedTextColor.GREEN));
    }
}
