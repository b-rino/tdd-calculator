package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();



    @DisplayName("Addition")
    @Test
    public void test1(){
        float actual = calc.add(2.2f, 14.9f);
        float expected = 17.1f;
        assertEquals(expected, actual);
    }

    @DisplayName("Subtraction")
    @Test
    public void test2(){
        float actual = calc.subtract(2.2f, 14.9f);
        float expected = -12.7f;
        assertEquals(expected, actual);
    }

    @DisplayName("Multiplication")
    @Test
    public void test3(){
        float actual = calc.mult(2.2f, 14.9f);
        float expected = 32.78f;
        assertEquals(expected, actual);
    }

    @DisplayName("Division")
    @Test
    public void test4(){
        float actual = calc.div(10, 5);
        float expected = 2;
        assertEquals(expected, actual);
    }

}