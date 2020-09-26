# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION 3.4.1)

# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.

add_library( # Sets the name of the library.
             game

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
        game.cpp
        app.cpp
        main.cpp
        gfx.cpp
        lighting.cpp
        loader.cpp
        jni.cpp
        audio.cpp
        font.cpp
        sprite.cpp
        entity.cpp
        things.cpp
        str.cpp
        asset_utils/android_fopen.cpp
        AL/Alc.c
        AL/alBuffer.c
        AL/alThunk.c
        AL/helpers.c
        AL/alError.c
        AL/ALu.c
        AL/bs2b.c
        AL/mixer.c
        AL/alSource.c
        Al/alFilter.c
        Al/panning.c
        Al/hrtf.c
        AL/alcConfig.c
        AL/alEffect.c
        Al/alAuxEffectSlot.c
        Al/alcDedicated.c
        Al/alcModulator.c
        Al/alcEcho.c
        Al/alcReverb.c
        Al/alExtension.c
        Al/opensl.c
        Al/null.c
        Al/alcThread.c
        AL/wave.c
        AL/loopback.c
        AL/alState.c
        AL/alListener.c

        )


# Searches for a specified prebuilt library and stores the path as a
# variable. Because CMake includes system libraries in the search path by
# default, you only need to specify the name of the public NDK library
# you want to add. CMake verifies that the library exists before
# completing its build.

find_library( # Sets the name of the path variable.
              log-lib

              # Specifies the name of the NDK library that
              # you want CMake to locate.
              log )

# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

target_link_libraries( # Specifies the target library.
                       game

                       # Links the target library to the log library
                       # included in the NDK.
                    android
                    GLESv2
                    OpenSLES
                    ${log-lib} )