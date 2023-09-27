public class MethodsOfJava {
    static String CheckOddOrEven(int value){
        if(value%2==0){
            return "Even";
        }
        else{
            return "odd";
        }
        
    }
    static String fruits(String name,int apple,int orange){
        int sum = apple+orange;
        return "Hello, "+name+" You have "+apple+" apple and "+orange+" orange,with total of "+sum+" fruits";
    }
    static double result(String name,double math,double science,double english){
        double avg=((math+science+english)/3);
        System.out.println(name+" has average of "+avg );
        return avg;
    }
    static double parameter(double length,double width){
        return 2*(length+width);
    }
    static double area(double length,double width){
        return length*width;
    }
    public static void main(String[] args) {
        // String v=CheckOddOrEven(10);
        // System.out.println(v);
        // String x=CheckOddOrEven(11);
        // System.out.println(x);
        // System.out.println(fruits("Saroj", 22, 44));..............
        // result("Saugat", 99, 87.4, 76.2);
        // double p=parameter(22.3, 20.3);
        // double d=area(23.3, 33.3);
        // System.out.println("parameter " + p);
        // System.out.println("area " + d);
        int [][] marray={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{20,21,22,23,24,25},{30,31,32,33,34,35}};
        int [] change={20, 30, 40, 55};
        marray[3]=change;
        marray[3][2]=44;
        System.out.println(marray[3][2]);
        System.out.println(marray[2][4]);
        marray[4][4]=66;
        marray[0][3]=20;
        


        
        
    }
    
}
