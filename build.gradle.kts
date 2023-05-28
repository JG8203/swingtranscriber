plugins {
    id("java")
}

group = "com.joshua"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.github.neuml:txtai.java:v5.5.0")
}

tasks.test {
    useJUnitPlatform()
}