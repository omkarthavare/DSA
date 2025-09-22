package GenericProgramming.genericMethods;

public class genSwap {

    static <T> void swap(T x,T y){
        T temp;
        temp = x;
        x= y;
        y = temp;
        System.out.println(x + "  " + y);
    }
    
    public static void main(String[] args) {
        System.out.println("swapping of numbers using generic method");
        swap(7, 5);
        swap(10.5,15);
    }
}
