import java.util.Scanner;

public class Day1Conditional {
    public static void main(String[] args) {
        // int a=3;
        // if (a==10){
        //     System.out.println("Statement  1 is true");
        // }
        // else if (a<5){
        //     System.out.println("Statement 2 is false");
        // }else if (a<10){
        //     System.out.println("Statement 3 is false");
        // }
        // else{
        //     System.out.println("statement is not true");    
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks");
        int marks = sc.nextInt();
        if(marks>95){
            System.out.println("Student is brilliant");
        }
        else if(marks<30){
            System.out.println("Student is poor");
        }
        else if (marks>30 && marks<95){
            System.out.println("student is average");
        }
        sc.close();
    }
    
}
