package net.ledestudio.simplevoicechatwrapper;

import de.maxhenkel.voicechat.api.BukkitVoicechatService;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleVoiceChatWrapper extends JavaPlugin {

    public static final String PLUGIN_ID = "simple_voice_chat_wrapper";

    @Override
    public void onEnable() {
        BukkitVoicechatService service = getServer().getServicesManager().load(BukkitVoicechatService.class);
        if (service != null) {
            SimpleVoiceChatWrapperPlugin voicePlugin = new SimpleVoiceChatWrapperPlugin();
            service.registerPlugin(voicePlugin);
            Bukkit.getLogger().warning("Successfully registered voice chat broadcast plugin");
        }
        else {
            Bukkit.getLogger().warning("Failed to register voice chat broadcast plugin");
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
