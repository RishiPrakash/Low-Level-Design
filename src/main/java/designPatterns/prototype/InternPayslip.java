package designPatterns.prototype;

public class InternPayslip extends PaySlip{
    @Override
    int calculateBonus() {
        return (this.getGrossSalary()/this.getTotalWorkingDays())*this.getTotalDaysWorked()/10;
    }
}
