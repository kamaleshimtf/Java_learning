package account.model;

public class ACCreationModel {
    private String customerName;
    private String customerEmail;
    private String phoneNumber;
    private String address;
    private String accountNumber;
    private double initialDeposit;



    public double getBalance() {
        return initialDeposit;
    }

    public void setBalance(double balance) {
        this.initialDeposit = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public ACCreationModel() {

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String accountNumber) {
        this.address = accountNumber;
    }
    public ACCreationModel(String customerName, String customerEmail, String phoneNumber, String address, String accountNumber, double initialDeposit) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.accountNumber = accountNumber;
        this.initialDeposit = initialDeposit;
    }
}
