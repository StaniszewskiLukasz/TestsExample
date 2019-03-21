package foo.bar.temperature;

import foo.bar.length.Centimeter;

import java.math.BigDecimal;

public class Celsius implements TemperatureUnit {

    private BigDecimal value;

    public static final BigDecimal CELSIUS_TO_FAHRENHEIT =
            new BigDecimal("32").setScale(SCALE, ROUNDING_MODE);

    public Celsius(BigDecimal value) {
        if (BigDecimal.ZERO.compareTo(value) > 100 && BigDecimal.ZERO.compareTo(value) < -273.15) {
            throw new IllegalArgumentException("Temperature can't be under 100 or below -273,15!");
        }
        this.value = value.setScale(SCALE, ROUNDING_MODE);
    }

    public BigDecimal getValue() {
        return value;
    }

    public Fahrenheit toFahrenheit() {
        return new Fahrenheit(value.multiply(BigDecimal.valueOf(1.8)).add(CELSIUS_TO_FAHRENHEIT).setScale(SCALE, ROUNDING_MODE));
    }
}
