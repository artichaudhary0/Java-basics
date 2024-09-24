package OOPS.Inheritance.Questions;

class Animal{
    protected String speciesName;

    public Animal(String speciesName) {
        this.speciesName = speciesName;
    }

    public void eat(){
        System.out.println("eat");
    }
}


class  Mammal extends Animal{
    public Mammal(String speciesName) {
        super(speciesName);
    }

    public  void giveBirth()
    {
        System.out.println(speciesName + " give birth");
    }
}

class Dog extends Mammal{
    private String breed;

    public Dog(String breed) {
        super("Dog");
        this.breed = breed;
    }

    public  void bark()
    {
        System.out.println(breed + " bark");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Dog dog = new Dog("Labrador");
        dog.eat();
        dog.giveBirth();
        dog.bark();
    }
}
