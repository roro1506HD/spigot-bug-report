package ovh.roro.bugreport;

import org.bukkit.plugin.java.JavaPlugin;
import ovh.roro.bugreport.listener.VillagerListener;

public class SpigotBugReport extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new VillagerListener(this), this);
    }
}
