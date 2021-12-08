package designPatterns.Factory.Taxcalculatorfactory.TaxCalculator;

public class ContractualEmployeeTaxCalculator implements ITaxCalculator {
    @Override
    public int calculateTax(int salary) {
        return salary/15;
    }
}
