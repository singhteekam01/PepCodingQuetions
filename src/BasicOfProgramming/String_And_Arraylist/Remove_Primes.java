package BasicOfProgramming.String_And_Arraylist;

//1. You are given an ArrayList of positive integers.
//2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList.
//
//Note -> The order of elements should remain same.


import java.util.ArrayList;
import java.util.Scanner;

public class Remove_Primes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
    }
    public static void solution(ArrayList<Integer> arrayList){

        for(int i=0; i<arrayList.size(); i++){
            int num = arrayList.get(i);
            if(isPrime(num)){
                arrayList.remove(i);
                i--;
            }
        }

    }
    public static boolean isPrime(int num){

        for(int i=2; i*i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
