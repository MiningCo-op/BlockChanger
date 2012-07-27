package com.miningcoop.blockchanger;

import org.bukkit.plugin.java.JavaPlugin;

public class BlockChanger extends JavaPlugin{
	public void onEnable(){
		getLogger().info("Plugin enabled, Bland stinks");
	}
	
	public void onDisable(){
		getLogger().info("Plugin disabled");
	}

}
