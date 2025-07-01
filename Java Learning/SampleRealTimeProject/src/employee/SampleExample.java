package employee;

import java.util.List;

public class SampleExample {
    public static void main(String[] args) {
        final EmployeeService employeeService = new EmployeeService();
        EmployeeModel employeeModel = new EmployeeModel();
        employeeModel.setName("Kamlesh G");
        employeeModel.setSalary(5000);
        employeeModel.setDepartment("Software Engineering");
        employeeModel.setAge(23);
        employeeModel.setPhoneNumber(123456789);

        String result = employeeService.addEmployee(employeeModel);
    }
}
