import java.util.Scanner;

public class WhileLoop {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int count = 10;
        // while (count <=10) {
        //     System.out.println("2 * " + count + "="+2*count ++ );
        // }
        // Scanner sc=new Scanner(System.in);
        // int val=sc.nextInt();
        // while(val<10||val>100){
        //     System.out.println("the number is invalid");
        //     val=sc.nextInt();
        // }
        // sc.close();

        // break statement part
        for(int i=1; i<count; i++){
            if(i%2!=0){
                continue;
                // System.out.println("exit"); 
                 
            }
            System.out.println(i+" number is even");
        
        } 
        
    }
    
}
