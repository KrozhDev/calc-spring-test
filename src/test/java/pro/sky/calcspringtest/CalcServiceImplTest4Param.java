package pro.sky.calcspringtest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calcspringtest.service.CalcServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcServiceImplTest4Param {

    private CalcServiceImpl calcService;

    public static Stream<Arguments> testParameters() {
        return Stream.of(
                Arguments.of(0,0),
                Arguments.of(1,0),
                Arguments.of(0,1),
                Arguments.of(1,1),
                Arguments.of(3000,3000),
                Arguments.of(-3000,3000),
                Arguments.of(-3000,-3000)

        );
    }

    @BeforeEach
    public void setUp() {
        calcService = new CalcServiceImpl();
    }

    @ParameterizedTest
    @MethodSource("testParameters")
    public void plus(Integer num1, Integer num2){
        int expected = num1 + num2;
        int actual = calcService.plus(num1, num2);
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @MethodSource("testParameters")
    public void minus(Integer num1, Integer num2){
        int expected = num1 - num2;
        int actual = calcService.minus(num1, num2);
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @MethodSource("testParameters")
    public void multiply(Integer num1, Integer num2){
        int expected = num1 * num2;
        int actual = calcService.multiply(num1, num2);
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @MethodSource("testParameters")
    public void divide(Integer num1, Integer num2){
        try {
            int expected = num1 / num2;
            int actual = calcService.divide(num1, num2);
            Assertions.assertEquals(expected,actual);
        } catch (ArithmeticException e) {
            assertThrows(IllegalArgumentException.class, () -> calcService.divide(num1, num2));
        }
    }




}
