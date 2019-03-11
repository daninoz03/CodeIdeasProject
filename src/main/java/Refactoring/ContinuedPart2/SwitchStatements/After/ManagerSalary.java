package Refactoring.ContinuedPart2.SwitchStatements.After;

public class ManagerSalary implements SalaryCalculator {
    /*@Override
    float calculateSalaryasas(float salary) {
        return salary + (salary * 0.2f);
    }*/


    @Override
    public float calculateSalary(float salary) {
        return salary + (salary * 0.2f);
    }
}
