package net.ledestudio.simplevoicechatwrapper.events;

import de.maxhenkel.voicechat.api.events.VoicechatServerStoppedEvent;

public class VoiceChatVoicechatServerStoppedEvent extends VoiceChatEvent {

    private final VoicechatServerStoppedEvent event;

    public VoiceChatVoicechatServerStoppedEvent(VoicechatServerStoppedEvent event) {
        this.event = event;
    }

    public VoicechatServerStoppedEvent getEvent() {
        return event;
    }
}
