package foo.bar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CircleTests {
    @ParameterizedTest(name = "Area of circle with radius({0}) should be {1}")
    @CsvSource({
            "5, 78.5",
            "1, 3.14",
            "4, 50.24"
    })
    void areaOfCircle(int a, double expectedArea) {
        Circle circle = new Circle(a);
        Assertions.assertEquals(expectedArea, circle.area(a), "Area of circle is different than expected");
    }

    @ParameterizedTest(name = "Circ of circle with radius{0} should be {1}")
    @CsvSource({
            "5, 31.400000000000002", //Todo
            "18, 113.04",
            "1, 6.28"
    })
    void circOfCircle(int a, double expectedCircumference){
        Circle circle = new Circle(a);
        Assertions.assertEquals(expectedCircumference, circle.circumference(a),
                "Area of circle is different than expected");
    }
}
