import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.7.18"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("jvm") version "1.8.0"
    kotlin("plugin.spring") version "1.9.22"
    id ("jacoco")
}

group = "visitone"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

}

dependencies {
    implementation("org.mongodb:mongodb-driver-kotlin-sync:4.11.1")
    implementation("org.mongodb:bson:4.11.1")
    implementation("org.mongodb:bson-kotlin:4.11.1")
    implementation ("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.1")
    implementation ("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.13.1")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}