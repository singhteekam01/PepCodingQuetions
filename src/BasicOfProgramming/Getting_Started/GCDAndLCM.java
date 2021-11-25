package BasicOfProgramming.Getting_Started;

import java.util.Scanner;

public class GCDAndLCM {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        //Gcd of two number
        int gcd =1;
        for(int i=1; i<=num1; i++){
            if(num1%i ==0 && num2%i ==0){
                gcd = i;
            }
        }
        System.out.println(gcd);

        //lcm of two number
        int lcm=1;
        while(true){
            if(lcm%num1 == 0 && lcm%num2==0){
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
    }
}
