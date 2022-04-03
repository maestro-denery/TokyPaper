pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "TablightPaper"

include(
    "tablight-paper-api",
    "tablight-paper-server",
    "tablight-mojang-api"
    //"tablight-api-base"
)
