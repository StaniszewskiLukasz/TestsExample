package foo.bar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CircleTests {
    @ParameterizedTest(name = "Area of rhombus({0}) should be {2}")
    @CsvSource({
            "0, 0",
            "1, 2",
            "4, 20"
    })
    void areaOfCircle(int a, int b, int expectedArea) {
        Circle circle = new Circle();
        Assertions.assertEquals(expectedArea, circle.area(), "Area of circle is different than expected");
    }
}
