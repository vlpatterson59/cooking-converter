# cooking-converter

This is a "Practice On Your Own" assignment from the Create XML layouts for Android codelab in Google's Android Basics in Kotlin training course. The purpose of this lesson is to become familiar with creating layouts in XML instead of in the Designer. 

The app is designed to convert common cooking measurements from one unit type to another unit type, such as milliliters to fluid ounces, grams to cups, and so on. At this point, only the layout needs to be built; there is no logic behind the layout at this point.

## What I Learned

* In order to use Material Design Components (MDC) the MDC library needs to be included as a dependency:
```xml
app/build.gradle

dependencies {
    ...
    implementation 'com.google.android.material:material:<version>'
}
```

* There are two types of text fields in Material Design:
    * Filled text field
    * Outlined text field
  
* To add backward compatibility to an app, add the ```vectorDrawables``` element to the app's ```build.gradle``` file
```xml
android {
    defaultConfig {
        ...
        vectorDrawables.useSupportLibrary = true
    }
}
```

* Styles are collections of view attributes values for a single type of widget. Styles are defined in ```res\values\styles.xml```. Create the new resource file by right-clicking on ```values``` and selecting ```New > Values Resource File```.

* Themes are collections of named resources (called theme attributes) that can be referenced later in styles, layouts, etc. Themes can be specified for an entire app, activity, or view hierarchy.

* To enable scrolling when the screen is rotated, add a ```ScrollView``` around the ```ContraingLayout```.
```xml
  <ScrollView
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_height="match_parent"
    android:layout_width="match_parent">

    ...
  </ScrollView>
```

* Set up a key listener to hide the keyboard when the ```Enter``` key is pressed.

## Modifications and Enhancements


## References and Resources

### Android



### Kotlin



### Material Design

* [Components](https://material.io/components?platform=android)

* [Getting started with Material Components for Android](https://material.io/develop/android/docs/getting-started)

* [Material Design - Android](https://material.io/develop/android)

* [Material Design | Components | Specs](https://material.io/components/lists#specs)

* [Switches](https://material.io/components/switches)

* [Text fields](https://material.io/components/text-fields/android)

### Miscellaneous

#### Articles

* [We recommend Material Design Components: Here's Why](https://medium.com/androiddevelopers/we-recommend-material-design-components-81e6d165c2dd)

* [Android styling: themes vs styles](https://medium.com/androiddevelopers/android-styling-themes-vs-styles-ebe05f917578)