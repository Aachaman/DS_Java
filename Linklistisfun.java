import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

import javax.print.DocFlavor.STRING;

public class Linklistisfun {
    public static void main(String[] args) {
        LinkedList<Integer>l1=new LinkedList<>();
        l1.add(3);
        l1.add(7);
        l1.add(10);
        l1.add(2, 6);

        // l1.remove(2);
        // l1.removeFirst();
        // l1.removeLast();

        Iterator it = l1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()+" ");
        }
        System.out.println();
        System.out.println(l1.size());
        boolean b1 = l1.contains(7);
        System.out.println(b1);

        Stack<String> s1= new Stack<>();
        LinkedList<String> l2= new LinkedList<>();

        s1.push("hello");
        s1.push("Everyone");

        l2.addAll(s1);

        Iterator i2 = l2.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next()+" ");
        }

    }
}
