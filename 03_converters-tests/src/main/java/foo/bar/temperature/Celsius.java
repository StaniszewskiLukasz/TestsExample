package foo.bar.temperature;

import foo.bar.length.Centimeter;

import java.math.BigDecimal;

public class Celsius implements TemperatureUnit {

  /*  public static final BigDecimal CELSIUS_TO_FAHRENHEIT =
            new BigDecimal("32").setScale(SCALE, ROUNDING_MODE);

//    public static final BigDecimal CELSIUS_TO_FAHRENHEIT_MULTIPLY =
//            new BigDecimal("1.8").setScale(SCALE, ROUNDING_MODE);

    private final BigDecimal value;

    public Celsius(BigDecimal value) {
        if (BigDecimal.ZERO.compareTo(value) < 100 && BigDecimal.ZERO.compareTo(value) > -273.15) {
            throw new IllegalArgumentException("Length can't be negative!");
        }
        this.value = value.setScale(SCALE, ROUNDING_MODE);
    }


    public Celsius(BigDecimal setScale) {

    }

    public Celsius(BigDecimal setScale) {
    }

    public BigDecimal getValue() {
        return value;
    }

    public Fahrenheit toFahrenheit() {
        return new Centimeter(value.multiply(CELSIUS_TO_FAHRENHEIT_MULTIPLY).add(CELSIUS_TO_FAHRENHEIT).setScale(SCALE, ROUNDING_MODE));
    }*/
}
