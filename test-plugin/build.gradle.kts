version = "1.0.0-SNAPSHOT"

dependencies {
    compileOnly(project(":toky-paper-api"))
}

tasks.processResources {
    val apiVersion = rootProject.providers.gradleProperty("minecraft_version").get()
        .split(".", "-").take(2).joinToString(".")
    val props = mapOf(
        "version" to project.version,
        "apiversion" to apiVersion,
    )
    inputs.properties(props)
    filesMatching("paper-plugin.yml") {
        expand(props)
    }
}
