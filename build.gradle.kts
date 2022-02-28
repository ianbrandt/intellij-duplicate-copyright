import org.gradle.api.tasks.wrapper.Wrapper.DistributionType.ALL

plugins {
    kotlin("jvm") version "1.6.10"
    java
}

group = "com.ianbrandt"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks {
    named<Wrapper>("wrapper") {
        gradleVersion = "7.4"
        distributionType = ALL
    }
}
