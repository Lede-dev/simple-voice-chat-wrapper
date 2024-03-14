package net.ledestudio.simplevoicechatwrapper.events;

import de.maxhenkel.voicechat.api.events.EntitySoundPacketEvent;

public class VoiceChatEntitySoundPacketEvent extends VoiceChatEvent {

    private final EntitySoundPacketEvent event;

    public VoiceChatEntitySoundPacketEvent(EntitySoundPacketEvent event) {
        this.event = event;
    }

    public EntitySoundPacketEvent getEvent() {
        return event;
    }
}
