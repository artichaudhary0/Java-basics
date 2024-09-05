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

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(flag);
        System.out.println(str);
    }
}