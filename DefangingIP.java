package string;

import java.util.Scanner;

public class DefangingIP {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s= scan.next();
        s.replace(".","[.]");

    }
}
