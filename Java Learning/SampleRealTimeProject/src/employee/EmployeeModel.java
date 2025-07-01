package employee;

class EmployeeModel{
    private double salary;
    private String name;
    private String department;
    private int age;
    private int phoneNumber;

    public EmployeeModel(double salary, String name, String department, int age, int phoneNumber){
        this.salary = salary;
        this.name = name;
        this.department = department;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public EmployeeModel() {

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
