import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeesGeneratorTests2 {

    private static Employee employee;
    private static Map<String, Employee> employeesMap;

    @BeforeAll
    public static void setup(){
        employeesMap = new EmployeesGenerator().generateEmployeesMap();

        List<String[]> employeesRawdata = new EmployeeRecordScanner().generateRawEmployeeData();

        employee = new Employee(employeesRawdata.get(0));
    }

    @Test
    public void employeeGeneratorTests(){
        assertEquals(employee.getFirstName(), employeesMap.get(employee.getEmployeeID()).getFirstName());
        System.out.println(employee.getFirstName());
        System.out.println(employeesMap.get(employee.getEmployeeID()).getFirstName());

    }

}
