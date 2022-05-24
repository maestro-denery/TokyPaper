pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "DRFPaper"

include(
    "drf-paper-api",
    "drf-paper-server",
    "drf-mojang-api",
    "test-plugin"
)
