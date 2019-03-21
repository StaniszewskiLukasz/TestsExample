package foo.bar.temperature;

import java.math.BigDecimal;

public class Fahrenheit implements TemperatureUnit {

    private final BigDecimal value;

    public static final BigDecimal FAHRENHEIT_TO_CELSIUS =
            new BigDecimal("32").setScale(SCALE, ROUNDING_MODE);
    public static final BigDecimal FAHRENHEIT_TO_CELSIUS_DIVIDE =
            new BigDecimal("1.8").setScale(SCALE, ROUNDING_MODE);


    public Fahrenheit(BigDecimal value) {
        if (BigDecimal.ZERO.compareTo(value) > 212 && BigDecimal.ZERO.compareTo(value) < -459.67) {
            throw new IllegalArgumentException("Temperature can't be under 212 or below -459,67!");
        }
        this.value = value.setScale(SCALE, ROUNDING_MODE);
    }

    public BigDecimal getValue() {
        return value;
    }

    public Celsius toCelsius() {
        return new Celsius(value.divide(BigDecimal.valueOf(1.8)).subtract(FAHRENHEIT_TO_CELSIUS).setScale(SCALE,ROUNDING_MODE));
    }
}
