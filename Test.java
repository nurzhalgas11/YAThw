import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        integer1();
        integer2();
        integer3();
        integer4();
        integer5();
        integer6();
        integer7();
        integer8();
        integer9();
        integer10();

    }
   static void integer1(){
       System.out.println("Hello");
       System.out.println("Nurzhalgas");
    }
    static void integer2(){
        System.out.println(74+36);
    }
    static void integer3(){
        System.out.println(50/3);
    }
    static void integer4(){
        int a=-5 + 8 * 6;
        int b=(55+9) % 9;
        int c=20 + -3*5 / 8;
        int d=5 + 15 / 3 * 2 - 8 % 3;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    static void integer5(){
        Scanner scan= new Scanner(System.in);
        int a=scan.nextInt();
        int b= scan.nextInt();
        System.out.println(a+b);
    }
    static void integer6(){
        Scanner scan= new Scanner(System.in);
        int a=scan.nextInt();
        int b= scan.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
    static void integer7(){
        Scanner scan= new Scanner(System.in);
        int a=scan.nextInt();
        for (int i=1;i<11;i++){
            System.out.println(8*i);
        }
    }
    static void integer8(){
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }
    static void integer9(){
        double a=((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(a);

    }
    static void integer10(){
        double a=4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(a);
    }
}
