package ArrayList;

import java.util.ArrayList;

public class personArrayList {
   
    public static void main(String[] args) {
        ArrayList <person> data = new ArrayList<person>();
        data.add(new person("omkar", 20));
         data.add(new person("laxman", 18));
          data.add(new person("sharad", 21));
           data.add(new person("Aditya", 22));
            data.add(new person("rushi", 23));

        data.forEach(person.printData());

    }
    

    
}


