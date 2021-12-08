package designPatterns.Factory.PaymentGatewayFactory.thirdPartySDK;

public class GooglePaySDK {
    public void increaseAmount(int m){
        System.out.println("We are increasing your total amount by "+m+" rupees : supported by G-Pay");
    }
    public void decreaseAmount(int m){
        System.out.println("We are decreasing your total amount by "+m+" rupees : supported by G-Pay");
    }
}
