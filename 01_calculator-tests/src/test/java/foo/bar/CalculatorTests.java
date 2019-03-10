package foo.bar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTests {


    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2"); //
    }

    @Test
    @DisplayName("-5 + -2 = -7")
    void addsTwoOtherNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-7, calculator.add(-5, -2), "-5 + -2 should equal -7"); //
    }

    @Test
    @DisplayName("-1 + 5 = 4")
    void addsTwoOtherNumbersSecondTest() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(-1, 5), "-1 + 5 should equal 4"); //
    }

    @Test
    @DisplayName("15 - 15 = 0")
    void addsTwoOtherNumbersThirdTest() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.add(15, -15), "15 - 15  should equal 0"); //
    }

    @Test
    @DisplayName("5 * 4 = 20")
    void multiplyTwoNumbersTest(){
        Calculator calculator = new Calculator();
        assertEquals(20, calculator.multiply(5, 4),"5 * 4 should equal 20");
    }

    @Test
    @DisplayName("5 / 5 = 1")
    void divideTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.divide(5, 5),"5 / 5 should equal 1");
    }

    @Test
    @DisplayName("5 / 0 = error")
    void divideTwoNumbersWithZero(){
            Calculator calculator = new Calculator();
            IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, ()-> calculator.divide(5, 0), "5 / 0 should equal error");


    }


}
