version = "1.0.0-SNAPSHOT"

dependencies {
    compileOnly(project(":drf-paper-api"))
    compileOnly(project(":drf-mojang-api"))
}

tasks.processResources {
    val apiVersion = rootProject.providers.gradleProperty("minecraft_version").get()
        .split(".", "-").take(2).joinToString(".")
    val props = mapOf(
        "version" to project.version,
        "apiversion" to apiVersion,
    )
    inputs.properties(props)
    filesMatching("plugin.yml") {
        expand(props)
    }
}
