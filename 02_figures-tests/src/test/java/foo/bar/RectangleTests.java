package foo.bar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTests {

    @ParameterizedTest(name = "Area of square({0}, {1}) should be {2}")
    @CsvSource({
            "0, 0, 0",
            "1, 2, 2",
            "10, 100 , 1000"
    })
    void areaOfRectangle(int a, int b, int expectedArea) {
        Rectangle rectangle = new Rectangle(a,b);
        Assertions.assertEquals(expectedArea, rectangle.area(), "Area of rectangle is different than expected");
    }

    @ParameterizedTest(name = "Perimeter of square({0,0}) should be {2}")
    @CsvSource({
            "0, 0, 0",
            "1, 2, 6",
            "10, 4, 28"
    })
    void perimeterOfRectangle(int a, int b, int expectedPerimeter) {
        Rectangle rectangle = new Rectangle(a,b);
        Assertions.assertEquals(expectedPerimeter, rectangle.circumference(), "Perimeter of rectangle is different than expected");
    }







}
