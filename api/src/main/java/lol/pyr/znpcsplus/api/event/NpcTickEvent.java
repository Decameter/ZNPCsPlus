package lol.pyr.znpcsplus.api.event;

import lol.pyr.znpcsplus.api.npc.Npc;
import lol.pyr.znpcsplus.api.npc.NpcEntry;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class NpcTickEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private final NpcEntry entry;

    public NpcTickEvent(NpcEntry entry) {
        super(true);

        this.entry = entry;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public NpcEntry getEntry() {
        return entry;
    }

    public Npc getNpc() {
        return entry.getNpc();
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
