importjava.util.*;
public class LinkedListDemo 
{
public static void main(String args[])
 {
LinkedListll = new LinkedList();

ll.add("B");

ll.add("D");

ll.add("E");

ll.add("C");

ll.addLast("Z");

ll.addFirst("A"); ll.add(1, "A2");
System.out.println("Original contents of ll: " + ll);



ll.remove(2);

System.out.println("Contents of ll after deletion: " + ll);


System.out.println("ll after deleting first and last: "+ ll);



ll.set(2, (String) val + " Changed"); System.out.println("ll after change: " + ll);
}

}
