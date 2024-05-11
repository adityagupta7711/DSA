package OOPs.harry_oops;

/**
 * Innerclasses
 */
class Employee {
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}


public class classes {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee hary= new Employee();
        Employee john= new Employee();//instantiating a new employee object
        
        // setting attributes
        hary.id= 12;
        hary.salary=32;
        hary.name="aditya gupta";
        john.id=17;
        john.salary=22;
        john.name="johnny singh";
        hary.printDetails();
        john.printDetails();
        int salary= hary.getSalary();
        System.out.println(salary);
    }
}

