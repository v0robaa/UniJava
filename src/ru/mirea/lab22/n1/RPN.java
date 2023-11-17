package ru.mirea.lab22.n1;
import java.util.Stack;
public class RPN {
    public static double calculateRPN(String expression) {
        Stack<Double> stack = new Stack<>();

        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                    default:
                        System.out.println("Недопустимый оператор: " + token);
                        break;
                }
            }
        }

        return stack.pop();
    }

    private static boolean isNumeric(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String expression = "3 4 + 2 *";
        double result = calculateRPN(expression);
        System.out.println("Результат: " + result);
    }
}
