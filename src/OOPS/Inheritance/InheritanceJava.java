package OOPS.Inheritance;
/*
single inheritance :
one parent / super class /  base class , one child class / subclass / derived

Multilevel
A = B , B = C , (A = C indirectly)

Hierarchical inheritance :
1 parent , more than one child
*/

import java.util.Scanner;

class ParentClass {
    protected int id;
    protected String name;
    public ParentClass(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println(this.id + " " + this.name);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

// : => c++ , extends java
class ChildClass extends ParentClass {
    // child
    public ChildClass(int id, String name) {
        super(id, name);
    }
}

public class InheritanceJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id of the child: ");

        int id = sc.nextInt();
        System.out.println("Enter the name of the child: ");
        String name = sc.next();

        ChildClass c1 = new ChildClass(id ,name);
    }
}
