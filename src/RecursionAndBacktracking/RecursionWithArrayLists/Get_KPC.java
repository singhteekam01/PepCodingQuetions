package RecursionAndBacktracking.RecursionWithArrayLists;

// 0 -> .;
//    1 -> abc
//    2 -> def
//    3 -> ghi
//    4 -> jkl
//    5 -> mno
//    6 -> pqrs
//    7 -> tu
//    8 -> vwx
//    9 -> yz

import java.lang.reflect.Array;
import java.util.*;

public class Get_KPC {
    public static String[] kpc = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String s = scn.next();

        ArrayList<String> ans = getKPC(s,0);
        System.out.println(ans);
    }

    public static ArrayList<String> getKPC(String str, int idx){

        if(idx == str.length()){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> smallCases = getKPC(str,idx+1);

        ArrayList<String> ans = new ArrayList<>();

        String temp  = kpc[str.charAt(idx) - '0'];

        for(int i =0; i<temp.length(); i++){
             for(String s : smallCases){
                 ans.add(temp.charAt(i)+s);
             }
        }

        return ans;
    }
}
