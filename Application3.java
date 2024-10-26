
interface PaymentProcessor {
    void processPayment(double amount);
}


class ThirdPartyPayment {
    public void executePayment(double amount) {

        System.out.println("Payment of Rs" + amount + " processed by third-party service.");
    }
}


class PaymentAdapter implements PaymentProcessor {
    private ThirdPartyPayment thirdPartyPayment;


    public PaymentAdapter() {
        this.thirdPartyPayment = new ThirdPartyPayment();
    }


    @Override
    public void processPayment(double amount) {
        thirdPartyPayment.executePayment(amount);
    }
}


public class Application3 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println("     PAYMENT SERVICE     ");
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println();

        PaymentProcessor payment = new PaymentAdapter();

        payment.processPayment(100.50);
    }
}