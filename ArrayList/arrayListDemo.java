package ArrayList;

import java.util.ArrayList;

public class arrayListDemo {
    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList<Integer>();

        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);

        System.out.println(num);

        ArrayList <Integer> numbers = new ArrayList<>(num);

        numbers.add(8);
        numbers.add(0,1);
         numbers.add(9);
          numbers.add(10);

          System.out.println(num);
          System.out.println(numbers);
          

    }
    
}
