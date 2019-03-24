plugins {
    java
    application
}

repositories {
    mavenLocal()
    jcenter()
}

dependencies {
    implementation("io.javalin:javalin:2.7.1-SNAPSHOT")
    implementation("org.slf4j:slf4j-simple:1.7.25")
    implementation("io.micrometer:micrometer-core:1.1.3")
    implementation("io.micrometer:micrometer-registry-prometheus:1.1.3")
}

application {
    mainClassName = "javalin.metrics.example.App"
}
