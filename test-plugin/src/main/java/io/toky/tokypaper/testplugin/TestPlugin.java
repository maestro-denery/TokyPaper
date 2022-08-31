package io.toky.tokypaper.testplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestPlugin extends JavaPlugin {
	private static final Logger logger = LoggerFactory.getLogger("TestPlugin");
	private String test;

	public TestPlugin(String test) {
		this.test = test;
	}
	@Override
	public void onEnable() {
		logger.info(this.test);
	}

	@Override
	public void onDisable() {
		logger.info("disabling usual plugin.");
	}
}
