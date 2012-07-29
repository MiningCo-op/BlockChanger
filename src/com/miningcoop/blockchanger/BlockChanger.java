package com.miningcoop.blockchanger;

import java.util.HashSet;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockChanger extends JavaPlugin {
	public void onEnable(){
		getLogger().info("BlockChanger enabled.");
	}
	
	public void onDisable(){
		getLogger().info("BlockChanger disabled.");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("asdf")) {
			Player player = (Player)sender;
			if(player.getGameMode().equals(GameMode.CREATIVE)) {
				ItemStack is = player.getItemInHand();
				Block b = player.getTargetBlock(new HashSet<Byte>(), 100);
				b.setTypeId(is.getTypeId());
				//This spawns a block where the players face is,
				//suffocating the player.
			}
			return true;
		}
		return false;
	}
}
