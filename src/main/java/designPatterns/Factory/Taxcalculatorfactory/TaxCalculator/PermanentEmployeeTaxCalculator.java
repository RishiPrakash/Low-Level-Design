package designPatterns.Factory.Taxcalculatorfactory.TaxCalculator;

public class PermanentEmployeeTaxCalculator implements ITaxCalculator {
    @Override
    public int calculateTax(int salary) {
        return salary/20;
    }
}
