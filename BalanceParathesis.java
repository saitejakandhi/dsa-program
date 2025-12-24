import java.util.Stack;
public class BalanceParathesis {
    static boolean balancedParentheses(String exp){
        // exp = {}(
        Stack<Character> stack = new Stack<>();
        for(char c: exp.toCharArray()){
            if(c == '('){
                stack.push(c);
            }
            else if(c == ')'){
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String exp1 = "(a+b)";
        String exp2 = "((a+b))";
        System.out.println(exp1);
        System.out.println(exp2);
        
    }
    
}
