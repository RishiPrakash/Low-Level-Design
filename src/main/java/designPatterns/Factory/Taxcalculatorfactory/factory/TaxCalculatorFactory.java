package designPatterns.Factory.Taxcalculatorfactory.factory;

import designPatterns.Factory.Taxcalculatorfactory.TaxCalculator.ContractualEmployeeTaxCalculator;
import designPatterns.Factory.Taxcalculatorfactory.TaxCalculator.ITaxCalculator;
import designPatterns.Factory.Taxcalculatorfactory.TaxCalculator.InternTaxCalculator;
import designPatterns.Factory.Taxcalculatorfactory.TaxCalculator.PermanentEmployeeTaxCalculator;
import designPatterns.Factory.Taxcalculatorfactory.entity.EmployeeType;

public class TaxCalculatorFactory {
    public ITaxCalculator getTaxCalculator(EmployeeType type){
        switch (type){
            case INTER:{
                return new InternTaxCalculator();
            }
            case PERMANENT:{
                return new PermanentEmployeeTaxCalculator();
            }
            case CONTRACTUAL:
            default:{
                return new ContractualEmployeeTaxCalculator();
            }
        }
    }
}
