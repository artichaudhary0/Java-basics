package CLASS;/*
A wrapper class usually refers to wraps or encapsulates another class or primitive type
* */

// int[] arrayName

public  class Main{
    public static void  main(String[] args) {
        IntWrapper obj = new IntWrapper(5);
        obj.setValue();
        System.out.println(obj.getValue());
    }
}


