package com.github.hxmx.hxbcommands.archives;

import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.hxmx.hxbcommands.HXBlockCommands;
import com.github.hxmx.hxbcommands.utils.ConfigBuilder;

public class HXData {

	public static void load(JavaPlugin plugin) {
		ConfigBuilder commands = new ConfigBuilder(plugin, "commands.yml");
		if (commands.existeConfig()) {
			commands.saveConfig();
		} else {
			commands.saveDefaultConfig();
		}
		HXBlockCommands.getInstance().saveDefaultConfig();
	}

}
