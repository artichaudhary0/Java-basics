package OOPS.Polymorphism;

interface Payment{
    void pay(double amount);
    public void hello();
}

class CreditCard implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Credit Card Payment is about " + amount + "$");
    }
    @Override

    public void hello() {
        System.out.println("Credit Card Hello");

    }
}

class PhonePayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Phone Payment is about " + amount + "$");
    }
    @Override
    public void hello() {
        System.out.println("Phone Payment is about Hello!");
    }
}

class GPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("GPay Payment is about " + amount + "$");
    }
    @Override
    public void hello()
    {
        System.out.println("Hello World!");
    }
}

class  PaymentServices{
    public void paymentServices(Payment payment){
        payment.pay(10);
        payment.hello();
    }
}


public class OverridingInterface {
    public static void main(String[] args) {
        PaymentServices paymentServices = new PaymentServices();
        paymentServices.paymentServices(new CreditCard());
        paymentServices.paymentServices(new PhonePayment());
        paymentServices.paymentServices(new GPayment());
    }
}
