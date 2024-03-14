package net.ledestudio.simplevoicechatwrapper.events;

import de.maxhenkel.voicechat.api.events.PlayerConnectedEvent;

public class VoiceChatPlayerConnectedEvent extends VoiceChatEvent {

    private final PlayerConnectedEvent event;

    public VoiceChatPlayerConnectedEvent(PlayerConnectedEvent event) {
        this.event = event;
    }

    public PlayerConnectedEvent getEvent() {
        return event;
    }
}
