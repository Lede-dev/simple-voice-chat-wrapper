package net.ledestudio.simplevoicechatwrapper;

import de.maxhenkel.voicechat.api.VoicechatApi;
import de.maxhenkel.voicechat.api.VoicechatPlugin;
import de.maxhenkel.voicechat.api.events.EventRegistration;

public class SimpleVoiceChatWrapperPlugin implements VoicechatPlugin {

    @Override
    public String getPluginId() {
        return SimpleVoiceChatWrapper.PLUGIN_ID;
    }

    @Override
    public void initialize(VoicechatApi api) {

    }

    @Override
    public void registerEvents(EventRegistration registration) {

    }

}
