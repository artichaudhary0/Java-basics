package CLASS;// Inner class can also be used dynamically within the loop structure

public class InnerWithLoop {

    public  void createMultipleClass() {

        for (int i = 1; i <= 3; i++) {

            class  LoopInnerClass{
                private int id ;
                public LoopInnerClass(int id) {
                    this.id = id;
                }
                public void display(){
                    System.out.println("Inner class instance "+id);
                }
            }
            LoopInnerClass innerClass = new  LoopInnerClass(i);
            innerClass.display();
        }
    }

    public static void main(String[] args) {
        InnerWithLoop innerWithLoop = new InnerWithLoop();
        innerWithLoop.createMultipleClass();
    }


}
