// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.hilt.android) apply false
    alias(libs.plugins.kotlin.ksp) apply false
    alias(libs.plugins.android.library) apply false
    kotlin("plugin.serialization") version "1.9.0" apply false
    id("io.realm.kotlin") version "2.0.0" apply false
    alias(libs.plugins.compose.compiler) apply false
}