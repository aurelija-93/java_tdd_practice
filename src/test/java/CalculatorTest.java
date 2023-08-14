import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    public Calculator calculator;

    @Before
    public void Calculator() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        int result = calculator.add(2, 5);
        assertEquals(7, result);
    }

    @Test
    public void canSubtract() {
        int result = calculator.subtract(5, 2);
        assertEquals(3, result);
    }

    @Test
    public void canMultiply() {
        int result = calculator.multiply(2, 5);
        assertEquals(10, result);
    }

    @Test
    public void canDivide() {
        double result = calculator.divide(5, 2);
        assertEquals(2.5, result, 0.01);
    }
}
