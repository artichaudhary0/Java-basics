import java.util.Scanner;


public class Arti {
    public static void main(String[] args) {
        /*
            Data type :
                Type  of data-type :
                    1 : Primitive data type :
                        byte : : size = 1 byte .
                            byte b = 100 ;
                        short :: size  = 2 byte
                             short s = 1000 ;
                        int :: size = 4 byte
                             int i = 100000;
                        long :: size = 8 byte
                            long l = 100000L ;
                        float :: size = 4 byte
                            float f = 10.5f ;
                        double :: size : 8
                            double d = 123.3
                        char :: size = 2 byte
                            char c = 'A'
                        boolean :: size = 1 bit
                            boolean flag = true ;

                    2 : non-primitive / reference :
                        String :
                            String str = "Hello, Java";
                        Array :
                            int[] array = {1,2,3,4,5,6};
                        class :
                            Define objects with attributes and method
                                class  Student{
                                    String name ;
                                    int age ;
                                }
                         interface :
                            Define methods that ,must be implemented by class.
                                interface Animal{
                                    void barking();
                                }

        */

        // printf = System.out.println/print() => ln = next line
        byte b = 100 ;
        short s = 10000 ;
        int i = 1451541541;
        long l = 10000000000000000L ;
        float f = 10.5f ;
        double d = 123.3;
        char c = 'A';
        boolean flag = true ;
        String str = "Hello, Java";

//        System.out.println(b);
//        System.out.println(s);
//        System.out.println(i);
//        System.out.println(l);
//        System.out.println(f);
//        System.out.println(d);
//        System.out.println(c);
//        System.out.println(flag);
//        System.out.println(str);

        /*
         Control structure :
          if
          if else
          nested if else
          ladder : if , else-if

          ternary => condition  ? true : false

          switch

          Looping
        */

//        boolean isSwitch = true ;

//        if(isSwitch) // true
//        {
//            System.out.println("Fan is running"); // first thing
//            isSwitch = !isSwitch; // false
//            System.out.println(isSwitch); // false
//        }
//
//        if(!isSwitch) // ! false => true
//        {
//            System.out.println("Not Fan is running"); // third
//            isSwitch = !isSwitch; // true
//            System.out.println(isSwitch); // true
//        }
//
//        if(isSwitch) // true
//        {
//            System.out.println("Fan is running"); // first thing
//            isSwitch = !isSwitch; // false
//            System.out.println(isSwitch); // false
//        }


//        int num1 = 10 ;
//
//        if(num1 > 0)
//                System.out.println("Num is positive");
//        else  if(num1 == 0)
//            System.out.println("Num is neutral");
//        else
//            System.out.println("Num is negative");

//        int age = 0 ;
//
//        if( age>0 && age < 18)
//        {
//            System.out.println("You can not vote");
//        }else if(age>=18 && age<=150){
//            System.out.println("You can  vote");
//        }else if(age == 0 || age < 0)
//        {
//            System.out.println("Need to be born");
//        }
//        else {
//            System.out.println("Invalid age!!");
//        }

        // ternary is replacement of if else
        boolean isSwitch = true ;
        if(isSwitch)
        {
            System.out.println("isSwitch is true");
        }else {
            System.out.println("isSwitch is false");
        }

        int a ;

        a = (10>20) ? 10 :  20;

        boolean isSwitchh;
        isSwitchh = false ;

        boolean bb ;

        bb = isSwitchh ? true : false ;

        String name ;
        name = isSwitchh ? "Arti" : "Chaudhary" ;
        System.out.println(name);

    }
}