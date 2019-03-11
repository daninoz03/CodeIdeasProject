import Predicates.PresentationExample.Employee;
import Predicates.PresentationExample.EmployeePredicateExample;
import Predicates.PresentationExample.Main;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;

@RunWith(MockitoJUnitRunner.class)
public class Testing {


    @Test
    public void firstTest(){
        // given
        Main main = new Main();
        Employee employee1 = new Employee("Test",23,"Anything","The Moon");
        Employee employee2 = new Employee("Another Test", 106, "Lunatic", "Under The Sea");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);

        // when
        List<Employee> returnedEmployees = main.filterByAgeList(employees, EmployeePredicateExample.getNonRetiredEmployees);

        // then
        Assert.assertThat(returnedEmployees.size(),is(1));
    }

}
