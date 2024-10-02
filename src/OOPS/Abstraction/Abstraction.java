package OOPS.Abstraction;

abstract class Paymentt{
    protected double amount;

    public Paymentt(double amount){
        this.amount = amount;
    }
    public abstract void processPayment();

    public void getAmount(){
        System.out.println("Arti " + amount);
    }
}

class  CreditCardPayment extends Paymentt{
    private String cardNumber;
    public CreditCardPayment(double amount,String creditCardNo){
        super(amount);
        this.cardNumber = creditCardNo;
    }
    @Override
    public void processPayment(){
        System.out.println("Card Number: " + cardNumber);
        getAmount();
    }
}





class PhonePayment extends Paymentt{
    private String phoneNumber;
    public PhonePayment(double amount,String phoneNo){
        super(amount);
        this.phoneNumber = phoneNo;
    }

    @Override
    public void processPayment(){
        System.out.println("Phone Number: " + phoneNumber);
        getAmount();
    }

}

class ShoppingCart{
    private Paymentt payment;

    public ShoppingCart(Paymentt payment){
        this.payment = payment;
    }

    public void checkout(){
        payment.processPayment();
        System.out.println("hello"+payment.amount);
    }
}



public class Abstraction {

    public static void main(String[] args) {
        Paymentt creditCard = new PhonePayment(1000 , "64376734");
        ShoppingCart shoppingCart = new ShoppingCart(creditCard);
        shoppingCart.checkout();
    }
}

/*
    Crud :
        C : Create (POST)
        R : Read / Retrieve (GET)
        U : Update (PATCH / PUT)
        D : Delete (DELETE)
*/