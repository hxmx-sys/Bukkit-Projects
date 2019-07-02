package com.github.hxmx.hxbcommands.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import com.github.hxmx.hxbcommands.HXBlockCommands;
import com.github.hxmx.hxbcommands.utils.ConfigBuilder;

public class HXBCEvents implements Listener {

	@EventHandler
	public void onCommandExecute(PlayerCommandPreprocessEvent e) {
		ConfigBuilder commands = new ConfigBuilder(HXBlockCommands.getInstance(), "commands.yml");
		Player p = e.getPlayer();
		for (String key : commands.getConfigurationSection("Mundos").getKeys(true)) {
			java.util.List<String> string = commands.getStringList("Mundos." + key);
			if (e.getMessage().startsWith("/" + string) || e.getMessage().contains(string.toString())
					&& p.getLocation().getWorld().getName().equals("Mundos." + key.toString())) {
				p.sendMessage(HXBlockCommands.getInstance().getConfig().getString("Messages.ERROR_COMMAND_BLOCKED")
						.replace("&", "§"));
				e.setCancelled(true);
			}
		}
	}

}
