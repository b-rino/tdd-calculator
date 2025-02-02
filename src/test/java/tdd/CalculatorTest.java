package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();



    @DisplayName("Addition")
    @Test
    public void test1(){
        int actual = calc.add(2, 14);
        int expected = 16;
        assertEquals(expected, actual);
    }

    @DisplayName("Subtraction")
    @Test
    public void test2(){
        int actual = calc.subtract(2, 114);
        int expected = -112;
        assertEquals(expected, actual);
    }

    @DisplayName("Multiplication")
    @Test
    public void test3(){
        int actual = calc.multiply(4, 19);
        int expected = 76;
        assertEquals(expected, actual);
    }

    @DisplayName("Division")
    @Test
    public void test4(){
        int actual = calc.divide(10, 5);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @DisplayName("Addition with String argument")
    @Test
    public void test5(){
        int actual = calc.add("1, 2, 3");
        int expected = 6;
        assertEquals(expected, actual);
    }

    @DisplayName("Addition with String[] argument")
    @Test
    public void test6(){
        int[] numbers = {1, 2, 3};
        int actual = calc.add(numbers);
        int expected = 6;
        assertEquals(expected, actual);
    }

}