package testclasses;

public class taxService {
    public static list<Employee>evaluateTaxUser(String input)
    {
        if(input.equalsIgnoreCase("tax"))
        {
            return database.getEmployees().stream().filter(emp->emp.getsalary())
        }
    }
}
