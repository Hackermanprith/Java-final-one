package learningjava.book11theditionrefference.java;

public class Juststacks {
    static class Stack {
        int size;
        int arr[];
        int top;

        Stack(int size) {
            this.size = size;
            this.arr = new int[size];
            this.top = -1;
        }

        public void push(int pushedElement) {
            if (top < size - 1) {
                top++;
                arr[top] = pushedElement;
                System.out.println("Pushed element:" + pushedElement);
            } else {
                System.out.println("Stack is full !");
            }
        }

        public int pop() {
            if (top > -1) {
                int returnedTop = top;
                top--;
                System.out.println("Popped element :" + arr[returnedTop]);
                return arr[returnedTop];

            } else {
                System.out.println("Stack is empty !");
                return -1;
            }

        }

        public void display() {
            for (int i = 0; i <= top; i++) {
                System.out.println(arr[i]);
            }

        }

    }
        public static void main(String[] args) {
            Stack mystack = new Stack(5);
            mystack.push(10);
            mystack.push(20);
            mystack.push(30);
            mystack.push(40);
            mystack.display();
            mystack.pop();
            mystack.display();

        }
}
