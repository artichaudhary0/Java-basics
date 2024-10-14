package OOPS.Encapsulation;
/*
Access modifier : (control the visibility of member-variable and member-function.)
1 : private.
2 : protected.
3 : public.
OOPS.Encapsulation : wrapping up member-variable(attributes) and member-function(methods).

Constructor :
Automatically invoke when ever an object(instance of class) is created.
1 : Default constructor.
2 : parametrized constructor
*/

public class EncapsulationJava {

    // class variable
    private String name ;
    private int age;

    // default constructor
    public EncapsulationJava(){
       name = "Arti Chaudhary";
       age = 23;
    }

    // parametrized constructor
    public EncapsulationJava(String name, int age){
     // class variable = local variable
        this.name = name ;
        this.age = age ;
    }


    // getter => get name attribute value;
    public String getName(){
        return name;
    }


    // setter => set name attribute value;
    public void setName(String name){
        this.name = name;
    }

    // getter => get age attribute value;
    public  int getAge(){
        return age;
    }

    // setter => set name attribute value;
    public void setAge(int age){
        this.age = age;
    }


    public static void main(String[] args) {
        EncapsulationJava obj = new EncapsulationJava();
        obj.setName("James");
        System.out.println(obj.getName());
        obj.setAge(23);
        System.out.println(obj.getAge());
    }

}


