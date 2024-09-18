/*
behave like a regular class but is nested inside the another class.
It cannot access the non-static members of the outer class
*/
// outer claas
public class StaticNestedClass {

    private static  String staticMessage = "Hello world!!"; // static member
    private String message = "hellll"; // non - static

    // inner static class
    private   static  class  StaticMessage{
        public  void displayMessage(){
            System.out.println(staticMessage);
            // System.out.println(message); // can not access non-static member
        }
    }

    public static void main(String[] args)
    {
        StaticMessage msg = new StaticMessage();
        msg.displayMessage();
    }

}
