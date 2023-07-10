package pro.sky.calcspringtest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.calcspringtest.service.CalcServiceImpl;

public class CalcServiceImplTest3 {

    private Integer num1;
    private Integer num2;
    private CalcServiceImpl calcService;

    @BeforeEach
    public void setUp() {
        calcService = new CalcServiceImpl();
        num1 = 10;
        num2 = 0;
    }

    @Test
    public void divide(){
        calcService.divide(num1,num2);
        Assertions.fail("Деление на ноль!");
    }




}
