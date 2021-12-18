package BasicOfProgramming.String_And_Arraylist;

// 1. You are given a string.
// 2. You have to compress the given string in the following two ways -
// First compression -> The string should be compressed such that consecutive duplicates of characters
// are replaced with a single character.
// For "aaabbccdee", the compressed string will be "abcde".
// Second compression -> The string should be compressed such that consecutive duplicates of characters
// are replaced with the character and followed by the number of consecutive duplicates.
// For "aaabbccdee", the compressed string will be "a3b2c2de2".

import java.util.Scanner;

public class String_Compression {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        System.out.println(firstCompression(str));
        System.out.println(secondCompression(str));

    }
    public static String firstCompression(String str){

        StringBuilder res = new StringBuilder("");

        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) != str.charAt(i+1)){
                res.append(str.charAt(i));
            }
        }
        res.append(str.charAt(str.length()-1));
        return res.toString();
    }
    public static String secondCompression(String str){

        StringBuilder res = new StringBuilder("");

        int count =1;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) != str.charAt(i+1)){
                res.append(str.charAt(i));
                if(count > 1){
                    res.append(count);
                    count =1;
                }

            }else{
                count++;
            }
        }
        res.append(str.charAt(str.length()-1));
        if(count > 1) res.append(count);

        return res.toString();
    }
}
