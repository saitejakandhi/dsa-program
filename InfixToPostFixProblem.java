import java.util.Stack;
public class InfixToPostFixProblem {
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
   
    static String infixToPostfix(String exp) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(char c: exp.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if(c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
    public static void main(String[] args) {
       String s = "(2+3)*5-8/4";
       System.out.println("Infix Expression: " + s);
       System.out.println("Postfix expression: " + infixToPostfix(s));
    }
}