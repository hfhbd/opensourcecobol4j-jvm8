plugins {
    kotlin("jvm") version "1.8.10"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.xerial:sqlite-jdbc:3.36.0.3")
}

kotlin.jvmToolchain(8)

version = "1.0.7"
