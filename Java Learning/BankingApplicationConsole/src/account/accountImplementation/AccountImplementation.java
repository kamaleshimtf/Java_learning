package account.accountImplementation;

import account.commonclass.CommonClass;
import account.interfaces.AccountInterfaces;
import account.model.ACCreationModel;
import account.model.LoginModel;

import java.util.List;

public class AccountImplementation implements AccountInterfaces {
    final CommonClass commonClass = new CommonClass();
    @Override
    public String registerAccount(ACCreationModel model) {
        try{
            if (model == null) {
                return "Invalid account details provided.";
            }
            commonClass.allaccountList.add(model);
            return "Account successfully registered! - " + model.getAccountNumber();
        }
        catch (Exception e){
            return "Something went wrong, please try again later.";
        }
    }

    @Override
    public String loginAccount(LoginModel model) {
       try{
           List<ACCreationModel> accounts = commonClass.allaccountList;
           for (ACCreationModel ac : accounts) {
               if(!ac.getAccountNumber().equals(model.getAccountNumber())
                       && ac.getCustomerName().equals(model.getName())
                       && ac.getCustomerEmail().equals(model.getEmilId())) {
                   return "Account mismatched.";
               }
           }
       }
       catch (Exception e){
           return "Something went wrong, please try again later.";
       }
       return "Account successfully logged in!";
    }

    @Override
    public double getBalance(LoginModel model) {
        try {
            List<ACCreationModel> accounts = commonClass.allaccountList;
            double balance = commonClass.allaccountList.getFirst().getBalance();
            for (ACCreationModel ac : accounts) {
                if(ac.getAccountNumber().equals(model.getAccountNumber())) {
                    return ac.getBalance();
                }
            }
        }
        catch (Exception e){
            System.out.println("Something went wrong, please try again later.");
        }
        return 0.0;
    }

    public String withdraw(double amount, LoginModel model) {
        try{
            for(ACCreationModel accountModel : commonClass.allaccountList) {
                if(accountModel.getAccountNumber().equals(model.getAccountNumber())) {
                    if (accountModel.getBalance() < amount) {
                        return "Insufficient funds. Your current balance is " + accountModel.getBalance();
                    }
                    accountModel.setBalance(accountModel.getBalance() - amount);
                    return "Successfully withdrew ₹" + amount + ". Remaining balance: ₹" + accountModel.getBalance();
                }
            }
        }
        catch (Exception e){
            System.out.println("Something went wrong, please try again later.");
        }
        return "Something went wrong, please try again later.";
    }

    public String deposit(double amount, LoginModel model) {
        try{
            for(ACCreationModel accountModel : commonClass.allaccountList) {
                if(accountModel.getAccountNumber().equals(model.getAccountNumber())) {
                    accountModel.setBalance(accountModel.getBalance() + amount);
                    return "Successfully deposited ₹" + amount + ". Remaining balance: ₹" + accountModel.getBalance();
                }
            }
        }
        catch (Exception e){
            System.out.println("Something went wrong, please try again later.");
        }
        return "Something went wrong, please try again later.";
    }
}
