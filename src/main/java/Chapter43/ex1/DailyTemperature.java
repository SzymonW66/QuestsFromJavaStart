package Chapter43.ex1;

import java.time.LocalDate;

public record DailyTemperature(LocalDate date, double minTemp, double maxTemp, Unit unit) {

    double minTempCelsius() {
        if(unit == Unit.CELSIUS) {
            return minTemp;
        }
        else {
            return minTemp * 1.8 + 32;
        }
    }

    double maxTempCelsius() {
        if(unit == Unit.CELSIUS)
            return maxTemp;
        else {
            return maxTemp * 1.8 + 32;
        }
    }

    double minTempFahrenheit() {
        if(unit == Unit.FAHRENHEIT)
            return minTemp;
        else {
            return (minTemp - 32) / 1.8;
        }
    }

    double maxTempFahrenheit() {
        if(unit == Unit.FAHRENHEIT)
            return maxTemp;
        else {
            return (maxTemp - 32) / 1.8;
        }
    }

    enum Unit {CELSIUS, FAHRENHEIT}
}
