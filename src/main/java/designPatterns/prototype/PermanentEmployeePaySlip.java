package designPatterns.prototype;

public class PermanentEmployeePaySlip extends PaySlip{
    @Override
    int calculateBonus() {
        return (this.getGrossSalary()/this.getTotalWorkingDays())*this.getTotalDaysWorked()/20;
    }
}
