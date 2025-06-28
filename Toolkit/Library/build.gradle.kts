import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {

    id("buildsrc.convention.kotlin-jvm")

    java
}

version = "1.0.0"
group = "digital.vasic.jvm"

repositories {

    mavenLocal()

    maven { url = uri("https://repo.huaweicloud.com/repository/maven/") }
    maven { url = uri("https://maven.aliyun.com/repository/central") }
    maven { url = uri("https://maven.aliyun.com/repository/google") }
    maven { url = uri("https://maven.aliyun.com/repository/jetbrains") }
    maven { url = uri("https://mirrors.ustc.edu.cn/jetbrains/") }
    maven { url = uri("https://mirrors.tuna.tsinghua.edu.cn/jetbrains/") }
    maven { url = uri("https://jitpack.io") }

    mavenCentral()
    google()
}

dependencies {

    implementation(kotlin("stdlib"))
}

java {

    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.compileKotlin {

    compilerOptions.jvmTarget.set(JvmTarget.JVM_17)
}

tasks.processResources {

    val versionProvider = providers.gradleProperty("version")

    filesMatching("application.properties") {

        expand("version" to versionProvider.get())
    }
}
