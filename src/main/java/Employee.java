public class Employee {
    private String employeeID;
    private String namePrefix;
    private String firstName;
    private char middleInitial;
    private String lastName;
    private char gender;
    private String email;
    private String dateOfBirth;
    private String dateOfJoining;
    private int salary;

    public Employee(String[] employeeRawData) {
        this.employeeID = employeeRawData[0];
        this.namePrefix = employeeRawData[1];
        this.firstName = employeeRawData[2];
        this.middleInitial = employeeRawData[3].charAt(0);
        this.lastName = employeeRawData[4];
        this.gender = employeeRawData[5].charAt(0);
        this.email = employeeRawData[6];
        this.dateOfBirth = employeeRawData[7];
        this.dateOfJoining = employeeRawData[8];
        this.salary = Integer.parseInt(employeeRawData[9]);

    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public int getSalary() {
        return salary;
    }
}
