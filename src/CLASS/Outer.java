package CLASS;

public class Outer {
    private String message = "This is the outer class";

    public class InnerClass{
        public void displayPlayMessage(){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        InnerClass inner = outer.new InnerClass();
        inner.displayPlayMessage();
    }
}






