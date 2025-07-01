package employee;

import java.util.List;

interface EmployeeAbstract {
     double getSalary();
     List<EmployeeModel> employeesDetails();
     String addEmployee(EmployeeModel employee);
}
