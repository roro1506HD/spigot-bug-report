package ovh.roro.bugreport.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.VillagerCareerChangeEvent;
import ovh.roro.bugreport.SpigotBugReport;

public class VillagerListener implements Listener {

    private final SpigotBugReport plugin;

    public VillagerListener(SpigotBugReport plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onVillagerCareerChange(VillagerCareerChangeEvent event) {
        String message = switch (event.getReason()) {
            case EMPLOYED -> "Villager has been employed!";
            case LOSING_JOB -> "Villager has lost their job."; // This message will never show up, as it is not implemented.
        };

        this.plugin.getLogger().info(message);
    }
}
