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


/* Type of Inner classes :
1 : regular inner class :
2 : static nested class :
3 : local inner class
4 : Anonymous inner class
*/






