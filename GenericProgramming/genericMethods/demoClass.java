package GenericProgramming.genericMethods;

public class demoClass {

    <T> void genericMethod(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        demoClass obj = new demoClass();
       obj. genericMethod(9);
       obj.genericMethod("Omkar");
       obj.genericMethod(8.5);
       obj.genericMethod(true);
       

    }
    
}
