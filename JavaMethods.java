public class JavaMethods {
    public int add(int a, int b){
        return a+b;

    }
    @overload
    public double add(double a, double b){
        System.out.println("i am double");
        return a+b;
    }
    public static void main(String[] args) {
        double b;
        int c;
        JavaMethods java = new JavaMethods();
        c=java.add(10,20);
        b=java.add(10.1, 20.2);

        System.out.println(b);
        System.out.println(c);
    
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
