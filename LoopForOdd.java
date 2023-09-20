import java.util.Scanner;
import java.lang.Math;

public class LoopForOdd {
    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {
        //     if (i % 2 == 0) {
        //         System.out.println(i + " is even");
        //     } else {
        //         System.out.println(i + " is odd");
        //     }
        // }
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for (int i=1; i <= n; i++) {
            System.out.println("Square of "+i+" is "+i*i);

        }
        sc.close();
    }

}
