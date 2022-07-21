package HW_1;

import java.util.Scanner;

public class Calculator {
    private String firstNumber = "";
    private String secondNumber = "";

    public Calculator(String firstNumber, String secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    public Calculator() {}

    public double sum() {
        return Double.valueOf(this.firstNumber) + Double.valueOf(this.secondNumber);
    }

    double subtraction() {
        return Double.valueOf(this.firstNumber) - Double.valueOf(this.secondNumber);
    }

    double multiplication() {
        return Double.valueOf(this.firstNumber) * Double.valueOf(this.secondNumber);
    }

    public double division() {
        if (Double.valueOf(this.secondNumber) != 0) {
            return Double.valueOf(this.firstNumber) / Double.valueOf(this.secondNumber);
        }
        else {
            System.out.println("Cant divide by zero");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNumber = "";
        String secondNumber = "";
        String operation = "";
        Calculator calculator;

        while (true) {
            System.out.println("Write 1st number:");
            firstNumber = scanner.next();
            if (firstNumber.equals("stop")) break;
            System.out.println("Write 2nd number:");
            secondNumber = scanner.next();
            if (secondNumber.equals("stop")) break;
            System.out.println("Write operation (*/+-)");
            operation = scanner.next();
            if (operation.equals("stop")) break;
            calculator = new Calculator(firstNumber, secondNumber);

            switch (operation) {
                case "+":
                    System.out.println("Result of sum: " + calculator.sum() + "\n");
                    break;
                case "-":
                    System.out.println("Result of subtraction: " + calculator.subtraction());
                    break;
                case "/":
                    System.out.println("Result of division: " + calculator.division());
                    break;
                case "*":
                    System.out.println("Result of multiplication: " + calculator.multiplication());
                    break;
                case "stop":
                    System.exit(200);
            }
        }
    }

}


