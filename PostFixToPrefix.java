import java.util.Stack;
public class PostFixToPrefix {
    static String posttoinf(String postfix){
        Stack<String> st = new Stack<>();
        for(char c: postfix.toCharArray()){
            if(Character.isLetterOrDigit(c)){
            st.push(String.valueOf(c));
       } else {
            String op2 = st.pop();
            String op1 = st.pop();
            String newExp = "(" + op1 + c + op2+")";
            st.push(newExp);
        }
    }
    return st.pop();
}
    public static void main(String[] args) {
        String postfix = "ab+c*";
        System.out.println("postfix expression:" + postfix);
        System.out.println("infix expression:" +posttoinf(postfix));
        
    }
    
}
