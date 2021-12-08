package designPatterns.prototype;

public abstract class PaySlip implements Cloneable{
    private static final String orgName = "Scaler";
    private int totalDaysWorked;
    private int totalWorkingDays;
    private int grossSalary;


    @Override
    public PaySlip clone() throws CloneNotSupportedException {
        return (PaySlip) super.clone();
    }

    public static String getOrgName() {
        return orgName;
    }

    public int getTotalDaysWorked() {
        return totalDaysWorked;
    }

    public void setTotalDaysWorked(int totalDaysWorked) {
        this.totalDaysWorked = totalDaysWorked;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public int getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(int grossSalary) {
        this.grossSalary = grossSalary;
    }

    abstract int calculateBonus();

}
