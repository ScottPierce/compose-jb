// Add compose gradle plugin
// This project is autogenerated from ../web/samples/web-compose-bird
// In case you want modify code, please, modify it there. 
plugins {
    kotlin("multiplatform") version "1.5.21"
    id("org.jetbrains.compose") version "0.5.0-build270"
}
group = "com.theapache64.composebird"
version = "1.0.0-alpha01"

// Add maven repositories
repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

kotlin {
    js(IR) {
        browser()
        binaries.executable()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(compose.web.core)
                implementation(compose.runtime)
            }
        }
    }
}
