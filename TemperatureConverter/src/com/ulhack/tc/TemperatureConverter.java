package com.ulhack.tc;

public class TemperatureConverter {

	public static double fahrenheitToCelsius(double f) {
		return (f-32) * 5/9.0;
	}

	public static double celsiusToFahrenheit(double c) {
		return 9/5.0 * c + 32;
	}

}
