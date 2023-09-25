public class JavaMethods {
    public int add(int a, int b){
        return a+b;

    }
    public static void main(String[] args) {
        int b;
        JavaMethods java = new JavaMethods();
        b=java.add(10,20);
        System.out.println(b);
    
    }
    
}
class JavaChild extends JavaMethods{
    @Override
    public int add(int a,int b){
        return a * b;

    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        JavaMethods javaMethods = new JavaMethods();
        int c =javaMethods.add(a, b);
        System.out.println(c);
        JavaChild javaChild = new JavaChild();
        int d=javaChild.add(a, b);
        System.out.println(d);

    }
}
