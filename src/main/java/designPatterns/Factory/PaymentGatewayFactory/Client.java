package designPatterns.Factory.PaymentGatewayFactory;

import designPatterns.Factory.PaymentGatewayFactory.adapters.IPaymentGateway;
import designPatterns.Factory.PaymentGatewayFactory.factory.PaymentGatewayFactory;
import designPatterns.Factory.PaymentGatewayFactory.paymentgateway.PaymentGatewayType;
import designPatterns.Factory.PaymentGatewayFactory.paymentgateway.PaymentProcessor;

public class Client {
    public static void main(String[] args){
        int money = 500;
        PaymentGatewayFactory paymentGatewayFactory = new PaymentGatewayFactory();

        IPaymentGateway paymentGateway = paymentGatewayFactory.getPaymentGateway(PaymentGatewayType.GPAY);
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
        paymentProcessor.doCreditTransaction(money);

        IPaymentGateway paymentGateway1 = paymentGatewayFactory.getPaymentGateway(PaymentGatewayType.RPAY);
        paymentProcessor = new PaymentProcessor(paymentGateway1);
        paymentProcessor.doDebitTransaction(money);

    }

}
