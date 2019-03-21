package foo.bar.meteorology.weather;

import foo.bar.meteorology.weather.external.RainfallProvider;
import foo.bar.meteorology.weather.external.TemperatureProvider;
import foo.bar.meteorology.weather.external.WindSpeedProvider;
import javafx.beans.binding.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.logging.Logger;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class WeatherServiceTest {

    private WeatherService weatherService =
            new WeatherService(
                    new TemperatureProvider(),
                    new RainfallProvider(),
                    new WindSpeedProvider()
            );

    @Test
    void testWeatherService() {
        Weather weather = weatherService.getWeather();
        Logger.getLogger("JUnit 5").info("Current weather : " + weather.toString());

        Assertions.assertNotNull(weather);
    }

    TemperatureProvider tempMock = Mockito.mock(TemperatureProvider.class);
    RainfallProvider rainMock = Mockito.mock(RainfallProvider.class);
    WindSpeedProvider windmock = Mockito.mock(WindSpeedProvider.class);
    WeatherService weatherMock = new WeatherService(tempMock,rainMock,windmock);


    @Test
    void testWeatherServiceWithMock() {
        Mockito.when(tempMock.getTemperature()).thenReturn(30);
        Mockito.when(rainMock.getRainfallLevel()).thenReturn(10);
        Mockito.when(windmock.getWindSpeed()).thenReturn(15);

        Weather weather = weatherMock.getWeather();
        Logger.getLogger("JUnit 5").info("Current weather : " + weather.toString());

    }
}
