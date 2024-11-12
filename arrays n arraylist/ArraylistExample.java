import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

       list.add(67);
       list.add(234);
       list.add(654);
       list.add(43);
       list.add(10);
       list.add(20);
       list.add(30);

       for (int i = 0; i < list.size(); i++) {
            System.out.println("the element is-- "+ list.get(i)); 
       }
       for (Integer element : list) {
        System.out.println("for each element is "+ element);
       }
       Iterator<Integer> it = list.iterator();
       while (it.hasNext()) {
        System.out.println("iterator "+ it.next());
       }

       System.out.println(list.contains(765432));
       System.out.println(list);
       list.set(0, 99);   // list me zeroth index changed to 99

       list.remove(2);    // index no.2 - 654 removed
       
       System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
//           System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }

        System.out.println(list);

        in.close();


    }
}