import java.util.*;

public class test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter expressions separated by spaces (e.g., '45.0+4.1 3.2*9.1'): ");

        // Read the entire input line
        String inputLine = in.nextLine();

        // Split input by spaces to get individual expressions
        String[] expressions = inputLine.split("\\s+");

        // Process each expression
        for (String expression : expressions) {
            System.out.println("Evaluating expression: " + expression);
            processExpression(expression);
        }

        in.close();
    }

    private static void processExpression(String expression) {
        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/", true);

        try {
            String leftString = tokenizer.nextToken();
            String operator = tokenizer.nextToken();
            String rightString = tokenizer.nextToken();

            double leftOperand = Double.parseDouble(leftString);
            double rightOperand = Double.parseDouble(rightString);

            double result = switch (operator) {
                case "+" -> leftOperand + rightOperand;
                case "-" -> leftOperand - rightOperand;
                case "*" -> leftOperand * rightOperand;
                case "/" -> leftOperand / rightOperand;
                default -> 0.0;
            };

            System.out.println("Result: " + result);
        }
        catch (NoSuchElementException nsee) {
            System.out.println("Invalid syntax in expression: " + expression);
        }
        catch (NumberFormatException nfe) {
            System.out.println("One or more operands is not a number in expression: " + expression);
        }
    }
}
