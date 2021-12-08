package designPatterns.adapter.thirdPartySDK;

public class RazorPaySDK {
    public void deductMoney(int m){
        System.out.println("We are deducting "+m+" rupees from your account : Supported by R-Pay");
    }
    public void addMoney(int m){
        System.out.println("We are adding "+m+" rupees in your account : Supported by R-Pay");
    }
}
