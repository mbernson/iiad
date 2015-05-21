package nl.hsleiden.iiad.les2.mblinearlist;

import java.util.Iterator;
import java.util.List;

public class LinkedListMain {
    public static void main(String[] args) {
        MBLinkedList<String> list = new MBLinkedList<>();
        list.add("Bart");
        list.add("Mathijs");
        list.add("Reyer");
        list.add("Lisa");

        System.out.println("Element 2 is:");
        System.out.println(list.get(2));
        Iterator<String> iter = list.iterator();

        System.out.println("Alle elementen:");
        while(iter.hasNext()) {
            String element = iter.next();
            System.out.println(element);
        }
    }
}
