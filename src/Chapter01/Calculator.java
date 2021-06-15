package Chapter01;

public class Calculator {
    public int add(int num1, int num2) {
        int sum;
        sum = num1 + num2;
        return sum;
    }

    public int addAll(int num1, int num2, int num3) {
        int sum = 0;
        sum = num1 + num2 + num3;
        return sum;
    }

    public int subtract(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public int divide(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }

}
