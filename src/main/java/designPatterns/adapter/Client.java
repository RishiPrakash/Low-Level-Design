package designPatterns.adapter;

import designPatterns.adapter.adapters.GooglePaymentGatewayAdapter;
import designPatterns.adapter.adapters.IPaymentGateway;
import designPatterns.adapter.adapters.RazorpayGatewayAdapter;
import designPatterns.adapter.paymentgateway.PaymentProcessor;
import designPatterns.adapter.thirdPartySDK.GooglePaySDK;
import designPatterns.adapter.thirdPartySDK.RazorPaySDK;

public class Client {
    public static void main(String[] args) {
        /*
         * First client is doing transaction with Razorpay SDK
         * */
        int money = 500;//money to be credited
        RazorPaySDK razorPaySDK = new RazorPaySDK();
        IPaymentGateway paymentGateway = new RazorpayGatewayAdapter(razorPaySDK);
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
        paymentProcessor.doCreditTransaction(money);

        /**
         * Client want to switch to GPay
         */
        GooglePaySDK gsdk = new GooglePaySDK();
        IPaymentGateway paymentGateway1 = new GooglePaymentGatewayAdapter(gsdk);
        PaymentProcessor paymentProcessor1 = new PaymentProcessor(paymentGateway1);
        paymentProcessor1.doDebitTransaction(money);

        /**
         * Client might also want to get rid of this bootstrap code
         * to prepare each gateway.
         * We can dynamically pass PaymentProcessor object back to client
         *
         * This example is extended in --- Factory Pattern Package
         *
         */
    }
}
