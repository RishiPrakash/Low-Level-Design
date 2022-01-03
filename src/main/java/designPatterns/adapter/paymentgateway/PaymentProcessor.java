package designPatterns.adapter.paymentgateway;

import designPatterns.adapter.adapters.IPaymentGateway;

public class PaymentProcessor {
    IPaymentGateway paymentGateway;

    public PaymentProcessor(IPaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void doDebitTransaction(int money) {
        paymentGateway.debit(money);
    }

    public void doCreditTransaction(int money) {
        paymentGateway.credit(money);
    }
}
