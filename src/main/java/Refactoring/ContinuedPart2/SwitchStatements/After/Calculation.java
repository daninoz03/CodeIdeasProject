package Refactoring.ContinuedPart2.SwitchStatements.After;

/**
 *
 */
public class Calculation {

    public float salary;
    public float bonusPercentage;

    public ManagerSalary  managerSalary = new ManagerSalary();
    public SupervisorSalary supervisorSalary = new SupervisorSalary();


    SalaryCalculator salaryCalculator;
    public float calculateSalary(Employee employee) {
        switch (employee.getType()) {
            case "Worker":
                return 0;
            case "Supervisor":
                salaryCalculator = new SupervisorSalary();
            case "Manager":
                salaryCalculator = new ManagerSalary();
        }
        return salaryCalculator.calculateSalary(salary);
    }

}
