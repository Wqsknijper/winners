package nl.knijper.wineffect;

import nl.knijper.wineffect.commands.starteffect;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("win").setExecutor(new starteffect());
    }

    @Override
    public void onDisable() {

    }
}
