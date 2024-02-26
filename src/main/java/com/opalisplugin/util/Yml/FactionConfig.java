package com.opalisplugin.util.Yml;


import com.opalisplugin.OpalisPlugin;
import com.opalisplugin.util.Grades;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class FactionConfig {

    private static File file;
    private static FileConfiguration config;
    public FactionConfig(String filename) {

        if(!OpalisPlugin.getInstance().getDataFolder().exists()) {
            OpalisPlugin.getInstance().getDataFolder().mkdir();
        }

        file = new File(OpalisPlugin.getInstance().getDataFolder(), filename + ".yml");

        if(!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

        if(!file.exists()) {

            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            config = new YamlConfiguration().loadConfiguration(file);



            config.addDefault("chef", "");
            config.addDefault("bradroits", "");
            config.addDefault("officiers", "");
            config.addDefault("joueur", "");
            config.addDefault("level", 0);
            config.addDefault("xp", 0);
            saveConfig();

        }


    }

    public FileConfiguration getConfig(){
        return config;
    }

    public void saveConfig() {
        try {
            config.save(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
