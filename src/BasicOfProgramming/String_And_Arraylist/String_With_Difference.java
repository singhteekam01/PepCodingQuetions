package BasicOfProgramming.String_And_Arraylist;

//1. You are given a string that contains only lowercase and uppercase alphabets.
//2. You have to form a string that contains the difference of ASCII values of every two
// consecutive characters between those characters.
//   For "abecd", the answer should be "a1b3e-2c1d", as
//   'b'-'a' = 1
//   'e'-'b' = 3
//   'c'-'e' = -2
//   'd'-'c' = 1

import java.util.Scanner;

public class String_With_Difference {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        String ans = difference(str);
        System.out.println(ans);

    }
    public static String difference(String str){

        StringBuilder res = new StringBuilder("");

        for(int i=0; i<str.length()-1; i++){

            int diff = str.charAt(i+1)-str.charAt(i);

            res.append(str.charAt(i));
            res.append(diff);
        }
        res.append(str.charAt(str.length()-1));

        return res.toString();
    }
}
