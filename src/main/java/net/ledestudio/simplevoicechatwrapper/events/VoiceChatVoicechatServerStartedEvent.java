package net.ledestudio.simplevoicechatwrapper.events;

import de.maxhenkel.voicechat.api.events.VoicechatServerStartedEvent;

public class VoiceChatVoicechatServerStartedEvent extends VoiceChatEvent {

    private final VoicechatServerStartedEvent event;

    public VoiceChatVoicechatServerStartedEvent(VoicechatServerStartedEvent event) {
        this.event = event;
    }

    public VoicechatServerStartedEvent getEvent() {
        return event;
    }
}
