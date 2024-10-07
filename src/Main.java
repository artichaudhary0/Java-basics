/*
Java Collection :
give interface or class to manipulate group of object.
example :
    1 : List
    2 : Set
    3 : Queue
    4 : Map
List Interface :
1 : ArrayList
2 : LinkedList
3 : Vector

ArrayList
1 : It maintains the insertion order.
2 : It allows duplicate elements [1,1,1,1,2,3,4,,5,6,6,6,6]
3 : It grows dynamically when elements are added beyond its initial capacity.


CRUD :
Create
Read
Update
Delete


*/


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        // ArrayList Methods and operation

        // create
        list.add("AApple");
        list.add("Apple");
        list.add("Apple");
        list.add("Grapes");
        list.add("Water Melons");
        list.add("Orange");



        // Read
        String fruit = list.get(5);

        // update : Already existing data is being updates
        list.set(0,"Apple"); // list.set(index of item which you want to update , value of item)

        // Removing element
        list.remove(0); // list.remove(index of item which you want to remove)

        // for-each
        for(String f : list) // kon se type ko search with variable name : kidhar search karna hai
        {
            System.out.println(f);
        }

        // check if list contains an element : contains(element which you want to check)

        boolean containPineApple = list.contains("Apple");
        System.out.println(containPineApple);

    }
}