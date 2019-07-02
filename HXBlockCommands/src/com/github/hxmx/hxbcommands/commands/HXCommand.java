package com.github.hxmx.hxbcommands.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HXCommand implements CommandExecutor {
	
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
		
		if(!(sender instanceof Player)) {
			sender.sendMessage("§c§lERRO! §cEsta versão ainda não suporta comandos enviados pelo CONSOLE.");
			return true;
		}
		Player p = (Player)sender;
		if(cmd.getName().equalsIgnoreCase("hxbc") || cmd.getName().equalsIgnoreCase("hxblockcommands")) {
			
		}
		return false;
	}

}
