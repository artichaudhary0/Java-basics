import java.util.ArrayList;

class Person {
    String name;
    int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter and setter

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

public class ExampleArrayList {

  public static void main(String[] args) {
      // create a ArrayList Of Person
      ArrayList<Person> persons = new ArrayList<>();

        // Create
        persons.add(new Person("John", 18));
        persons.add(new Person("Jane Doe", 19));
        persons.add(new Person("Jane Jack", 20));
        persons.add(new Person("Shreyang Doe", 21));
        persons.add(new Person("Sajjan Doe", 22));
        persons.add(new Person("Jeel Doe", 23));


        // Read
//      System.out.println("Person at index 1 : " + persons.get(0));

      // update :

      Person JaneDoe = persons.get(1);
      JaneDoe.setAge(36);


      persons.set(1,new  Person("Arti" , 23));

//      System.out.println(persons);

      // remove
      persons.remove(1);
//      System.out.println("Person at index 2 : " + persons.get(1));

      // ITERATE : For each
//      for(Person person : persons){
//          System.out.println(person);
//      }

      // Search by name
      String searchName = "Arti" ;
      Person isFound = null ;

      for(Person person : persons){
          if(person.getName().equals(searchName)){
              isFound = person;
              break;
          }
      }
        if(isFound != null){
            System.out.println(isFound);
        }else {
            System.out.println("not found");
        }

      persons.clear();
        System.out.println(persons);
  }

}
