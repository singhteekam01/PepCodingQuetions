package BasicOfProgramming.String_And_Arraylist;

//1. You are given a string that contains only lowercase and uppercase alphabets.
//2. You have to toggle the case of every character of the given string.


import java.util.Scanner;

public class Toggle_Case {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        String res ="";

        for(int i=0; i<str.length(); i++){

            char temp = str.charAt(i);

            if (temp >= 'a' && temp <='z'){
               res += (char)(temp - 32);
            }else{
                res += (char)(temp + 32);
            }
        }
        System.out.println(res);
    }
}
