package ExceptionChain;

import java.util.ArrayList;

public class ExceptionCatchClass {

    ArrayList<String> returnedList;

    public static void main(String[] args) {
        ExceptionCatchClass exceptionCatchClass = new ExceptionCatchClass();
        exceptionCatchClass.go();
    }

    public void go() {
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setName("Banko");
        ArrayList<String> employee1Managers = new ArrayList<>();
        employee1Managers.add("Blahblah");
        employee1Managers.add("Donny");
        employee1.setManagers(employee1Managers);

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setName("Daresh");

        Employee employee3 = new Employee();
        employee3.setId(3);
        employee3.setName("Marco");
        ArrayList<String> employee3Managers = new ArrayList<>();
        employee3Managers.add("Dave");
        employee3Managers.add("Frank");
        employee3.setManagers(employee3Managers);

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        ExceptionThrownClass exceptionThrownClass = new ExceptionThrownClass();
        /*for (int i=0; i<4; i++) {
            exceptionThrownClass.storeEmployeeIdsInList();
        }*/
        for (Employee employee: employeeList) {
            try {
                returnedList = exceptionThrownClass.storeEmployeeIdsInList(employee);
            }catch (Exception e) {

            }

        }
        System.out.println(returnedList);

    }

}
