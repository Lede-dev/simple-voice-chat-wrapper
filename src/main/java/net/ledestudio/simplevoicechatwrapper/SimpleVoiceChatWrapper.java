package net.ledestudio.simplevoicechatwrapper;

import de.maxhenkel.voicechat.api.BukkitVoicechatService;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.Nullable;

public final class SimpleVoiceChatWrapper extends JavaPlugin {

    public static final String PLUGIN_ID = "simple_voice_chat_wrapper";

    private SimpleVoiceChatWrapperPlugin voicePlugin;

    @Override
    public void onEnable() {
        BukkitVoicechatService service = getServer().getServicesManager().load(BukkitVoicechatService.class);
        if (service != null) {
            voicePlugin = new SimpleVoiceChatWrapperPlugin();
            service.registerPlugin(voicePlugin);
            Bukkit.getLogger().warning("Successfully registered voice chat broadcast plugin");
        }
        else {
            Bukkit.getLogger().warning("Failed to register voice chat broadcast plugin");
        }
    }

    @Override
    public void onDisable() {
        if (voicePlugin != null) {
            getServer().getServicesManager().unregister(voicePlugin);
            Bukkit.getLogger().info("Successfully unregistered voice chat broadcast plugin");
        }
    }
}
