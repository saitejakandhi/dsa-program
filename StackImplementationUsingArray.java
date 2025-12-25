public class StackImplementationUsingArray {
    int top; //to track thr top element
    int size; // to get the size
    int[] stack;
    
    StackImplementationUsingArray( int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    // push operation
    void push(int ele){
        if(top == size-1){
            System.out.println("Stack overflow cannot push" +ele);
        }
        stack[++top] = ele;// increment top and ele
    }
    // pop operation
    int pop(){
        if(top == -1){
            System.out.println("nothing to pop!!!");
            return -1;
        }
        return stack[top--];
    }
    // peek operation
    int peek(){
        if(top == -1){
            System.out.println("stack is empty!!!");
            return -1;
        }
        return stack[top];
    }
        // isempty operation
        boolean isEmpty(){
            return top == -1;
        }
    public static void main(String[] args){
        StackImplementationUsingArray s = new StackImplementationUsingArray(5);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
    }
}
