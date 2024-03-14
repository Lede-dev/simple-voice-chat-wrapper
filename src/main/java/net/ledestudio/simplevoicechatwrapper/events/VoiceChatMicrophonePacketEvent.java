package net.ledestudio.simplevoicechatwrapper.events;

import de.maxhenkel.voicechat.api.events.MicrophonePacketEvent;

public class VoiceChatMicrophonePacketEvent extends VoiceChatEvent {

    private final MicrophonePacketEvent event;

    public VoiceChatMicrophonePacketEvent(MicrophonePacketEvent event) {
        this.event = event;
    }

    public MicrophonePacketEvent getEvent() {
        return event;
    }
}
