package foo.bar.temperature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureTests {

  /*  @Test
    void shouldConvertFahrenheitToCelsius() {
        Celsius value = new Fahrenheit(BigDecimal.ZERO).toCelsius();
        assertEquals(BigDecimal.ZERO.setScale(4), value.getValue());
    }*/

    @Test
    void convertToFahrenheit(){
        Fahrenheit fahrenheit = new Celsius(BigDecimal.valueOf(1)).toFahrenheit();
        Assertions.assertEquals(new BigDecimal("33.80"), fahrenheit.getValue());
    }

    @Test
    void convertToCelsius(){
        Celsius celsius = new Fahrenheit(BigDecimal.valueOf(1)).toCelsius();
        Assertions.assertEquals(new BigDecimal("-17.22"), celsius.getValue());
    }

  /*  @ParameterizedTest(name = "Convert fahrenheit {0} to Celsius {1}" )
    @CsvSource({
            "10, -12.22"
    })
    void convertToCelsius(BigDecimal fahrenheit, BigDecimal expectedTemperature ) {
        Fahrenheit fahr = new Fahrenheit(fahrenheit);
        Assertions.assertEquals(expectedTemperature, fahr.toCelsius(), "Temperature is different than expected\"");
    }*/

/*
    @Test
    void shouldConvertZeroInchesValue() {
        Inch in = new Centimeter(BigDecimal.ZERO).toInches();
        assertEquals(BigDecimal.ZERO.setScale(4), in.getValue());
    }

    @Test

    }*/
}
