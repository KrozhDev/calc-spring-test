package pro.sky.calcspringtest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calcspringtest.exceptions.BadParamsException;
import pro.sky.calcspringtest.service.CalcServiceImpl;

@RestController
public class CalcController {

    private final CalcServiceImpl calcService;

    @Autowired
    public CalcController(CalcServiceImpl calcService) {
        this.calcService = calcService;
    }


    @GetMapping("/calculator")
    public String greetings() {
        return calcService.greetings();
    }

//    @RequestMapping("/calculator")
    @GetMapping("/calculator/plus")
    public String plus(@RequestParam("num1") Integer num1,
                       @RequestParam("num2") Integer num2) {
        return num1 + " + " +  num2 + " = " + calcService.plus(num1, num2);
    }

    @GetMapping("/calculator/minus")
    public String minus(@RequestParam("num1") Integer num1,
                       @RequestParam("num2") Integer num2) {
        return num1 + " - " +  num2 + " = " + calcService.minus(num1, num2);
    }

    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam("num1") Integer num1,
                       @RequestParam("num2") Integer num2) {
        return num1 + " * " +  num2 + " = " + calcService.minus(num1, num2);
    }

    @GetMapping("/calculator/divide")
    public String divide(@RequestParam("num1") Integer num1,
                       @RequestParam("num2") Integer num2) {
//        if (num2 == 0) {
//            throw new BadParamsException();
//        }
        return num1 + " / " + num2 + " = " + calcService.divide(num1, num2);
    }
}
