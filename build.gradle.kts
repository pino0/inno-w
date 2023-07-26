plugins {
    kotlin("jvm") version "1.3.61"
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    //implementation(kotlin("stdlib-jdk8"))
    //runtimeOnly("io.insert-koin:koin-core:3.1.2")
    //implementation("org.koin:koin-core-ext:2.2.2")
    implementation("org.koin:koin-core:2.2.2")
    testImplementation("junit:junit:4.13.2")
    testImplementation("io.kotest:kotest-runner-junit4:4.6.1")
}

tasks.withType<Test> {
    useJUnit()
}

tasks.register<JavaExec>("run") {
    group = "application"
    main = "com.inno.MainKt"
    classpath = sourceSets.getByName("main").runtimeClasspath
}
