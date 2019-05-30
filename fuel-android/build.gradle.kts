
dependencies {
    api(project(Fuel.name))

    testImplementation(project(Fuel.Test.name))
    testImplementation(RoboElectric.dependency)
}

plugins {
    id("com.github.dcendents.android-maven")
}


group = "com.github.indo-san"