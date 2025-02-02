package tdd;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int add(String numbers){
        if (numbers == null || numbers.isEmpty()){
            return 0;
        }
        String [] numberArray = numbers.split(",");
        int total = 0;
        for (String str : numberArray){
            total += Integer.parseInt(str.trim());
        }
        return total;
    }

    public int add(int[] numbers){
        int total = 0;
        for(int number : numbers){
            total += number;
        }
        return total;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }
}
