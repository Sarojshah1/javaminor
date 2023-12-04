public class JavaClassPart1 {
    public static void main(String[] args) {
        Person p = new Person();
    p.firstname = "John";
    p.lastname = "cina";
    p.Age =22;
    p.location = "USA";
p.description();
p.agecla();
    }
    
    
}

class Person{
    String firstname;
    String lastname;
    int Age;
    String location;
    void description(){
        System.out.println(firstname + " " + lastname+ " " + Age+ " " + location);
    }
    /**
     * 
     */
    void agecla(){
        if(Age>18){System.out.println("food");}else{System.out.println("");}
    }


}
