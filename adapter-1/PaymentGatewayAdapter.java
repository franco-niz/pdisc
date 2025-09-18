public class PaymentGatewayAdapter extends AbstractPaymentProcessor {
    private PaymentGateway gateway;

    public PaymentGatewayAdapter(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void processPayment(double amount) {
        gateway.makePayment(amount, "USD");
        this.logTransaction(amount);
    }
}