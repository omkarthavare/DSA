package vectorClass;

import java.util.ArrayList;
import java.util.Vector;

public class insertion {
    public static void main(String[] args) {
        Vector v = new Vector();
        
        v.addElement(1);
        v.insertElementAt(2,1);
         v.insertElementAt(3,2);

         System.out.println(v);
//Adding the elements in the vector by using the append mode
         ArrayList arr = new ArrayList();

         arr.add(12);
         arr.add(15);
         arr.add(13);

         v.addAll(arr);
         System.out.println(v);
    }
    
}
