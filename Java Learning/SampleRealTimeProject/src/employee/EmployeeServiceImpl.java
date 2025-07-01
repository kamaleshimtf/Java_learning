package employee;


 class EmployeeServiceImpl{

     public String addEmployee(EmployeeModel employeeModel){
        CommonClass employeeFinalList = new CommonClass();

        EmployeeModel newEmployee = new EmployeeModel();
        newEmployee.setName(employeeModel.getName());
        newEmployee.setSalary(employeeModel.getSalary());
        newEmployee.setDepartment(employeeModel.getDepartment());
        newEmployee.setAge(employeeModel.getAge());
        newEmployee.setPhoneNumber(employeeModel.getPhoneNumber());

        employeeFinalList.employeeList.add(newEmployee);
        return "Successfully added employee";
    }
}
