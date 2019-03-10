package foo.bar.smog;

import foo.bar.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PmAlarmServiceTest {

    private PmAlarmService service = new PmAlarmService();



    @BeforeAll
    static void classSetup() {
        LocalTime timeExecutionFirst = LocalTime.now();
    }

    @AfterAll
    static void classTeardown() {
        LocalTime timeExecutionSecond = LocalTime.now();
    }

    @BeforeEach
    public void setup() {
//LocalTime timeExecutionFirst = timeExecutionFirst - timeExecutionSecond;
        Logger.getLogger("JUnit 5").info("Executing test " + LocalTime.now());
    }

    @Test
    void shouldSomethingReturnForMeasurements() {
        assertEquals(AlarmLevel.NONE, service.getAlarmMessage(10, Country.POLAND));
        assertEquals(AlarmLevel.INFO, service.getAlarmMessage(201, Country.POLAND));
        assertEquals(AlarmLevel.WARNING, service.getAlarmMessage(301, Country.POLAND));
    }

    @Test
    void shouldReturnNoneForMeasurement_49() {
        PmAlarmService service = new PmAlarmService();
        assertEquals(AlarmLevel.NONE, service.getAlarmMessage(49, Country.FINLAND));
    }

    @Test
    void shouldReturnInfoForMeasurement_60() {
        PmAlarmService service = new PmAlarmService();
        assertEquals(AlarmLevel.WARNING, service.getAlarmMessage(60, Country.FINLAND));
    }

    @Test
    void shouldReturnInfoForMeasurement_90() {
        PmAlarmService service = new PmAlarmService();
        assertEquals(AlarmLevel.WARNING, service.getAlarmMessage(90, Country.ITALY));
    }
}
