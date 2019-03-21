package foo.bar.meteorology.weather.alarm;

import foo.bar.meteorology.weather.Weather;
import foo.bar.meteorology.weather.WeatherService;
import foo.bar.meteorology.weather.external.RainfallProvider;
import foo.bar.meteorology.weather.external.TemperatureProvider;
import foo.bar.meteorology.weather.external.WindSpeedProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.logging.Logger;

public class WeatherAlarmNotifierTest {

    private WeatherAlarmNotifier alarmNotifier =
            new WeatherAlarmNotifier(
                new WeatherService(
                    new TemperatureProvider(),
                    new RainfallProvider(),
                    new WindSpeedProvider()
                )
            );

    //here comes your tests
//    TemperatureProvider tempMock = Mockito.mock(TemperatureProvider.class);
//    RainfallProvider rainMock = Mockito.mock(RainfallProvider.class);
//    WindSpeedProvider windmock = Mockito.mock(WindSpeedProvider.class);
//    WeatherService weatherMock = new WeatherService(tempMock,rainMock,windmock);
    WeatherService weatherService = Mockito.mock(WeatherService.class);

    @Test
    void weatherAlarmWithMock(){
        Mockito.when(weatherService.getWeather()).thenReturn(new Weather(15,14,14));
        Logger.getLogger("JUnit 5").info("Current Alarm level : " + weatherService.toString());
    }

 /*   @Test
    void alarmLevelWithCelsius(){
        WeatherAlarmNotifier weatherAlarmNotifier = Mockito.mock(WeatherAlarmNotifier.class);
        TemperatureProvider temperatureProvider = new TemperatureProvider();
        if(temperatureProvider.getTemperature()>35){
            WeatherService weatherService = Mockito.mock(WeatherService.class);
            Mockito.when(weatherService.getWeather().getTemprature()>35).thenReturn(weatherAlarmNotifier.raiseLevelIfNeccessary())
        }
        Assertions.assertEquals(WeatherAlarmLevel.ALL_OK, w);


    }*/

    private WeatherAlarmNotifier weatherAlarmNotifier = new WeatherAlarmNotifier(weatherService);

    @Test
    void metodaTrenera(){
        Mockito.when(weatherService.getWeather()).thenReturn(new Weather(15,14,25));

    }

}
