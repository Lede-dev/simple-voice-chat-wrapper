package net.ledestudio.simplevoicechatwrapper.events;

import de.maxhenkel.voicechat.api.events.PlayerDisconnectedEvent;

public class VoiceChatPlayerDisconnectedEvent extends VoiceChatEvent {

    private final PlayerDisconnectedEvent event;

    public VoiceChatPlayerDisconnectedEvent(PlayerDisconnectedEvent event) {
        this.event = event;
    }

    public PlayerDisconnectedEvent getEvent() {
        return event;
    }
}
