package account.interfaces;

import account.model.ACCreationModel;
import account.model.LoginModel;

public interface AccountInterfaces {
    public String registerAccount(ACCreationModel model);
    public String loginAccount(LoginModel model);
    public double getBalance(LoginModel model);
    public String withdraw(double amount, LoginModel model);
    public String deposit(double amount, LoginModel model);
}
