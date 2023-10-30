package junitAssignment;
//Calculator.test.java
import org.junit.Test;

public class CalculatorTest {
    // ... other test methods ...

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(5.0, 0.0);
    }
}
