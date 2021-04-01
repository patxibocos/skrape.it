plugins {
    jacoco
    kotlin("jvm")
}

dependencies {
    provided(project(":html-parser"))
    provided(Deps.Ktor.serverTestHost)
    provided(Deps.Ktor.serverNetty)
    provided(Deps.Ktor.freemarker)
    provided(Deps.Ktor.locations)
}

// TODO: use https://github.com/nebula-plugins/gradle-extra-configurations-plugin to get provided configuration in gradle
fun DependencyHandlerScope.provided(dependencyNotation: Any) {
    compileOnly(dependencyNotation)
    testCompileOnly(dependencyNotation)
    runtimeOnly(dependencyNotation)
}
