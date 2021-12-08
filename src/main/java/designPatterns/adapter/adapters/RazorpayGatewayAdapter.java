package designPatterns.adapter.adapters;

import designPatterns.adapter.thirdPartySDK.RazorPaySDK;

public class RazorpayGatewayAdapter implements IPaymentGateway {
    RazorPaySDK RSDK = null;
    public RazorpayGatewayAdapter(RazorPaySDK RSDK){
        this.RSDK = RSDK;
    }
    @Override
    public void credit(int m) {
        RSDK.addMoney(m);
    }

    @Override
    public void debit(int m) {
        RSDK.deductMoney(m);
    }
}
