import java.util.Scanner;
import java.util.Stack;
public class BalanceParathesiss {
    public static Boolean isBalanced(String S){
        Stack<Character> stack = new Stack<>();
        for(char ch : S.toCharArray()){
            if(ch ==')' && ch == '}' && ch == ']'){
                stack.push(ch);
            }

            else if(ch == '(' && ch == '{' && ch == '['){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((ch == ')' && top != '(')||
                  (ch == '}' && top != '{')||
                  (ch == ']' && top !='[')){
                    return false;
                }
            }

        }
        return(stack.isEmpty());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(isBalanced(str)){
            System.out.println("balanced.....");
        }
        else{
            System.out.println("is not balanced...");
        }

    }
    
}
