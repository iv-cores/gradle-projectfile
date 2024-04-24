plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `maven-publish`
}

group = "org.ivcode"
version = "1.0-SNAPSHOT"

gradlePlugin {
    plugins {
        register("ProjectFile") {
            id = "org.ivcode.gradle.projectfile"
            implementationClass = "org.ivcode.gradle.projectfile.ProjectFilePlugin"
        }

        register("ProjectFileSettings") {
            id = "org.ivcode.gradle.projectfile.settings"
            implementationClass = "org.ivcode.gradle.projectfile.ProjectFileSettingsPlugin"
        }
    }
}

java {
    withSourcesJar()
}

repositories {
    mavenCentral()
}

dependencies {
    api("com.google.code.gson:gson:2.10.1")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}