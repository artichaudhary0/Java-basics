package OOPS.Polymorphism;

/*
Polymorphism :
Many form.
Type :
1 : Compile time
2 : Run time
*/

//class Tax{
//    public double calculateTax(double income){
//        return income * 0.15;
//    }
//
//    public double calculateTax(double revenue, double expenses){
//        double  taxableIncome =  revenue - expenses ;
//        return taxableIncome * 0.30;
//    }
//
//    public double calculateTax(double income, String country){
//        switch(country.toLowerCase()){
//            case "india":
//                return income * 0.15;
//            case "us":
//                return income * 0.30;
//            case "uk":
//                return income * 0.20;
//            case "uae":
//                return income * 0.25;
//
//            default:
//                return calculateTax(income);
//        }
//    }
//}


// Image processing
class ImageProcessing{
    public void  processImage(int[][] imges){
        System.out.println("image processed");
    }

    public void processImage(int[][][] imges){
        System.out.println("image processed(RGB)");
    }

    public void processImage(int[][] image,String filter){
        System.out.println("image processed(RGB) : "+ filter);
    }

    public void processImage(int[][] image,String filter , int intensity){
        System.out.println("image processed(RGB) : "+ filter +" " +intensity);
    }
}

public class OverLoading {
    public static void main(String[] args) {
        ImageProcessing ip = new ImageProcessing();

    }
}
