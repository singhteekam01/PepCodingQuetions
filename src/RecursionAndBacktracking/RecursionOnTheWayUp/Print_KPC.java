package RecursionAndBacktracking.RecursionOnTheWayUp;

import java.io.*;
import java.util.*;

public class Print_KPC {
        static String[] kpc = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

        public static void main(String[] args) throws Exception {

            Scanner scn = new Scanner(System.in);

            String str = scn.next();

            printKPC(str,"");
        }

        public static void printKPC(String str, String asf) {

            if(str.length() == 0){
                System.out.println(asf);
                return;
            }

            String temp = kpc[str.charAt(0)-'0'];

            for(int i=0; i<temp.length(); i++){
                printKPC(str.substring(1),asf+temp.charAt(i));
            }

        }
}
