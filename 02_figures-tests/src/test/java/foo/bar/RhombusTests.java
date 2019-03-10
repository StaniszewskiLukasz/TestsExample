package foo.bar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RhombusTests {
    @ParameterizedTest(name = "Area of rhombus({0}, {1}) should be {2}")
    @CsvSource({
            "0, 0, 0",
            "1, 2, 2",
            "4, 5 , 20"
    })
    void areaOfRhombus(int a, int b, int expectedArea) {
        Rhombus rhombus = new Rhombus(a,b);
        Assertions.assertEquals(expectedArea, rhombus.area(), "Area of rhombus is different than expected");
    }


    @ParameterizedTest(name = "Perimeter of rhombus({0}) should be {1}")
    @CsvSource({
            "0, 0",
            "1, 4",
            "10, 40"
    })
    void perimeterOfRhombus(int a, int expectedPerimeter) {
        Rhombus rhombus = new Rhombus(a, 4);
        Assertions.assertEquals(expectedPerimeter, rhombus.circumference(), "Perimeter of rhombus is different than expected");
    }
}
