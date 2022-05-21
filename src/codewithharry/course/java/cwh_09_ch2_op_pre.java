package codewithharry.course.java;

public class cwh_09_ch2_op_pre {
    public static void main(String[] args) {
        //Precedence and Associativity
        int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            =30-34/2
            =30-17
            =13
         */
        System.out.println(a);
        int b = 60/5-34*2;
        /*
            = 12-34*2
            =12-68
            =-56
         */
        System.out.println(b);
        //quiz
        int x = 6;
        int y = 2;
        int z = x*y/2;
        System.out.println(z);
        //answer a
        /* x-y
          ----
            2
        */
        int d = 6;
        int e = 4;
        int c = (d-e)/2;
        System.out.println(c);
        //answer b
        /* Question
         b^2-4ac
          ----
            2a
        */
        a = 4;
        b = 6;
        c = 3;
        int f = (b*b-4*a*c) / (2*a);
        System.out.println(f);
        //answer c
        /* Question v^2 -u^2*/
        int v = 3;
        int u = 2;
        int g = v*v - u*u;
        System.out.println(g);
        //answer d
        /* a * b -d */
        a = 4;
        b = 5;
        d = 10;
        int h = a*b - d;
        System.out.println(h);

    }
}
