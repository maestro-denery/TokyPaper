pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "TokyPaper"

include(
    "toky-paper-api",
    "toky-paper-server",
    "test-plugin"
)
