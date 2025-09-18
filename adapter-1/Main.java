public class Main {
    public static void main(String[] args) {
        NewPaymentGateway newGateway = new NewPaymentGateway();
        AbstractPaymentProcessor newGatewayAdapter = new NewPaymentGatewayAdapter(newGateway);

        System.out.println("--- Using the new payment gateway via the Adapter ---");
        newGatewayAdapter.processPayment(300.0);
    }
}