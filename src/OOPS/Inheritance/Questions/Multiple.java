package OOPS.Inheritance.Questions;

// interface
interface SwimmingAnimal{
    void swim();
}

interface FlyingAnimal{
    void fly();
    void swim();
}

class Duck implements FlyingAnimal,SwimmingAnimal{
    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    public void swim() {
        System.out.println("Duck swimming");
    }

    public void quack()
    {
        System.out.println("Duck quack");
    }
}




public class Multiple {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
        d.quack();
    }
}
