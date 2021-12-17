plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = Versions.COMPILE_SDK

    defaultConfig {
        applicationId = "com.solarexsoft.practicemakesperfect"
        minSdk = Versions.MIN_SDK
        targetSdk = Versions.TARGET_SDK
        versionCode = Versions.VERSION_CODE
        versionName = Versions.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = Versions.SOURCE_COMPATIBILITY
        targetCompatibility = Versions.TARGET_COMPATIBILITY
    }
    kotlinOptions {
        jvmTarget = Versions.KOTLIN_JVM_TARGET
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("${Libs.KOTLIN_STDLIB}:${Versions.KOTLIN}")
    implementation("${Libs.CORE_KTX}:${Versions.CORE_KTX}")
    implementation("${Libs.APPCOMPAT}:${Versions.APP_COMPAT}")
    implementation("${Libs.MATERIAL}:${Versions.MATERIAL}")
    implementation("${Libs.CONSTRAINT_LAYOUT}:${Versions.CONSTRAINT_LAYOUT}")
    implementation("${Libs.COORDINATOR_LAYOUT}:${Versions.COORDINATOR_LAYOUT}")

    testImplementation("${Libs.JUNIT}:${Versions.JUNIT}")
    androidTestImplementation("${Libs.EXT_JUNIT}:${Versions.EXT_JUNIT}")
    androidTestImplementation("${Libs.ESPRESSO_CORE}:${Versions.ESPRESSO_CORE}")
}