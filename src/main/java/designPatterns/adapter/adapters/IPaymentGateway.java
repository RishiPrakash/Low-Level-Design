package designPatterns.adapter.adapters;

public interface IPaymentGateway {
    void credit(int m);
    void debit(int m);
}
