package org.example.jdk.homework.three.task2;

public class Program {

    public static void main(String[] args) {
        double resultSum = Calculator.sum(15, 3.2);
        double resultDivide = Calculator.divide(10, 3.1);
        double resultMultiply = Calculator.multiply(2.5, 3.0);
        double resultSubtract = Calculator.subtract(8.2f, 3);

        System.out.print("sum = " + resultSum + "\n");
        System.out.print("Divide = " + resultDivide + "\n" );
        System.out.print("Multiply = " + resultMultiply + "\n");
        System.out.print("Subtract = " + resultSubtract  + "\n");
    }
}
