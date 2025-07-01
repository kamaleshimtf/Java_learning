package employee;

import java.util.List;
 class EmployeeService implements EmployeeAbstract{

     private final EmployeeServiceImpl employeeImpl = new EmployeeServiceImpl();

     @Override
     public double getSalary() {
         return 0;
     }

     @Override
     public List<EmployeeModel> employeesDetails() {
         return List.of();
     }

     @Override
     public String addEmployee(EmployeeModel employee) {
         return employeeImpl.addEmployee(employee);
     }
 }
