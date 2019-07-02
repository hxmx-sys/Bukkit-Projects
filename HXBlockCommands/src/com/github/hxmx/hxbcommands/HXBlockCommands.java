package com.github.hxmx.hxbcommands;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.hxmx.hxbcommands.archives.HXData;
import com.github.hxmx.hxbcommands.types.HXTypes;

public class HXBlockCommands extends JavaPlugin {

	@Override
	public void onEnable() {
		init();

	}

	@Override
	public void onDisable() {
		log("§cPlugin desativado com sucesso!");
	}

	private void init() {
		HXData.load(this);
		HXTypes.load();
		log("§aPlugin iniciado com sucesso!");

	}

	public static HXBlockCommands getInstance() {
		return getPlugin(HXBlockCommands.class);
	}

	private void log(String message) {
		Bukkit.getConsoleSender().sendMessage("§c§lHXBLC - §7" + message);

	}

}
