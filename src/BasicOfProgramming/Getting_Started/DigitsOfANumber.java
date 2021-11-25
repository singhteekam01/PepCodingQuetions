package BasicOfProgramming.Getting_Started;

import java.util.Scanner;

public class DigitsOfANumber {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int count =0;
        int temp = n;
        while(temp > 0){
            temp /= 10;
            count++;
        }

        int power =1;
        int tempCount = count;
        while(tempCount-1 >0){
            power *= 10;
            tempCount--;
        }

        while(count > 0){

            int firstDigit = n/power;
            n %= power;
            System.out.println(firstDigit);
            power /= 10;
            count--;
        }
    }
}
