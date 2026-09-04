import java.util.Scanner;

public class calcul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char operator;
        double num1, num2, result;

        System.out.println("Simple Calculator");
        System.out.println("Operations: +, -, *, /");

        while (true) {
            System.out.print("Enter first number: ");
            num1 = input.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            operator = input.next().charAt(0);

            System.out.print("Enter second number: ");
            num2 = input.nextDouble();

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator. Please use +, -, *, or /.");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to calculate again? (y/n): ");
            String again = input.next();
            if (!again.equalsIgnoreCase("y")) {
                System.out.println("Goodbye!");
                break;
            }
        }

        input.close();
    }
}
