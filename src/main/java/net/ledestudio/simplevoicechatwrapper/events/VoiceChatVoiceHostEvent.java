package net.ledestudio.simplevoicechatwrapper.events;

import de.maxhenkel.voicechat.api.events.VoiceHostEvent;

public class VoiceChatVoiceHostEvent extends VoiceChatEvent {

    private final VoiceHostEvent event;

    public VoiceChatVoiceHostEvent(VoiceHostEvent event) {
        this.event = event;
    }

    public VoiceHostEvent getEvent() {
        return event;
    }
}
