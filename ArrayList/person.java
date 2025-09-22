package ArrayList;

import java.util.function.Consumer;

public class person {
    String name;
    int age;

    public person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
        
    }

    public void setName(String name){
        this.name=name;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public static Consumer<? super person> printData() {
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'printData'");

        System.out.println();
        return null;// in this place null is not sufficient i need to return getname
    }

}
