package BasicOfProgramming.TwoD_Arrays;

import java.util.*;

public class Adobe {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while(t>0){

            int n = scn.nextInt();

            int i = n;

            while(true){
                if(i%n ==0){
                    if(isSatisfy(i)) {
                        System.out.println(i);
                        break;
                    }
                }
                i++;
            }
        }
    }
    public static boolean isSatisfy(int i){
        while(i > 0){
            int lastDigit = i%10;
            if(lastDigit != 0 && lastDigit != 3){
                return false;
            }
            i /= 10;
        }
        return true;
    }
}
