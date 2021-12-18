package BasicOfProgramming.String_And_Arraylist;

//1. You are given a string.
//2. You have to print all palindromic substrings of the given string.


import java.util.Scanner;

public class All_Palindromic_SubString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str  = scn.next();

        for(int i=0; i<str.length(); i++){
            for(int j =i; j<str.length(); j++){
                String subStr = str.substring(i,j+1);
                if(isPalindrome(subStr)){
                    System.out.println(subStr);
                }
            }
        }
    }
    public static boolean isPalindrome(String str){
        int i=0;
        int j = str.length()-1;

        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
