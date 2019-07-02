package com.github.hxmx.hxtopclans.citizens;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import net.citizensnpcs.api.npc.NPC;

public class CitizensAPI {

	public static void createNPC(Player p, int posicao) {
		NPC npc = net.citizensnpcs.api.CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER, "§b" + posicao + "° Lugar");
		npc.setProtected(true);

	}

}
