package pro.sky.calcspringtest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.calcspringtest.service.CalcServiceImpl;

public class CalcServiceImplTest2 {

    private Integer num1;
    private Integer num2;
    private CalcServiceImpl calcService;

    @BeforeEach
    public void setUp() {
        calcService = new CalcServiceImpl();
        num1 = 10;
        num2 = -5;
    }

    @Test
    public void plus(){
        int expected = 5;
        int actual = calcService.plus(num1, num2);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void minus(){
        int expected = 15;
        int actual = calcService.minus(num1, num2);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void multiply(){
        int expected = -50;
        int actual = calcService.multiply(num1, num2);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void divide(){
        int expected = -2;
        int actual = calcService.divide(num1, num2);
        Assertions.assertEquals(expected,actual);
    }




}