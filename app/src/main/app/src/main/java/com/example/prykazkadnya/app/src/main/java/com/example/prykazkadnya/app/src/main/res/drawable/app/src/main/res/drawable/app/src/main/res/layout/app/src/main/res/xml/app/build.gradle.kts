plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    namespace = "com.example.prykazkadnya"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.prykazkadnya"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}
