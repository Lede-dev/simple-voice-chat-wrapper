package net.ledestudio.simplevoicechatwrapper.events;

import de.maxhenkel.voicechat.api.events.StaticSoundPacketEvent;

public class VoiceChatStaticSoundPacketEvent extends VoiceChatEvent {

    private final StaticSoundPacketEvent event;

    public VoiceChatStaticSoundPacketEvent(StaticSoundPacketEvent event) {
        this.event = event;
    }

    public StaticSoundPacketEvent getEvent() {
        return event;
    }
}
