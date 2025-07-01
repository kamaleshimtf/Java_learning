package account.model;

public class LoginModel {
    private String name;
    private String emilId;
    private String accountNumber;

    public LoginModel(String name, String emailId, String accountNumber) {
    }

    public LoginModel() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmilId() {
        return emilId;
    }

    public void setEmilId(String emilId) {
        this.emilId = emilId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
