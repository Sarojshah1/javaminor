public class LoopPart {
    public static void main(String[] args) {
        // for (int i=1;i<=10;i++ ) {
        //     System.out.println("#######################Multiplication table of"+i+"####################");

        //     for (int j=1;j<=10;j++) {
                
        //     System.out.println(i+ "* "+j+"="+i*j);
        //     }
        // }
        for (int i=1;i<=7;i++) {
            for (int j=7-i;j>=1;j--) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
    
}
