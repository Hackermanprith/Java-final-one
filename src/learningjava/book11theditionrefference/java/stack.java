package learningjava.book11theditionrefference.java;

public class stack {
    static class Stack {
        static int[] stack = new int[64];
        static int top;

        Stack() {
            top = -1;
        }

        public static void push(int i) {
            if (top == 64) {
                System.out.println("Sorry but stack is full");
            } else {
                ++top;
                stack[top] = i;
            }

        }
    }
    public static void main(String[] args){
        Stack hi = new Stack();
        Stack.push(8);
    }

}
