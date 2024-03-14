package net.ledestudio.simplevoicechatwrapper.events;

import de.maxhenkel.voicechat.api.events.LocationalSoundPacketEvent;

public class VoiceChatLocationalSoundPacketEvent extends VoiceChatEvent {

    private final LocationalSoundPacketEvent event;

    public VoiceChatLocationalSoundPacketEvent(LocationalSoundPacketEvent event) {
        this.event = event;
    }

    public LocationalSoundPacketEvent getEvent() {
        return event;
    }
}
