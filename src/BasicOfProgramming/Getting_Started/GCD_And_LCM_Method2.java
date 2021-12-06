package BasicOfProgramming.Getting_Started;
import java.util.Scanner;

public class GCD_And_LCM_Method2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int n1 = num1;
        int n2 = num2;

        //euclid method
        if(num2 > num1){
            num1 = num1+num2;
            num2 = num1-num2;
            num1 = num1- num2;
        }

        while(num2 >0){
            int temp = num2;
            num2 = num1%num2;
            num1 = temp;
        }
        System.out.println(num1);

        //Lcm of two numbers

        int lcm = n1*n2/num1;
        System.out.println(lcm);

    }
}
