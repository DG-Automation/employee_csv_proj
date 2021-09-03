import config_mgr.ConfigMgr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRecordScanner {

    // variable below is the file reading object
    private final EmployeeFileReader employeeFileReader = new EmployeeFileReader();

    public List<String[]> generateRawEmployeeData() {
        List<String[]> employeeRawData = new ArrayList<>();

        // Scanner object below takes our file reader object and prepares a scanner object to work with our file
        Scanner scanner = new Scanner(employeeFileReader.empFileReader(ConfigMgr.employeeFileLocation()));
        scanner.nextLine();

        while (scanner.hasNext()){
            // looping and adding each item from the scanner into our employeeRawData ArrayList
            employeeRawData.add(scanner.nextLine().split(","));
        }
        return employeeRawData;
    }
}
