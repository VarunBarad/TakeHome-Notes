# Take Home - Notes

This application is created as part of a take-home assignment for a company. Spec document can be found [here](https://github.com/VarunBarad/TakeHome-Notes/raw/master/Take%20Home%20Exercise%20-%20Note%20taking%20app.pdf)

## Running the application

To build the debug-variant of application, use the below command

```shell
# On Linux/Unix system
./gradlew assembleDebug

# On Windows system
gradlew.bat assembleDebug
```

You can then find the generated apk file at `<project-dir>/app/build/outputs/apk/debug/app-debug.apk`

**Note:** I have already built and put an apk for the same [here](./generate-apk/Take Home - Notes (debug).apk). You can directly install it on your device to test.

## Running the tests

To run the unit-tests, use the below command

```shell
# On Linux/Unix system
./gradlew test

# On Windows system
gradlew.bat test
```

After it finishes, you can find the results of the test in this directory: `<project-dir>/app/build/reports/test/testReleaseUnitTest`

## Screenshots

![Home Screen - No Notes](https://github.com/VarunBarad/TakeHome-Notes/raw/master/screenshots/01%20Home%20Screen%20-%20No%20Notes.png)

![Home Screen - With Notes](https://github.com/VarunBarad/TakeHome-Notes/raw/master/screenshots/02%20Home%20Screen%20-%20With%20Notes.png)

![Create Note Screen - Empty](https://github.com/VarunBarad/TakeHome-Notes/raw/master/screenshots/03%20Create%20Note%20Screen%20-%20Empty.png)

![Create Note Screen - Filled](https://github.com/VarunBarad/TakeHome-Notes/raw/master/screenshots/04%20Create%20Note%20Screen%20-%20Filled.png)

![Note Details Screen](https://github.com/VarunBarad/TakeHome-Notes/raw/master/screenshots/05%20Note%20Details%20Screen.png)
