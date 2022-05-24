package net.drf.drfpaper.testplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestPlugin extends JavaPlugin {
	private static final Logger logger = LoggerFactory.getLogger("DRFTestPlugin");
	@Override
	public void onEnable() {
		logger.info("enabling usual plugin.");
	}

	@Override
	public void onDisable() {
		logger.info("disabling usual plugin.");
	}
}
