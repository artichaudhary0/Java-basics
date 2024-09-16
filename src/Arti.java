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
//        byte b = 100 ;
//        short s = 10000 ;
//        int i = 1451541541;
//        long l = 10000000000000000L ;
//        float f = 10.5f ;
//        double d = 123.3;
//        char c = 'A';
//        boolean flag = true ;
//        String str = "Hello, Java";

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
//        boolean isSwitch = true ;
//        if(isSwitch)
//        {
//            System.out.println("isSwitch is true");
//        }else {
//            System.out.println("isSwitch is false");
//        }
//
//        int a ;
//
//        a = (10>20) ? 10 :  20;
//
//        boolean isSwitchh;
//        isSwitchh = false ;
//
//        boolean bb ;
//
//        bb = isSwitchh ? true : false ;
//
//        String name ;
//        name = isSwitchh ? "Arti" : "Chaudhary" ;
//        System.out.println(name);
//




        // Switch case
//        int choice ;
//        int num1 , num2 ;
//        System.out.println("Enter 1 for Addition");
//        System.out.println("Enter 2 for Subtraction");
//        System.out.println("Enter 3 for Multiplication");
//        System.out.println("Enter 4 for division");
//        System.out.println("Enter 5 for Modulus");
//        System.out.println("Enter 0 for Exit");
//        System.out.print("Enter your choice : ");
//        Scanner sc = new Scanner(System.in);
//
//        choice = sc.nextInt();
//
//        switch (choice)
//        {
//            case 1 :
//                System.out.print("Enter num1 : ");
//                num1 = sc.nextInt();
//                System.out.print("Enter num2 : ");
//                num2 = sc.nextInt();
//                System.out.println("Addition of "+num1 +" and "+num2 + " is "+(num1 + num2));
//                break;
//            case 2 :
//                System.out.print("Enter num1 : ");
//                num1 = sc.nextInt();
//                System.out.print("Enter num2 : ");
//                num2 = sc.nextInt();
//                System.out.println("Subtraction of "+num1 +" and "+num2 + " is "+(num1 - num2));
//                break;
//            case 3 :
//                System.out.print("Enter num1 : ");
//                num1 = sc.nextInt();
//                System.out.print("Enter num2 : ");
//                num2 = sc.nextInt();
//                System.out.println("Multiply of " + num1 + " and " + num2 + " is " + (num1 * num2));
//                break;
//            case 4 :
//                System.out.print("Enter num1 : ");
//                num1 = sc.nextInt();
//                double num3 = (double) num1;
//                System.out.print("Enter num2 : ");
//                num2 = sc.nextInt();
//                double num4 = (double) num2;
//                if(num2 != 0)
//                    System.out.println("Division of "+num1 +" and "+num2 + " is "+(num3 / num4));
//                else
//                    System.out.println("Can not divide by zero");
//
//                break;
//            case 5 :
//                System.out.print("Enter num1 : ");
//                num1 = sc.nextInt();
//                System.out.print("Enter num2 : ");
//                num2 = sc.nextInt();
//                if(num2 != 0)
//                    System.out.println("Modulus of "+num1 +" and "+num2 + " is "+(num1 % num2));
//                else
//                    System.out.println("Can not modulus by zero");
//                break;
//            default:
//                System.out.println("Invalid choice!!!");
//                break;
//        }

             /*loop :
             Type of loop :
                1 : Entry control :
                    while , for
                2 : Exit control
                    do - while
                1 : while
                2 : do while
                3 : for loop

                1 : Initialization (Starting value)
                2 : Condition
                3 : flow(Increment/ Decrement)
        */

//        int j ;  // 1 to 10
//        System.out.print("Enter starting value : ");
//        Scanner scanner = new Scanner(System.in);
//
//        j = scanner.nextInt();
//        while (j<=10){
//
//            System.out.println(j);
//            j++;
//        }

        // 12345
//        int count = 0;
//        int number ;
//        Scanner sc = new Scanner(System.in);
//
//        number = sc.nextInt();

//        while (number>0)
//        {
//            number = number/10 ;
//            count++ ;
//        }
//
//        System.out.print("Total no. digit : "+count);


//            do{
//                count++ ;
//                number = number/10;
//            }while (number>0);
//
//        System.out.print("Total no. digit : "+count);

//        int j = 1 ;
//        while (number>0)
//        {
//            number = number/10 ;
//            count++;
//            while (j<5)
//            {
//                System.out.println(j);
//                j++;
//            }
//        }

        // Array :

        // declare an array
//        int[] array ; // declare an array of integer type

        // creating an array :
//        array = new int[5];
//
//        // initilize array :
//        int[] arr = {1,2,3,4,5,6};

        // Accessing value of array :
//        System.out.println(arr[3]);


        // Modifying values :
        // arr[3] = 44 ;
//        System.out.println(arr[3]);

//        for(int i = 0 ; i <arr.length ; i++)
//        {
//
//            System.out.println(arr[i]);
//        }

        // for - each
//        for(int value : arr)
//        {
//            System.out.println(value);
//        }

//        int[] arr = {1,2,3,4,5,6,7,8,9};
//
//        System.out.println(arr[1]);
//        arr[2] = 234 ;
//        System.out.println(arr[2]);
//
//        for(int value : arr)
//        {
//            System.out.println(value);
//        }
//
//        for(int i = 0 ; i<arr.length ; i++)
//        {
//                System.out.println(arr[i]);
//        }

//        int[] array = {1,2344,2535,234,2424,68,443};
//        int max = array[0];
//        int sum = 0 ;
//        int min = array[0];
//        for(int i = 0 ; i < array.length ; i++){
//            sum = sum + array[i];
//            if(array[i] > max){
//                max = array[i];
//            }
//            if(array[i] < min){
//                min = array[i];
//            }
//        }

//        System.out.println("Max element : "+ max +" sum is : "+sum+ " min is : "+min);
//
//        char[] charArray = {'a','A','b','c','d','Z','@'};
//
//        for (int i = 0; i < charArray.length; i++) {
////              small
////            if(charArray[i] >= 95 && charArray[i] <= 122){
////                System.out.println(charArray[i]);
////            }
//            // cap 65 + 26 = 91
//            if(charArray[i] >= 65 && charArray[i] <= 90){
//                System.out.println(charArray[i]);
//            }
//        }

        // Delete an element from an array by shifting the remaining elements.

//        int[] array = {1,2,3,4,55,5};
//        int deleteItem = 55 ;
//        int deletedIndex = -1; // 4
//
//        for(int i = 0 ; i<array.length ; i++)
//        {
//            if(array[i] == deleteItem)
//            {
//                deletedIndex = i;
//            }
//        }
//
//        if(deletedIndex != -1)
//        {
//            for (int i = deletedIndex ; i < array.length - 1 ; i++)
//            {
//                // 2 = 3
//                array[i] = array[i+1];
//            }
//
//        }else{
//            System.out.println("No such element");
//        }
//
//        for (int i = 0 ; i < 5 ; i++)
//        {
//            System.out.print(array[i] + " ");
//        }
    }
}