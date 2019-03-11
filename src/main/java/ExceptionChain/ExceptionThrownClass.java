package ExceptionChain;

import java.util.ArrayList;

public class ExceptionThrownClass {

    public ArrayList<String> storeEmployeeIdsInList(Employee employee) {
        ArrayList<String> employeeIdsList = new ArrayList<>();
        //try {

            employeeIdsList.add(employee.getManagers().get(0));
        /*}catch (Exception e) {
            System.out.println(e);
        }*/
        System.out.println(employeeIdsList);
        return employeeIdsList;



    }

}
