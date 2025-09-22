package vectorClass;
import java.util.*;

public class vec {
    public static void main(String[] args) {
        Vector v = new Vector(6,2);

        v.addElement(new Integer(1));
         v.addElement(new Integer(2));

          v.addElement(new Integer(3));
 v.addElement(new Integer(4));
 v.addElement(new Integer(5));
 v.addElement(new Integer(6));
 v.addElement(new Integer(7));
System.out.println((Integer)v.firstElement());
System.out.println((Integer)v.lastElement());


//searching the vector Element is present or not

if(v.contains(new Integer(3)))
System.out.println("vector contains three");


//traversing the element in vectotr by enumeration 

Enumeration venume = v.elements();
System.out.println("\n Elements in the vector");
while (venume.hasMoreElements()) {
    System.out.println(venume.nextElement() + " ");
    
}

    }
}
