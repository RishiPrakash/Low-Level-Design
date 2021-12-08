package designPatterns.adapter.adapters;

import designPatterns.adapter.thirdPartySDK.GooglePaySDK;

public class GooglePaymentGatewayAdapter implements IPaymentGateway {
    GooglePaySDK GSDK = null;
    public GooglePaymentGatewayAdapter(GooglePaySDK GSDK){
        this.GSDK = GSDK;
    }

    @Override
    public void credit(int m) {
        GSDK.increaseAmount(m);
    }

    @Override
    public void debit(int m) {
        GSDK.decreaseAmount(m);
    }
}
