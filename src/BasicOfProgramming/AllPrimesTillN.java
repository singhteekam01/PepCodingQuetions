package BasicOfProgramming;

import java.util.Scanner;

public class AllPrimesTillN {
    public static boolean isNumberPrime(int num){

        for(int i=2; i*i<=num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int low = scn.nextInt();
        int high = scn.nextInt();

        for(int i = low; i<=high ; i++){
            if(isNumberPrime(i)){
                System.out.println(i);
            }
        }
    }
}
