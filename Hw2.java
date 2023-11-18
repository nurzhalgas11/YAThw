import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        test1();
        smallestOfThree();
        test3();
        test4();
        calculator();



    }
    static void test1(){
        Scanner scan=new Scanner(System.in);
        String string=scan.nextLine();
        System.out.println("Message: "+string);
    }
    static void smallestOfThree(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1 number: ");
        int a=scan.nextInt();
        System.out.println("Enter 2 number: ");
        int b=scan.nextInt();
        System.out.println("Enter 3 number: ");
        int c=scan.nextInt();
        System.out.println(compare(a,b,c));

    }
    static int compare(int a,int b,int c){
        int k=Math.min(a,b);
        return Math.min(k,c);

    }
    static void test3(){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a>0){
            System.out.println("Positive");
        }else if(a==0){
            System.out.println("Zero");
        }else
            System.out.println("Negative");

    }
    static void test4(){
        Scanner scan=new Scanner(System.in);
        double a=scan.nextDouble();
        System.out.println(Math.pow(a,2));
    }
    static void calculator(){
      Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=scanner.nextInt();
        System.out.println("Enter second number: ");
        int b=scanner.nextInt();
        System.out.println("Enter operation: ");
        char c=scanner.next().charAt(0);
        operation(a,b,c);
    }
    static void operation(int a,int b,char c){
        switch (c){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
        }
    }


}

