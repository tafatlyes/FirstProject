package parameterization;

import java.sql.SQLOutput;

public class MethodsOverloading {  //With method overloading, multiple methods can have the same name with different parameters such in our example below

    public static void main(String[] args) {
        PrintMyname();
        PrintMyname("Lyes1");
        PrintMyname("Lyes2", 20);

    }

    public static void PrintMyname(){
        System.out.println(11);
    }
    public static void PrintMyname(String name){
        System.out.println(name);
    }

    public static void PrintMyname(String name, int age) {
        System.out.println(name);
        System.out.println(age);

    }
}
