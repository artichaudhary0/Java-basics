package CLASS;

/*
class without the name and is ofter used when implements interface or extending class.
This is commonly used for short-lived object like events.
 */
interface Greeting{
    void greet();
}

public class AnonymousInnerClass {
    public void displayMessage(){
        Greeting greeting = new Greeting() {
            @Override
            public void greet(){
                System.out.println("Hello World");
            }
        };
        greeting.greet();
    }

    public static void main(String[] args) {
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass();
        anonymousInnerClass.displayMessage();
    }
}
