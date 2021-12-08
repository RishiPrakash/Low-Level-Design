package designPatterns.Factory.Taxcalculatorfactory.SalaryProcessor;

import designPatterns.Factory.Taxcalculatorfactory.TaxCalculator.ITaxCalculator;

public class SalaryProcessor {
    ITaxCalculator taxCalculator;
    public SalaryProcessor(ITaxCalculator taxCalculator){
        this.taxCalculator = taxCalculator;
    }

}
