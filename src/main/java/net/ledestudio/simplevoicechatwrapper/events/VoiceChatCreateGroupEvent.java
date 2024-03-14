package net.ledestudio.simplevoicechatwrapper.events;

import de.maxhenkel.voicechat.api.events.CreateGroupEvent;

public class VoiceChatCreateGroupEvent extends VoiceChatEvent {

    private final CreateGroupEvent event;

    public VoiceChatCreateGroupEvent(CreateGroupEvent event) {
        this.event = event;
    }

    public CreateGroupEvent getEvent() {
        return event;
    }

}
