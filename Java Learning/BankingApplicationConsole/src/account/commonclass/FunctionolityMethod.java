package account.commonclass;

import account.model.ACCreationModel;

import java.util.List;

public class FunctionolityMethod {
    private final CommonClass commonClass = new CommonClass();
    public int accountSize() {
        return commonClass.allaccountList.size();
    }
    public String generateAccountNumber() {
        int randomDigits = (int)(Math.random() * 9000) + 1000; // range: 1000–9999
        return "AC" + randomDigits;
    }
    public List<ACCreationModel> getAccountList() {
        return commonClass.allaccountList;
    }
}
