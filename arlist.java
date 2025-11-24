import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class arlist {
    public static void main(String[] args) {
        List<Integer> integerlist= new ArrayList<>();
        integerlist.add(2);
        integerlist.add(7);
        integerlist.add(4);
        integerlist.add(6);
        integerlist.add(6);
        //integerlist.add(3,9);
        System.out.println("get >" + integerlist.get(3));
        integerlist.add(null);
        System.out.println(integerlist);
        integerlist.set(2,4);
        System.out.println(integerlist);
        integerlist.remove(2);
        System.out.println(integerlist);
        int size=integerlist.size();
        System.out.println(size);
        System.out.println(integerlist.contains(5));
        integerlist.clear();
        System.out.println(integerlist);
        System.out.println(integerlist.isEmpty());

        LinkedList<Integer> linkedList1= new LinkedList();
        linkedList1.add(23);
        integerlist.add(56);
        System.out.println(linkedList1);
        System.out.println(linkedList1.peek());
        System.out.println("linkedList"+linkedList1);
        System.out.println("ArrayList" +integerlist);
        System.out.println(linkedList1.poll());        
    }
}
