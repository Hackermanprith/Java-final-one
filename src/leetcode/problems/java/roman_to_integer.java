package leetcode.problems.java;
import java.util.HashMap;

class roman_to_integer {
    public static int romanToInt(String s) {
        int num = 0;
        HashMap <Character,Integer> Roman = new HashMap<>();
        Roman.put('I',1);
        Roman.put('V',5);
        Roman.put('X',10);
        Roman.put('L',50);
        Roman.put('C',100);
        Roman.put('D',500);
        Roman.put('M',1000);
        num = Roman.get(s.charAt(s.length()-1));
        for(int i = s.length()-2;i>= 0;i--){
            int currentnum = Roman.get(s.charAt(i));
            int nextnum = Roman.get(s.charAt(i+1));

            if(currentnum < nextnum){
                num = num - currentnum;
            }
            else{
                num = num+ currentnum;
            }
        }
        return num;
    }
    public static void main(String []args){
        int l = romanToInt("MCMXCIV");
        System.out.println(l);
    }
}