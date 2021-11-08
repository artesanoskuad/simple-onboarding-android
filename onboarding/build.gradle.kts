plugins {
    id("com.android.library")
    id("kotlin-android")
    id("org.jlleitschuh.gradle.ktlint")
    id("maven-publish")
}

android {
    compileSdk = AndroidSdk.compile
    buildToolsVersion = AndroidSdk.buildToolsVersion

    defaultConfig {
        minSdk = AndroidSdk.min
        targetSdk = AndroidSdk.target

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        getByName("debug") {
            isTestCoverageEnabled = true
        }

        android.libraryVariants.all {
            val libraryVariant = this
            libraryVariant.outputs
                .map { it as com.android.build.gradle.internal.api.BaseVariantOutputImpl }
                .forEach { output ->
                    output.outputFileName = "android-simple-onboarding-$version.aar"
                }
        }
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_11)
        targetCompatibility(JavaVersion.VERSION_11)
    }
    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(KotlinLibraries.kotlinStdLibrary)
    implementation(KotlinLibraries.coroutinesCore)
    implementation(KotlinLibraries.coroutinesAndroid)

    implementation(AndroidLibraries.core)
    implementation(AndroidLibraries.appCompat)
    implementation(AndroidLibraries.constraintLayout)
    implementation(AndroidLibraries.material)
    implementation(AndroidLibraries.fragmentKtx)
    implementation(AndroidLibraries.viewPager2)
    implementation(AndroidLibraries.navigationFragment)
    implementation(AndroidLibraries.navigationUi)
    implementation("com.tbuonomo:dotsindicator:4.2")

    implementation(KoinLibraries.koinCore)
    implementation(KoinLibraries.koinAndroid)
    androidTestImplementation(KoinLibraries.koinTest)

    testImplementation(TestLibraries.jUnit)
    testImplementation(TestLibraries.assertjCore)
    testImplementation(TestLibraries.mockitoKotlin)

    androidTestImplementation(TestAndroidLibraries.fragmentTesting)
    androidTestImplementation(TestAndroidLibraries.core)
    androidTestImplementation(TestAndroidLibraries.runner)
    androidTestImplementation(TestAndroidLibraries.rules)

    // Assertions
    androidTestImplementation(TestAndroidLibraries.androidJUnit)
    androidTestImplementation(TestAndroidLibraries.truth)
    androidTestImplementation(TestAndroidLibraries.googleTruth)

    // Espresso dependencies
    androidTestImplementation(TestAndroidLibraries.espressoCore)
    androidTestImplementation(TestAndroidLibraries.espressoContrib)
    androidTestImplementation(TestAndroidLibraries.espressoIntents)
    androidTestImplementation(TestAndroidLibraries.espressoAccessibility)
    androidTestImplementation(TestAndroidLibraries.espressoIdlingConcurrent)
    androidTestImplementation(TestAndroidLibraries.mockitoKotlinNhaarman)
}

ktlint {
    verbose.set(true)
    outputToConsole.set(true)
}

afterEvaluate {
    publishing {
        publications {
            register("release", MavenPublication::class) {
                from(components.getByName("release"))
                groupId = "com.artesanoskuad.android"
                artifactId = "onboarding"
                version = findProperty("version") as String

                pom {
                    name.set("onboarding")
                    description.set("Biblioteca que permite el uso de un Onboarding de forma Simple")
                }
            }
        }

        repositories {
            maven {
                credentials {
                    username = System.getenv("GITHUB_ACTOR") ?: "${findProperty("githubUser")}"
                    password = System.getenv("ANDROID_KEY") ?: "${findProperty("githubKey")}"
                }
                url = uri("https://maven.pkg.github.com/artesanoskuad/simple-onboarding-android")
            }
        }
    }
}
