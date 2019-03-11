package Refactoring.ContinuedPart2.SwitchStatements.After;

public class SupervisorSalary implements SalaryCalculator {
    @Override
    public float calculateSalary(float salary) {
        return salary + (salary * 0.5f);
    }
    /*float calculateSalary(float salary) {
        return salary + (salary * 0.5f);
    }*/
}
