public class Employee
{
    private String firstName;
    private String lastName;
    private int idNumber;
    private static int numberOfEmployees;
    private static int employeeIDNumber;

    public Employee(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        numberOfEmployees = numberOfEmployees + 1;
        employeeIDNumber = 100 + numberOfEmployees;
        this.idNumber = employeeIDNumber;
    }

    public int getIDNumber()
    {
        return idNumber;
    }

    public String fullName()
    {
        return(firstName + " " + lastName);
    }

    public static int getMostRecentIDNumber()
    {
        return employeeIDNumber;
    }

    public static int getNumberOfEmployees()
    {
        return numberOfEmployees;
    }
}