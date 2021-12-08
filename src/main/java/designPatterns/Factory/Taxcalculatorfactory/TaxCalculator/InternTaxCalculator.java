package designPatterns.Factory.Taxcalculatorfactory.TaxCalculator;

public class InternTaxCalculator implements ITaxCalculator {
    @Override
    public int calculateTax(int salary) {
        return salary/10;
    }
}
