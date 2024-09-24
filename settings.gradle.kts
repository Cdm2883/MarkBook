rootProject.name = "MarkBook"

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        maven("https://mirrors.huaweicloud.com/repository/maven/")
        mavenCentral()
    }
}

include(":markbook-core")
include(":markbook-cli")
include(":markbook-viewer")
