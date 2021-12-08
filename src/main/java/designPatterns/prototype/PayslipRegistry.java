package designPatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class PayslipRegistry {
    private final Map<String, PaySlip> registry = new HashMap<>();
    public PayslipRegistry(){
        load();
    }

    public PaySlip fetchPaySlip(String type) {
        PaySlip payslip = null;
        try {
            payslip = registry.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return payslip;
    }

    private void load() {
        ContractualPayslip contractualPayslip = new ContractualPayslip();
        contractualPayslip.setGrossSalary(10000);
        contractualPayslip.setTotalWorkingDays(21);

        InternPayslip internPayslip = new InternPayslip();
        internPayslip.setGrossSalary(15000);
        internPayslip.setTotalWorkingDays(26);

        PermanentEmployeePaySlip permanentEmployeePaySlip = new PermanentEmployeePaySlip();
        permanentEmployeePaySlip.setGrossSalary(20000);
        permanentEmployeePaySlip.setTotalWorkingDays(31);

        registry.put("Contractual", contractualPayslip);
        registry.put("Permanent", permanentEmployeePaySlip);
        registry.put("Intern", internPayslip);
    }
}
