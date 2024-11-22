import java.util.*;

public class Example4 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       String inputLine = in.nextLine();

       String[] expressions = inputLine.split("\\s+");

       for (String expression : expressions) {
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

         try {
            leftOperand = Double.parseDouble(leftString);
         }
         catch (NumberFormatException e) {
            System.out.println("Error: Left operand is not a valid number: " + leftString);
            return;
         }

         try {
            rightOperand = Double.parseDouble(rightString);
         }
         catch (NumberFormatException e) {
            System.out.println("Error: Right operand is not a valid number: " + rightString);
            return;
         }

         double result = switch (operator) {
            case "+" -> leftOperand + rightOperand;
            case "-" -> leftOperand - rightOperand;
            case "*" -> leftOperand * rightOperand;
            case "/" -> leftOperand / rightOperand;
            default -> 0.0;
         };

         System.out.println("Result of: " + expression + ": " + result);
      }
      catch (NoSuchElementException nsee) {
         System.out.println("Invalid syntax in expression: " + expression);
      }
      catch (NumberFormatException nfe) {
         System.out.println("One or more operands is not a number in expression: " + expression);
      }
   }
}