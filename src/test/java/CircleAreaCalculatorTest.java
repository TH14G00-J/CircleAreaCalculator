import entities.CircleAreaCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleAreaCalculatorTest {
    @Test
    void mustReturnTheCorrectAreaForTheRadius() {
        CircleAreaCalculator calculator = new CircleAreaCalculator();
        assertEquals(78.5398, calculator.calculateCircleArea(5), 0.0001);
        assertEquals(50.2654, calculator.calculateCircleArea(4), 0.0001);
    }

    @Test
    void shouldValidateAnswerCorrectly() {
        CircleAreaCalculator calculator = new CircleAreaCalculator();
        assertTrue(calculator.isValidAnswer('Y'));
        assertTrue(calculator.isValidAnswer('N'));
        assertFalse(calculator.isValidAnswer(' '));
        assertFalse(calculator.isValidAnswer('0'));
    }
}
