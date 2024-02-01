
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.google.gms.google.services) apply false
}
buildscript {
    dependencies {
        classpath(libs.google.services)
        classpath("com.android.tools.build:gradle:8.2.2")
    }
}
//// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins {
//    id("com.android.application") version "8.2.2" apply false
//    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
//    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin") version "2.0.1" apply false
//}
