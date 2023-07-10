package pro.sky.calcspringtest.service;

public interface CalcService {

    default String greetings() {
        return "Добро пожаловать в калькулятор!";
    }

    Integer plus(Integer num1, Integer num2);

    Integer minus(Integer num1, Integer num2);

    Integer multiply(Integer num1, Integer num2);

    Integer divide(Integer num1, Integer num2);


}
