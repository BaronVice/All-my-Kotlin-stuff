plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "me.baronvice"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(9)
}

application {
    mainClass.set("MainKt")
}