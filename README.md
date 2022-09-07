# Sample Bazel, Android & Dynamic Config Repo

- [Description](#description)
- [Running Locally](#running-locally)
- [Additional Resources](#additional-resources)
- [Known Issues](#known-issues)

---

## Description

This sample repository is composed of Zan Markan's Bazel Android project, now utilizing dynamic config.

The sample project is a minimal Android app written in Kotlin with a Bazel build configuration.

## Running locally

- Install Bazel (tested on v3.2.0)
- Android SDK 29 (Robolectric version 4.4 doesn't support Android SDK 30)
- JDK 9 or higher

## Additional Resources

- [Original Bazel Android project](https://circleci.com/blog/bazel-for-android/)
- [Original Bazel Android project github](https://github.com/zmarkan/bazel-android-cicd-example)
- [Clean dynamic config template example](https://github.com/jsjimenez51/dynamic_config_demo)
- [CircleCI Configuration Cookbook](https://circleci.com/docs/2.0/configuration-cookbook/)
- [Path Filtering orb](https://circleci.com/developer/orbs/orb/circleci/path-filtering)
- [Setup Workflow documentation]()

## Known issues

- Android Studio doesn't want to run the Robolectric tests due to Java 8 incopatibility. Tests run when run from the commandline using `bazel test //src/main:unit_test` 
