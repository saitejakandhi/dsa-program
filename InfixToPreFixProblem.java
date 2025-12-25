import java.util.Stack;

public class InfixToPreFixProblem {

    static int precedence(char ch) {
        switch(ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPrefix(String exp) {
        // Step 1: Reverse the infix expression
        StringBuilder reversed = new StringBuilder(exp).reverse();
        char[] chars = reversed.toString().toCharArray();

        // Step 2: Swap '(' and ')'
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                chars[i] = ')';
            } else if (chars[i] == ')') {
                chars[i] = '(';
            }
        }

        // Step 3: Apply infix-to-postfix logic
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char c : chars) {
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // remove '('
            } else {
                while (!stack.isEmpty() && precedence(c) < precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
            
        }

        // Step 4: Reverse the result to get prefix
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "(2+3)*5-8/4";
        System.out.println("Infix Expression: " + s);
        System.out.println("Prefix Expression: " + infixToPrefix(s));
    }
}
