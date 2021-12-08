package designPatterns.prototype;

public class ContractualPayslip extends PaySlip{
    @Override
    int calculateBonus() {
        return (this.getGrossSalary()/this.getTotalWorkingDays())*this.getTotalDaysWorked()/15;
    }
}
