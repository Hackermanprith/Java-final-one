package apnacolleage.java.course;

public class operation {
	public static void main(String[] args) {
        int a = 12, b = 5;

        // addition operator
        System.out.println("a + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modulo operator
        System.out.println("a % b = " + (a % b));
        int var;

        // assign value using =
        var = b;
        System.out.println("var using =: " + var);

        // assign value using =+
        var += b;
        System.out.println("var using +=: " + var);

        // assign value using =*
        var *= b;
        System.out.println("var using *=: " + var);
        int c = 7, d = 11;

        // value of a and b
        System.out.println("c is " + c + " and d is " + d);

        // == operator
        System.out.println(c == d);  // false

        // != operator
        System.out.println(c != d);  // true

        // > operator
        System.out.println(c > d);  // false

        // < operator
        System.out.println(c < d);  // true

        // >= operator
        System.out.println(c >= d);  // false

        // <= operator
        System.out.println(c <= d);  // true

        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false

        // || operator
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false

        // ! operator
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false

        int e = 12, f = 12;
        int result1, result2;

        // original value
        System.out.println("Value of a: " + e);

        // increment operator
        result1 = ++e;
        System.out.println("After increment: " + result1);

        System.out.println("Value of b: " + f);

        // decrement operator
        result2 = --f;
        System.out.println("After decrement: " + result2);

        String str = "Programiz";
        boolean result;

        // checks if Sr is an instance of
        // the String class
        result = str instanceof String;
        System.out.println("Is str an object of String? " + result);


    }
}

