package codewithharry.course.java;

public class cwh_03_ch1_variables {
    public static void main(String[] args) {
        byte b = 63; //stores a value between -128 and 127 cap 8 bits
        short s = 32767; //stores a value between -32768 and 32767 cap 16 bits
        int i = 2147483647; //stores a value between -2147483648 and 2147483647 cap 32 bits
        long l = 9223372036854775807L; //stores a value between -9223372036854775808 and 9223372036854775807 cap 64 bits
        float f = 3.14f; //stores a value between 1.4E-45 and 3.4028235E38 / 3.40282347^1038 to 1.40239846^10-45 cap 32 bits
        double d = 1.7976931348623157E308; //stores a value between 4.9E-324 and 1.7976931348623157E308 cap 64 bits
        char c = 'B'; //stores a single character
        boolean bool = true; //stores a true or false value
    }
}
