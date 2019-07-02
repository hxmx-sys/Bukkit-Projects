package com.github.hxmx.hxbcommands;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.hxmx.hxbcommands.archives.HXData;

public class HXBlockCommands extends JavaPlugin {

	@Override
	public void onEnable() {
		init();

	}

	@Override
	public void onDisable() {
		log("Plugin desativado com sucesso!");
	}

	private void init() {
		HXData.load(this);
		log("Plugin iniciado com sucesso!");

	}

	public static HXBlockCommands getInstance() {
		return getPlugin(HXBlockCommands.class);
	}

	private void log(String message) {
		Bukkit.getConsoleSender().sendMessage("§c§lHXBLC - §7" + message);

	}

}
