import java.util.Scanner;

public class ConditionSwithCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a number: 1.sunday,2.monday,3.tuesday,4.wednesday,5.thursday,6.friday,7.Saturday");
        int n = sc.nextInt();
        switch(n){
           case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;



        
    }
    
}
}
