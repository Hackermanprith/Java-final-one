package learningjava.book11theditionrefference.java;

public class Juststacks {
    static class Stack {
        static int[] stack = new int[10];
        static int top;

        Stack() {
            top = -1;
        }

        public static void push(int i) {
            if (top == 64) {
                System.out.println("Sorry but stack is full");
            } else {
                stack[++top] = i;
            }

        }
        public static int pop(){
            if (top < 0) {
                System.out.println("Sorry but stack is empty");
            } else {

                return stack[top--];


            }
            return stack[top--];
        }
        public static void printstack(){
            for (int i = 0; i < stack.length; i++) {
                System.out.println(stack[i]);
            }
        }
    }
    public static void main(String[] args){
        Stack hi = new Stack();
        hi.push(8);
        hi.printstack();

    }
}
