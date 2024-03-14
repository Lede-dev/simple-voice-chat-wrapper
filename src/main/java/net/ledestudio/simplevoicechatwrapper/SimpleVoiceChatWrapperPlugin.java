package net.ledestudio.simplevoicechatwrapper;

import de.maxhenkel.voicechat.api.VoicechatApi;
import de.maxhenkel.voicechat.api.VoicechatPlugin;
import de.maxhenkel.voicechat.api.events.*;
import net.ledestudio.simplevoicechatwrapper.events.*;

public class SimpleVoiceChatWrapperPlugin implements VoicechatPlugin {

    @Override
    public String getPluginId() {
        return SimpleVoiceChatWrapper.PLUGIN_ID;
    }

    @Override
    public void initialize(VoicechatApi api) {
        new VoiceChatInitializeEvent(api).callEvent();
    }

    @Override
    public void registerEvents(EventRegistration registration) {
        registration.registerEvent(CreateGroupEvent.class, event ->
                new VoiceChatCreateGroupEvent(event).callEvent(), Integer.MAX_VALUE);

        registration.registerEvent(EntitySoundPacketEvent.class, event ->
                new VoiceChatEntitySoundPacketEvent(event).callEvent(), Integer.MAX_VALUE);

        registration.registerEvent(JoinGroupEvent.class, event ->
                new VoiceChatJoinGroupEvent(event).callEvent(), Integer.MAX_VALUE);

        registration.registerEvent(LeaveGroupEvent.class, event ->
                new VoiceChatLeaveGroupEvent(event).callEvent(), Integer.MAX_VALUE);

        registration.registerEvent(LocationalSoundPacketEvent.class, event ->
                new VoiceChatLocationalSoundPacketEvent(event).callEvent(), Integer.MAX_VALUE);

        registration.registerEvent(MicrophonePacketEvent.class, event ->
                new VoiceChatMicrophonePacketEvent(event).callEvent(), Integer.MAX_VALUE);

        registration.registerEvent(PlayerConnectedEvent.class, event ->
                new VoiceChatPlayerConnectedEvent(event).callEvent(), Integer.MAX_VALUE);

        registration.registerEvent(PlayerDisconnectedEvent.class, event ->
                new VoiceChatPlayerDisconnectedEvent(event).callEvent(), Integer.MAX_VALUE);

        registration.registerEvent(StaticSoundPacketEvent.class,
                event -> new VoiceChatStaticSoundPacketEvent(event).callEvent(), Integer.MAX_VALUE);

        registration.registerEvent(VoicechatServerStartedEvent.class, event ->
                new VoiceChatVoicechatServerStartedEvent(event).callEvent(), Integer.MAX_VALUE);

        registration.registerEvent(VoicechatServerStartingEvent.class,
                event -> new VoiceChatVoicechatServerStartingEvent(event).callEvent(), Integer.MAX_VALUE);

        registration.registerEvent(VoicechatServerStoppedEvent.class, event ->
                new VoiceChatVoicechatServerStoppedEvent(event).callEvent(), Integer.MAX_VALUE);

        registration.registerEvent(VoiceHostEvent.class, event ->
                new VoiceChatVoiceHostEvent(event).callEvent(), Integer.MAX_VALUE);
    }
}
