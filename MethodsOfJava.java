public class MethodsOfJava {
    static String CheckOddOrEven(int value){
        if(value%2==0){
            return "Even";
        }
        else{
            return "odd";
        }
        
    }
    public static void main(String[] args) {
        String v=CheckOddOrEven(10);
        System.out.println(v);
        
    }
    
}
