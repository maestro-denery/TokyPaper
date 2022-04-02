pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "TablightPaper"

include("tablight-api", "tablight-server", "tablight-mojang-api")
