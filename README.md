# Recipe Category App

This is a simple Android application built using **Kotlin** and **Jetpack Compose**. The app fetches and displays a list of recipe categories from a remote API using **Retrofit** for network requests and **ViewModel** for state management.

## Features
- Fetches recipe categories from an API.
- Displays categories in a grid layout.
- Shows category images and names.
- Handles loading and error states gracefully.

## Tech Stack
- **Kotlin**: Programming language.
- **Jetpack Compose**: Modern UI toolkit for building native Android UIs.
- **Retrofit**: HTTP client for API calls.
- **ViewModel**: Lifecycle-aware state management.
- **Coil**: Image loading library.

## Project Structure
- `Category.kt`: Data models for categories and API response.
- `MainViewModel.kt`: ViewModel for managing app state and fetching data.
- `RecipeScreen.kt`: Composable functions for displaying the UI.

## How to Run
1. Clone the repository.
2. Open the project in Android Studio.
3. Sync Gradle and run the app on an emulator or physical device.

## Requirements
- Android Studio Jellyfish | 2023.3.1 Patch 2 or later.
- Minimum SDK: 21.
- Internet connection for API calls.