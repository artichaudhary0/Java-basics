package CLASS;/*
Local inner class is defined within a method or block of the code and can access local variables that are effectively final
 */

// outer class
public class LocalInnerClass {
    String globalMessage = " Hello this is global message!!!";

    public void  displayMessage(){
        String localMessage = " Hello this is local message!!!";

        class LocalInner{
            public void printMessage(){
                System.out.println(localMessage);
                System.out.println(globalMessage);
            }
        }

        LocalInner inner = new LocalInner();
        inner.printMessage();

    }

    public static void main(String[] args) {
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.displayMessage();
    }

}
