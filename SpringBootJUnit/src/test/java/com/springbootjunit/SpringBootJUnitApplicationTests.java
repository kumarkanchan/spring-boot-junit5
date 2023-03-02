package com.springbootjunit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Java6Assertions.assertThat;

@SpringBootTest(classes = Calculator.class)
class SpringBootJUnitApplicationTests {
    private Calculator cal = new Calculator();

    @Test
    void contextLoads() {
        System.out.println("ContextLoads Method");
    }

    @Test
    void doSumTest() {
        //expected 60
        int expectedResult = 60;

        //actual
        int actualResult = cal.doSum(10, 20, 30);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @Disabled //To ignore the testcase - Not going to run - doSumTest2() testcase.
    void doSumTest2() {
        //expected 60
        int expectedResult = 50;

        //actual
        int actualResult = cal.doSum(10, 10, 30);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void doProduct(){
        //expected 100
        int expectedResult = 100;

        //actual
        int actualResult = cal.doProduct(2, 5, 10);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void testTwoNoEquality(){
        //actual
        Boolean actualResult = cal.compareTwoNo(100, 100);
        assertThat(actualResult.equals(true));
    }

}

