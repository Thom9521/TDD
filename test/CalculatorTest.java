import javafx.beans.binding.Bindings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testTwoPlusThreeEqualsFive() {
        // a = 2, b = 3 => result = 5

        //3. Arrange / Set-up
        int a = 2;
        int b = 3;
        Calculator calculator = new Calculator();

        //2. Act / Execution
        int result = calculator.add(a, b);

        //1.Assert / Verification
        assertEquals(5, result);

        //4. Clean-up
    }

    @Test
    void testFourPlusFiveEqualsNine() {
        // a = 2, b = 3 => result = 5

        //3. Arrange /Set-up
        int a = 4;
        int b = 5;
        Calculator calculator = new Calculator();

        //2. Act / Execution
        int result = calculator.add(a, b);

        //1.Assert / Verification
        assertEquals(9, result);

        //4. Clean-up
    }

    @Test
    void testFiveMinusThreeEqualsTwo() {

        //3. Arrange
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;
        //2. Act
        int result = calculator.subtract(a,b);
        //1. Assert
        assertEquals(2, result);
    }

    @Test
    void testThreeMinusTwoEqualsOne() {

        //3. Arrange
        Calculator calculator = new Calculator();
        int a = 3;
        int b = 2;
        //2. Act
        int result = calculator.subtract(a,b);
        //1. Assert
        assertEquals(1, result);
    }
}