plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    arrayOf(
        linuxX64(),
        linuxArm64(),
        macosX64(),
        macosArm64(),
        mingwX64(),
    ).forEach { target ->
        target.binaries.executable()
    }

    sourceSets.commonMain.dependencies {
        implementation(project(":markbook-core"))
    }
}
