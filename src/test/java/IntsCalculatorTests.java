import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class IntsCalculatorTests {

    IntsCalculator sut = new IntsCalculator();

    @BeforeEach
    public void initEach() {
        System.out.println("Тест для метода класса IntsCalculator запущен");
    }

    @AfterEach
    public void finishEach() {
        System.out.println("Тест для метода класса IntsCalculator завершен");
    }

    @ParameterizedTest
    @MethodSource("sourceCalculate")
    void testSum(int a, int b) {
        int expected = a + b;

        int result = sut.sum(a, b);

        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("sourceCalculate")
    void testMult(int a, int b) {
        int expected = a * b;

        int result = sut.mult(a, b);

        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("sourceCalculate")
    void testPow(int a, int b) {
        int expected = (int) Math.pow(a, b);

        int result = sut.pow(a, b);

        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> sourceCalculate() {
        return Stream.of(Arguments.of(7, 2),
                Arguments.of(15, 2),
                Arguments.of(2, 10));
    }


}
