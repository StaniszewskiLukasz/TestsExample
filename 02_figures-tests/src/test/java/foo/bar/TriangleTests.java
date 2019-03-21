package foo.bar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TriangleTests {

    @ParameterizedTest(name = "Area of triangle ({0},{1}) should be {2}")
    @CsvSource({
            "5, 4, 10 ",
            "6, 2, 6",
            "5, 5, 12.5"
    })
    void areaOfTriangle(int a, int b, double expectedArea) {
        Triangle triangle = new Triangle(a, b);
        Assertions.assertEquals(expectedArea, triangle.area(), "Area of triangle is different than expected");
    }

    @ParameterizedTest(name = "Circ. of triangle {0} should be {1}")
    @CsvSource({
            "5, 15",
            "4, 12"
    })
    void circOfTriangle(int a, double expectedCirc) {
        Triangle triangle = new Triangle(a);
        Assertions.assertEquals(expectedCirc, triangle.circumference(), "Circ. of triangle is different than expected");

    }
}
