object AndroidSdk {
    const val min = 23
    const val compile = 31
    const val target = 31
    const val buildToolsVersion = "30.0.3"
}

object AppModules{
    const val main = ":app"
    const val presentation = ":core:presentation"
    const val network = ":core:network"
    const val device = ":core:device"
    const val di = ":core:di"
    const val analytics = ":common:analytics"
    const val navigation = ":common:navigation"
    const val stencil = ":common:stencil"
    const val featureToggle = ":common:feature-toggle"
    const val testutils = ":common:test-utils"
    const val theOldWomanAKAUtils = ":common:the-old-woman"
}

object FeaturesModules{
    const val characters = ":feature:characters"
    const val authentication = ":feature:authentication"
}

object AndroidLibraries {
    object Versions {
        const val appCompat = "1.3.1"
        const val constraintLayout = "2.1.1"
        const val core = "1.7.0"
        const val dynamicAnimation = "1.0.0"
        const val fragmentKtx = "1.3.6"
        const val lifecycleViewModel = "2.3.1"
        const val material = "1.4.0"
        const val navigation = "2.3.5"
        const val room = "2.3.6"
        const val sharedPreferences = "1.1.1"
        const val viewPager2 = "1.0.0"
        const val paging = "3.0.0-alpha11"
        const val datastore = "1.0.0"
        const val protoBuf = "3.11.0"
    }

    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val core = "androidx.core:core-ktx:${Versions.core}"
    const val dynamicAnimation = "androidx.dynamicanimation:dynamicanimation:${Versions.dynamicAnimation}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleViewModel}"
    const val material = "com.google.android.material:material:${Versions.material}"

    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    const val sharedPreferences = "androidx.preference:preference:${Versions.sharedPreferences}"

    const val room = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val paging = "androidx.paging:paging-runtime-ktx:${Versions.paging}"
    const val pagingTest = "androidx.paging:paging-common-ktx:${Versions.paging}"
    const val viewPager2 = "androidx.viewpager2:viewpager2:${Versions.viewPager2}"
    //Considerar exepciones para proguard
    //https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:datastore/datastore-preferences/proguard-rules.pro
    const val datastore = "androidx.datastore:datastore:${Versions.datastore}"
    const val datastoreCore = "androidx.datastore:datastore-core:${Versions.datastore}"
    const val datastorePreferences = "androidx.datastore:datastore-preferences:${Versions.datastore}"
    const val googleProtoBuf = "com.google.protobuf:protobuf-javalite:${Versions.protoBuf}"
}

object FirebaseLibraries {
    object Versions {
        const val firebaseBom = "26.1.0"
        const val config = "21.0.1"
        const val playServices = "19.0.1"

    }
    const val firebaseBom = "com.google.firebase:firebase-bom:${Versions.firebaseBom}"
    const val analytics = "com.google.firebase:firebase-analytics-ktx"
    const val crashlytics = "com.google.firebase:firebase-crashlytics-ktx"
    const val config = "com.google.firebase:firebase-config-ktx:${Versions.config}"
    const val playServices = "com.google.android.gms:play-services-measurement-api:${Versions.playServices}"

}

object ComposeLibraries {
    object Versions {
        const val compose = "1.0.0-alpha05"
    }

    const val ui = "androidx.compose.ui:ui:${Versions.compose}"
    const val material = "androidx.compose.material:material:${Versions.compose}"
    const val liveData = "androidx.compose.runtime:runtime-livedata:${Versions.compose}"
}

object KotlinLibraries {
    object Versions {
        const val kotlin = "1.5.21"
        const val coroutines = "1.4.1"
        const val serializarion = "1.2.1"

    }

    const val kotlinStdLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val kotlinSerializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.serializarion}"

}

object KoinLibraries{
    //Revisar en https://github.com/InsertKoinIO/koin
    object Versions{
        const val koin = "3.1.2"
    }

    const val koinCore = "io.insert-koin:koin-core:${Versions.koin}"
    const val koinAndroid = "io.insert-koin:koin-android:${Versions.koin}"
    const val koinWorkManager = "io.insert-koin:koin-androidx-workmanager:${Versions.koin}"
    const val koinCompose = "io.insert-koin:koin-androidx-compose:${Versions.koin}"
    const val koinTest = "io.insert-koin:koin-test:${Versions.koin}"

}

object ArrowLibraries {
    object Versions {
        const val arrow = "0.10.5"
    }

    const val core = "io.arrow-kt:arrow-core:${Versions.arrow}"
    const val syntax = "io.arrow-kt:arrow-syntax:${Versions.arrow}"
    const val kapt = "io.arrow-kt:arrow-meta:${Versions.arrow}"
}

object LoggerLibraries {
    object Versions {
        const val timber = "4.7.1"
    }

    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
}

object NetworkLibraries {
    object Versions {
        const val ktor = "1.4.1"
        const val retrofit = "2.9.0"
        const val okHttp = "4.9.1"
        const val serializationConverted = "0.8.0"
    }

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    const val serializationConverted = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.serializationConverted}"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.okHttp}"


    const val ktorAndroid = "io.ktor:ktor-client-android:${Versions.ktor}"
    const val ktorCio = "io.ktor:ktor-client-cio:${Versions.ktor}"
    const val ktorGson = "io.ktor:ktor-client-gson:${Versions.ktor}"
    const val ktorLogging = "io.ktor:ktor-client-logging-jvm:${Versions.ktor}"
}

object TestLibraries {
    object Versions {
        const val androidJUnit = "1.1.2"
        const val androidEspresso = "3.3.0"
        const val assertjCore = "3.15.0"
        const val coroutinesTest = "1.4.2"
        const val jUnit = "4.13.2"
        const val kotest = "4.2.6"
        const val mockk = "1.12.0"
        const val mockitoKotlin = "3.2.0"
    }

    const val androidJUnit = "androidx.test.ext:junit:${Versions.androidJUnit}"
    const val assertjCore = "org.assertj:assertj-core:${Versions.assertjCore}"
    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutinesTest}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.androidEspresso}"
    const val kotestArrow = "io.kotest:kotest-assertions-arrow:${Versions.kotest}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    const val mockkAndroid = "io.mockk:mockk-android:${Versions.mockk}"
    const val mockitoKotlin = "org.mockito.kotlin:mockito-kotlin:${Versions.mockitoKotlin}"

}

object TestAndroidLibraries {
    object Versions {
        const val androidJUnit = "1.1.2"
        const val core = "1.3.0"
        const val coroutines = "1.3.9"
        const val espressoCore = "3.3.0"
        const val fragmentTesting = "1.2.5"
        const val googleTruth = "1.0.1"
        const val mockitoKotlinNhaarman = "2.2.0"
        const val runner = "1.3.0"
        const val rules = "1.3.0"
        const val truth = "1.3.0"
    }

    const val androidJUnit = "androidx.test.ext:junit:${Versions.androidJUnit}"
    const val core = "androidx.test:core:${Versions.core}"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    const val espressoAccessibility = "androidx.test.espresso:espresso-accessibility:${Versions.espressoCore}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    const val espressoContrib = "androidx.test.espresso:espresso-contrib:${Versions.espressoCore}"
    const val espressoIntents = "androidx.test.espresso:espresso-intents:${Versions.espressoCore}"
    const val espressoIdlingConcurrent = "androidx.test.espresso.idling:idling-concurrent:${Versions.espressoCore}"
    const val fragmentTesting = "androidx.fragment:fragment-testing:${Versions.fragmentTesting}"
    const val googleTruth = "com.google.truth:truth:${Versions.googleTruth}"
    const val mockitoKotlinNhaarman = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlinNhaarman}"
    const val runner = "androidx.test:runner:${Versions.runner}"
    const val rules = "androidx.test:rules:${Versions.rules}"
    const val truth = "androidx.test.ext:truth:${Versions.truth}"

}

object DILibraries {
    object Versions {
        const val hilt = "2.28-alpha"
        const val lifecycle = "1.0.0-alpha01"
    }

    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val lifecycle = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.lifecycle}"
    const val kaptHilt =  "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val kaptLifecycle =  "androidx.hilt:hilt-compiler:${Versions.lifecycle}"
}

object HuaweiLibrary {
    object Versions {
        const val hsm = "6.2.0.301"
    }
    const val analytics =  "com.huawei.hms:hianalytics:${Versions.hsm}"
}