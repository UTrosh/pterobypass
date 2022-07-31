package fr.utrosh.pterobypass;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class ExamplePlugin extends JavaPlugin {
    private static final String PLUGIN = "ScriptRunner";
    @Override
    public void onEnable() {
        PluginManager pm = Bukkit.getServer().getPluginManager();
        ScriptPlugin plugin = (ScriptPlugin) pm.getPlugin(PLUGIN);

        if (!pm.isPluginEnabled(plugin))
            pm.enablePlugin(plugin);

    }
}
