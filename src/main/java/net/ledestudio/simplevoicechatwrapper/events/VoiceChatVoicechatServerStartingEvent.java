package net.ledestudio.simplevoicechatwrapper.events;

import de.maxhenkel.voicechat.api.events.VoicechatServerStartingEvent;

public class VoiceChatVoicechatServerStartingEvent extends VoiceChatEvent {

    private final VoicechatServerStartingEvent event;

    public VoiceChatVoicechatServerStartingEvent(VoicechatServerStartingEvent event) {
        this.event = event;
    }

    public VoicechatServerStartingEvent getEvent() {
        return event;
    }
}
