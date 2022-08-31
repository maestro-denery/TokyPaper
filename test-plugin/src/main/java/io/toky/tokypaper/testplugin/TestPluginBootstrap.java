package io.toky.tokypaper.testplugin;

import io.papermc.paper.plugin.bootstrap.PluginBootstrap;
import io.papermc.paper.plugin.bootstrap.PluginBootstrapContext;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class TestPluginBootstrap implements PluginBootstrap {
	private String test;

	@Override
	public void boostrap(@NotNull PluginBootstrapContext context) {
		test = "Hi!";
	}

	@Override
	public @NotNull JavaPlugin createPlugin(@NotNull PluginBootstrapContext context) {
		return new TestPlugin(this.test);
	}
}
