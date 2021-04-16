package reviewClass12;

public class Employee {
    String firstName;
    String lasN;
    double bonus;
    Employee() {

    }

    Employee(String firstName, String LasN, double salary) {
        this.firstName = firstName;
        this.lasN = LasN;
        if (salary>150000){
            bonus=.5;
                   } else {
             bonus =0.3;
        }
        System.out.println("Constructor called from the Parent Employee class");
    }



    public void displayInfo() {
        System.out.println(firstName + " " + lasN );
    }
}
class Tester extends Employee{
    String team;
    double salary;
   Tester (String firstName, String LasN, String team, double salary) {
       super(firstName,LasN, salary);
       this.team=team;
       System.out.println("Constructor called from the child tester class");
   }


    public void displayInfo(){
       super.displayInfo();
        System.out.println(" works in "+ team+ " bonus Plus salary "+ (salary*bonus+salary));

    }
}

