package com.kodilla.spring.library;

import com.kodilla.spring.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultAdd = calculator.add(2.0, 2.0);
        double resultSub = calculator.sub(2.0, 2.0);
        double resultMul = calculator.mul(2.0, 2.0);
        double resultDiv = calculator.div(2.0, 2.0);
        //Then
        Assert.assertEquals(4.0, resultAdd,0.0);
        Assert.assertEquals(0.0, resultSub,0.0);
        Assert.assertEquals(4.0, resultMul,0.0);
        Assert.assertEquals(1.0, resultDiv,0.0);
    }
}
