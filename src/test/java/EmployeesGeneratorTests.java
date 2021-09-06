import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeesGeneratorTests {

    private static Employee randomEmployee;
    private static Map<String, Employee> employeesMap;

    @BeforeAll
    public static void setup(){
        // Returning our employees map
        employeesMap = new EmployeesGenerator().generateEmployeesMap();

        // Returning our employees raw data as a string[]
        List<String[]> employeesRawdata = new EmployeeRecordScanner().generateRawEmployeeData();

        // Instantiating the Random to generate random for us
        Random random = new Random();

        // Utilising random by passing our raw data array as the size to generate our number within the bounds of information
        // then adding it as an employee object
        randomEmployee = new Employee(employeesRawdata.get(random.nextInt(employeesRawdata.size())));
    }

    @Test
    public void employeeGeneratorTests(){
        assertEquals(randomEmployee.getFirstName(), employeesMap.get(randomEmployee.getEmployeeID()).getFirstName());
        System.out.println(randomEmployee.getFirstName());
        System.out.println(employeesMap.get(randomEmployee.getEmployeeID()).getFirstName());

    }

}
