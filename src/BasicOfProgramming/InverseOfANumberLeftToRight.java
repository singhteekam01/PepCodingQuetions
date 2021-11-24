package BasicOfProgramming;

import java.util.Scanner;

public class InverseOfANumberLeftToRight {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int nod = 0;
        int tempN = n;
        while (tempN > 0) {
            tempN /= 10;
            nod++;
        }

        int res = 0;
        int td =nod;

        while(nod > 0){
            int fd = n%10;

            res += nod*power(10,td-fd);

            n /= 10;

            nod--;

        }
        System.out.println(res);

    }
    public static int power(int base, int pow){
        int ans =1;
        while(pow>0){
            ans *= base;
            pow--;
        }
        return ans;
    }
}
