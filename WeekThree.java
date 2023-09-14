import java.util.Scanner;
public class WeekThree {
    public static void main(String[] args) {
        // 1. Write a JAVA program to find the maximum between three numbers.
        Scanner number=new Scanner(System.in);
        System.out.println("enter first number");
        int first_number=number.nextInt();
        System.out.println("enter second number");
        int second_number=number.nextInt();
        System.out.println("enter third number");
        int third_number=number.nextInt();
        if(first_number>second_number && first_number>third_number){ d
            System.out.println(first_number+"is maximum between "+second_number+" , "+third_number+"and"+first_number);
        }
        else if(second_number>first_number && second_number>third_number){
            System.out.println(second_number+"is maximum between "+first_number+","+second_number+" and "+third_number);
        }
        else{
            System.out.println(third_number+"is maximum between "+second_number+" and "+first_number);
        }


        // 2. Write a JAVA program to check whether a number is negative, positive, or zero.

        /*if (first_number>0){
        //     System.out.println("it is a positive number");
        // }
        // else if (first_number<0){
        //     System.out.println("it is negative number");
        // }
        // else{
        //     System.out.println("it is zero number");
        // }*/


        // 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.

        // if (first_number%5==0 && first_number%11==0){
        //     System.out.println("number is divided by both numbers");}
        // else if (first_number%5 ==0 && first_number%11!=0){
        //     System.out.println("given number is only divided by 5 ");
        // }
        // else if (first_number%5 !=0 && first_number%11==0){
        //     System.out.println("given number is only divided by 11 ");
        // }
        // else{
        //     System.out.println("number is not divided by 5 and 11");
        // }


        // 4. Write a JAVA program to check whether a number is even or odd.
        // if (first_number%2==0){
        //     System.out.println("given number is even");
        // }
        // else{
        //     System.out.println("it is odd number");
        // }
           



    }

    
}
