plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")

}

android {
    namespace = "com.enkod.enkodpushlibrary"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

}

dependencies {

    implementation ("com.google.firebase:firebase-messaging-directboot:20.2.0")
    implementation ("androidx.work:work-runtime-ktx:2.9.0")
    implementation("io.coil-kt:coil:2.5.0")
    implementation("com.google.android.material:material:1.9.0")
    implementation ("com.google.firebase:firebase-messaging:23.3.0")
    testImplementation("junit:junit:4.13.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.0")
    implementation("com.google.android.material:material:1.5.0-alpha02")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation("com.squareup.picasso:picasso:2.71828")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.8.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")
    implementation("com.google.code.gson:gson:2.8.9")
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("com.google.android.material:material:1.9.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    implementation ("com.github.bumptech.glide:annotations:4.16.0")
    implementation ("com.github.bumptech.glide:okhttp3-integration:4.11.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.11.0")
    api ("io.reactivex:rxandroid:1.2.1")
    api ("io.reactivex:rxjava:1.1.6")

}

publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "com.github.AndreyWeather"
            artifactId = "enkodpushlibrary"
            version = "0.0.1"

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}