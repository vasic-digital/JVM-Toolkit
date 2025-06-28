dependencyResolutionManagement {

    @Suppress("UnstableApiUsage")
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

    versionCatalogs {

        create("libs") {

            from(files("../gradle/libs.versions.toml"))
        }
    }
}

rootProject.name = "buildSrc"