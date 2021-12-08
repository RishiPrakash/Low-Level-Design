package designPatterns.Factory.PaymentGatewayFactory.factory;

import designPatterns.Factory.PaymentGatewayFactory.paymentgateway.PaymentGatewayType;
import designPatterns.Factory.PaymentGatewayFactory.adapters.GooglePaymentGatewayAdapter;
import designPatterns.Factory.PaymentGatewayFactory.adapters.IPaymentGateway;
import designPatterns.Factory.PaymentGatewayFactory.adapters.RazorpayGatewayAdapter;
import designPatterns.Factory.PaymentGatewayFactory.thirdPartySDK.GooglePaySDK;
import designPatterns.Factory.PaymentGatewayFactory.thirdPartySDK.RazorPaySDK;

public class PaymentGatewayFactory {
    public IPaymentGateway getPaymentGateway(PaymentGatewayType type){
        switch (type){
            case GPAY:{
                return new GooglePaymentGatewayAdapter(new GooglePaySDK());
            }
            case RPAY:
            default:{
                return new RazorpayGatewayAdapter(new RazorPaySDK());
            }
        }
    }
}
