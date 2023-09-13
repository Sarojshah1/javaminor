import java.util.Scanner;

public class ConditionalStatement{
    static int add(int a,int b){
        int c=a+b;
        return c;

    }
    static double add(double a,double b){
        return a+b;

    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // System.out.println("enter your age");
        // int age = scr.nextInt();
        // if (age>=80){
        //     System.out.println("tapai hajurbaba hununxa");
        // }
        // System.out.println("tapai manche chai hununxa ");
        System.out.println("enter our age:");
        int number = scr.nextInt();
        if (number<=18){
            System.out.println("you are minor");
        }
        else if (number>=18 && number<=65){
            System.out.println("you are adult");
        }
        else{
            System.out.println("you are suddo");
        }

        scr.close();
        int ad=add(5,10);
        double bd=add(2.2, 4.4);
        System.out.println(ad);
        System.out.println(bd);
    }
}