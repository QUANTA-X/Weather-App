# WeatherApp

## Overview

**WeatherApp** is a Java Swing application that provides real-time weather information and forecasts based on user-input locations. It uses the OpenWeatherMap API to fetch current weather conditions and a 8-day forecast. Users can input locations, view current weather data, and see their search history for quick access.

## Features

- **Current Weather Display**: Fetches and displays the current weather for any location.
- **8-Day Weather Forecast**: Provides a detailed forecast for the upcoming days.
- **Search History**: Keeps track of user searches for quick access.
- **Unit Conversion**: Allows users to switch between Celsius and Fahrenheit for temperature readings.
- **User-Friendly Interface**: Simple and intuitive design using Java Swing.

## Requirements

- Java Development Kit (JDK 8 or higher)
- JSON library for Java (e.g., `json-20210307.jar`)
- OpenWeatherMap API key (free registration required)

## Getting Started

### Installation

1. **Clone the repository** (or download the source files):
   ```bash
   git clone https://github.com/QUANTA-X/Weather-App/tree/467f5a89d6a8855d9679a2715667716d768ab36c
   cd weatherapp
   ```

2. **Add the necessary libraries**:
   - Place `json-20210307.jar` (or appropriate version) in the project directory.

3. **Get your OpenWeatherMap API key**:
   - Sign up at [OpenWeatherMap](https://openweathermap.org/api) and get your API key.
   - Replace the placeholder in `WeatherAPIService.java` with your actual API key:
     ```java
     private static final String API_KEY = "2930539f7a7d16cdfe0b280b8ddbf1ee";
     ```

### Compiling and Running

1. **Compile the application**:
   Open a command prompt/terminal and navigate to the project directory, then run:
   ```
   javac --module-path "lib\javafx-sdk-23.0.1\lib" --add-modules javafx.controls,javafx.fxml -cp "json-20210307.jar;org.json-1.6-20240205.jar" -d out -Xlint:deprecation src\WeatherApp.java src\WeatherAPIService.java
   ```

2. **Run the application**:
   ```bash
  java --module-path "lib\javafx-sdk-23.0.1\lib" --add-modules javafx.controls,javafx.fxml -cp "out;json-20210307.jar;org.json-1.6-20240205.jar" WeatherApp
   ```

### Usage

1. Enter a location in the text field and click the "Search" button.
2. View the current weather conditions and 8-day forecast.
3. Select a temperature unit (Celsius or Fahrenheit) to view temperature accordingly.
4. Double-click on an item in the search history to quickly retrieve its weather data again.

## Error Handling

The application includes basic error handling for failed API requests. If the application fails to retrieve weather data, a message dialog will inform the user.


## Acknowledgments

- [OpenWeatherMap](https://openweathermap.org/api) for providing the weather data.
- [Java Swing](https://docs.oracle.com/javase/tutorial/swing/) for the graphical user interface components.
- [JSON-java](https://github.com/stleary/JSON-java) library for handling JSON data.
