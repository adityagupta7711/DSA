package OOPs.harry_oops;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
}
public class getters_setters {
    public static void main(String[] args) {
        MyEmployee adi= new MyEmployee();
        adi.setName("aditya kumar gupta");
        System.out.println(adi.getName());
        adi.setId(11000);
        System.out.println(adi.getId());
    }
}
