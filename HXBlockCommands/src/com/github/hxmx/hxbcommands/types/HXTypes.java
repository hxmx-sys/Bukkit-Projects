package com.github.hxmx.hxbcommands.types;

import org.bukkit.configuration.file.FileConfiguration;

import com.github.hxmx.hxbcommands.HXBlockCommands;

public class HXTypes {

	public static String NO_PERMISSION;
	public static String COMMAND_BLOCKED;
	public static String COMMAND_ADDED_SUCCESSFULLY;
	public static String COMMAND_REMOVED_SUCCESSFULLY;
	public static String PLUGIN_RELOAD;

	public static void load() {
		FileConfiguration config = HXBlockCommands.getInstance().getConfig();

		NO_PERMISSION = config.getString("Messages.ERROR_NO_PERMISSION").replace("&", "§");
		COMMAND_BLOCKED = config.getString("Messages.COMMAND_BLOCKED").replace("&", "§");
		COMMAND_ADDED_SUCCESSFULLY = config.getString("Messages.COMMAND_ADDED_SUCCESSFULLY").replace("&", "§");
		COMMAND_REMOVED_SUCCESSFULLY = config.getString("Messages.COMMAND_REMOVED_SUCCESSFULLY").replace("&", "§");
		PLUGIN_RELOAD = config.getString("Messages.COMMAND_RELOAD").replace("&", "§");
	}
}
