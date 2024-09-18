/*inner class access both static and non-static members of the class*/

public class RegularInnerClass {
    private String message = "cjswvtwucvx";
    private static  String staticMessage = "sgukvfcykirev";


    public class InnerClass {
        public void displayMessage() {
            System.out.println(message);
            System.out.println(staticMessage);
        }
    }

    public static void main(String[] args) {
        RegularInnerClass regularInnerClass = new RegularInnerClass();
        InnerClass inner = regularInnerClass.new InnerClass();
        inner.displayMessage();
    }
}
