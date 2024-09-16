public class outerClass {

    private  static  String staticMessage = " This is a static message";

    public static class StaticMessageClass{
       public void displayMessage(){
           System.out.println(staticMessage);
       }
    }

    public static  void main(String[] args){
        StaticMessageClass staticMessageClass = new StaticMessageClass();
        staticMessageClass.displayMessage();
    }

}
