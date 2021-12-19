package RecursionAndBacktracking.IntroductionToRecursion;

import java.util.Scanner;

//1. There are 3 towers. Tower 1 has n disks, where n is a positive number. Tower 2 and 3 are empty.
//2. The disks are increasingly placed in terms of size such that the smallest disk is on top and largest disk is at bottom.
//3. You are required to
//    3.1. Print the instructions to move the disks.
//    3.2. from tower 1 to tower 2 using tower 3
//    3.3. following the rules
//        3.3.1 move 1 disk at a time.
//        3.3.2 never place a smaller disk under a larger disk.
//        3.3.3 you can only move a disk at the top.


//input
//A number n, representing number of disks
//A number n1, representing id of tower 1
//A number n2, representing id of tower 2
//A number n3, representing id of tower 3


public class Tower_Of_Hanoi {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        Toh(n,n1,n2,n3);

    }
    public static void Toh(int n,int src,int des,int aux){

        if(n == 0) return;

        Toh(n-1,src,aux,des);
        System.out.println(n+"["+src+" -> "+des+"]");
        Toh(n-1,aux,des,src);

    }
}
