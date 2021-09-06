import config_mgr.ConfigMgr;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRecordScanner {

    private static final Logger logger = LogManager.getLogger(EmployeeRecordScanner.class);

    // variable below is the file reading object
    private final EmployeeFileReader employeeFileReader = new EmployeeFileReader();

    public List<String[]> generateRawEmployeeData() {
        List<String[]> employeeRawData = new ArrayList<>();

        // Scanner object below takes our file reader object and prepares a scanner object to work with our file
        logger.debug("Start Employees csv Scanner");
        Scanner scanner = new Scanner(employeeFileReader.empFileReader(ConfigMgr.employeeFileLocation()));
        scanner.nextLine();

        while (scanner.hasNext()){
            // looping and adding each item from the scanner into our employeeRawData ArrayList
            employeeRawData.add(scanner.nextLine().split(","));
        }
        logger.debug("Employees Scanner finished");
        return employeeRawData;
    }
}
