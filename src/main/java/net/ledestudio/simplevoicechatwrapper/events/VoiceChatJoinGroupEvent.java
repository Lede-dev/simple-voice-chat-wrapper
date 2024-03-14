package net.ledestudio.simplevoicechatwrapper.events;

import de.maxhenkel.voicechat.api.events.JoinGroupEvent;

public class VoiceChatJoinGroupEvent extends VoiceChatEvent {

    private final JoinGroupEvent event;

    public VoiceChatJoinGroupEvent(JoinGroupEvent event) {
        this.event = event;
    }

    public JoinGroupEvent getEvent() {
        return event;
    }
}
