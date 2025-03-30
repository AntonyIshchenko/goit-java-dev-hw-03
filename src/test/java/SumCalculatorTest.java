import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator calc;

    @BeforeEach
    void beforeEach() {
        calc = new SumCalculator();
    }

    @Test
    void testSumCalc1() {
        //When
        int actual = calc.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSumCalc3() {
        //When
        int actual = calc.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSumThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.sum(0);
        });
    }
}
