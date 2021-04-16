package reviewClass12;

public class OverloadingDemo {
    //overloading constructor
    String firstName;
    String lastName;
    int age;
    double salary;
    OverloadingDemo (){
        this.firstName="";
        this.lastName="";
        this.age=20;
        this.salary=1000000;
        System.out.println("Default constructor with no parameters called");

    }
    OverloadingDemo(String firstName){
        this();
        this.firstName=firstName;
        System.out.println("Constructor with first name called ");

    }
    OverloadingDemo(String firstName, String lastName){
       this(firstName);
        this.lastName=lastName;
        System.out.println("Constructor with first name  and last name called ");
            }
    OverloadingDemo(String firstName, String LastName, int age)  {
        this(firstName,LastName);
        this.age=age;
        System.out.println("Constructor with first name, last name and age  called ");

    }
}
