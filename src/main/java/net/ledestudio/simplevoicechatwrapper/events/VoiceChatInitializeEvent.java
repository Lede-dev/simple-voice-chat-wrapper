package net.ledestudio.simplevoicechatwrapper.events;

import de.maxhenkel.voicechat.api.VoicechatApi;

public class VoiceChatInitializeEvent extends VoiceChatEvent {

    private final VoicechatApi voicechatApi;

    public VoiceChatInitializeEvent(VoicechatApi voicechatApi) {
        this.voicechatApi = voicechatApi;
    }

    public VoicechatApi getVoicechatAPI() {
        return voicechatApi;
    }
}
