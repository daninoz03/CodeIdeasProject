package Refactoring.ContinuedPart2.SwitchStatements.Before;

/**
 *Multiple Switch statements doing the same thing
 */
public class Calculation {

    public float salary;
    public float bonusPercentage;

    public float calculateSalary(Employee employee) {
        switch (employee.getType()) {
            case "Worker":
                return 0;
            case "Supervisor":
                return salary + (salary * 0.2F);
            case "Manager":
                return salary + (salary * 0.7F);
            default:
                return 0.0f;
        }
    }

    public float calculateYearBonus(Employee employee) {
        switch (employee.getType()) {
            case "Worker":
                return salary;
            case "Supervisor":
                return salary + (bonusPercentage * 0.5f);
            case "Manager":
                return salary + (salary * 0.7f);
            default:
                return 0.0F;

        }

    }

}
