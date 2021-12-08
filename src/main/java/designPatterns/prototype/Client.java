package designPatterns.prototype;

public class Client {
    public static void main(String[] args) {
        PayslipRegistry registry = new PayslipRegistry();
        PaySlip internPayslip = registry.fetchPaySlip("Intern");
        internPayslip.setTotalDaysWorked(15);
        System.out.println(internPayslip.calculateBonus());

        PaySlip contractualPayslip = registry.fetchPaySlip("Contractual");
        contractualPayslip.setTotalDaysWorked(18);
        System.out.println(contractualPayslip.calculateBonus());

        PaySlip permanentPayslip = registry.fetchPaySlip("Permanent");
        permanentPayslip.setTotalDaysWorked(30);
        System.out.println(permanentPayslip.calculateBonus());


    }
}
