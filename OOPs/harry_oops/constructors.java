package OOPs.harry_oops;

/**
 * Innerconstructors
 */
class MyMainEmployee {
private int id;
 String name;

public MyMainEmployee(){ //constructor
    id= 65;
    name= "ur_name_here";
}
public MyMainEmployee(String myName, int myId){ //constructor
    id= myId;
    name= myName;
}
public String getName() {return name;}
public void setName(String n){this.name=n;}
public void setId(int i){ this.id=i;}
public int getId(){return id;}    
}


public class constructors {
    public static void main(String[] args) {
        
        String myName;
        int myId;
        // MyMainEmployee adi= new MyMainEmployee(myName= "programmer_adi", myId= 45);
        MyMainEmployee adi= new MyMainEmployee();

        // adi.setName("codewithharry");
        // adi.setId(34);
        System.out.println(adi.getId());
        System.out.println(adi.getName());
    }
    
}
