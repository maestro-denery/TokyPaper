package net.drf.drfpaper.testplugin.core;

import net.drf.drfpaper.loader.CorePlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestCorePlugin extends CorePlugin {
	private static final Logger logger = LoggerFactory.getLogger("DRFTestCorePlugin");

	@Override
	public void onLoad() {
		logger.info("Successfully loaded core plugin.");
	}
}
