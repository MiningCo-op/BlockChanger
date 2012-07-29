package com.miningcoop.blockchanger;

import java.util.HashSet;
import java.util.List;

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
				if(is.getType().isBlock()) {
					Block b = player.getTargetBlock(null, 100);
					b.setTypeId(is.getTypeId());
					return true;
				}
				else {
					player.sendMessage("Must be holding a block to use /asdf");
					return false;
				}
			}
			else {
				player.sendMessage("Must be in creative to use /asdf");
				return false;
			}
		}
		return false;
	}
}
