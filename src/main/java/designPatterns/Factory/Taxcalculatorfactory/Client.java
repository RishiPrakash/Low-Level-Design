package designPatterns.Factory.Taxcalculatorfactory;

import designPatterns.Factory.Taxcalculatorfactory.entity.Employee;
import designPatterns.Factory.Taxcalculatorfactory.entity.EmployeeType;
import designPatterns.Factory.Taxcalculatorfactory.factory.TaxCalculatorFactory;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Employee> allCompanyEmployees = new ArrayList<>();
        allCompanyEmployees.add(new Employee("Rob", 1, EmployeeType.PERMANENT, 70000));
        allCompanyEmployees.add(new Employee("Tom", 2, EmployeeType.INTER, 2000));
        allCompanyEmployees.add(new Employee("Hardy", 2, EmployeeType.CONTRACTUAL, 30000));

        TaxCalculatorFactory taxCalculatorFactory = new TaxCalculatorFactory();
        allCompanyEmployees.forEach((e) -> {
            int taxOfEmployee = taxCalculatorFactory.getTaxCalculator(e.getType()).calculateTax(e.getSalary());
            System.out.println("Tax of "+e.getName()+" is :"+taxOfEmployee);

        });

    }

}
