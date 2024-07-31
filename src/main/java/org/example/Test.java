package org.example;

public class Test {
    public static void main(String[] args) {
        // Test Person class with one valid person
        testPerson("John Doe", 25); // Valid

        // Test Calculator class
        Calculator calculator = new Calculator();
        testFactorial(calculator, 5); // Valid
        testFactorial(calculator, -1); // Invalid
        testBinomialCoefficient(calculator, 5, 2); // Valid
        testBinomialCoefficient(calculator, 5, 6); // Invalid
    }

    private static void testPerson(String name, int age) {
        try {
            Person person = new Person(name, age);
            System.out.println("Person created: " + name + ", " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to create Person: " + e.getMessage());
        }
    }

    private static void testFactorial(Calculator calculator, int n) {
        try {
            int result = calculator.factorial(n);
            System.out.println("Factorial of " + n + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to calculate factorial: " + e.getMessage());
        }
    }

    private static void testBinomialCoefficient(Calculator calculator, int n, int k) {
        try {
            int result = calculator.binomialCoefficient(n, k);
            System.out.println("Binomial coefficient of (" + n + ", " + k + ") is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to calculate binomial coefficient: " + e.getMessage());
        }
    }
}
