package account.accountImplementation;

import account.commonclass.FunctionolityMethod;
import account.model.ACCreationModel;
import account.model.LoginModel;

import java.util.Scanner;


public class AccountModel {
   static Scanner scanner = new Scanner(System.in);
   final AccountImplementation registerAccountImplementation = new AccountImplementation();
   final FunctionolityMethod commonFunctionolity = new FunctionolityMethod();
     public String registerAccount() {
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your Email Id: ");
        String emailId = scanner.nextLine();
        System.out.println("Enter Your Phone Number: " );
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter your Address: ");
        String address = scanner.nextLine();
        System.out.println("Enter Deposit Amount(minimum balance should be 500.0) : ");
        double initialDeposit = scanner.nextDouble();
        scanner.nextLine();
        String accountNumber = commonFunctionolity.generateAccountNumber();

        if(initialDeposit < 500.0){
            return "Invalid Deposit Amount, It requires a 500 minimum balance.";
        }
        ACCreationModel model = new ACCreationModel(name, emailId, phoneNumber, address, accountNumber, initialDeposit);
        return registerAccountImplementation.registerAccount(model);
    }

    public String loginAccount() {
        System.out.println("Enter Your Name:");
        String name = scanner.nextLine();

        System.out.println("Enter your Email Id:");
        String emailId = scanner.nextLine();

        System.out.println("Enter your Account Number:");
        String accountNumber = scanner.nextLine();

        LoginModel modelData = new LoginModel();
        modelData.setName(name);
        modelData.setAccountNumber(accountNumber);
        modelData.setEmilId(emailId);
        String login = registerAccountImplementation.loginAccount(modelData);

        if (login.equals("Account successfully logged in!")) {
            System.out.println(modelData.getAccountNumber());
            accountAccess(modelData);
        }
        return login;
    }
    private void accountAccess(LoginModel model) {
        while (true) {
            try {
                System.out.println("------------Welcome to the kamlesh account management!--------");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        double balanceAmount = registerAccountImplementation.getBalance(model);
                        System.out.println("Your balance is " + balanceAmount);
                        break;
                    case 2:
                        System.out.println("Enter your amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println(registerAccountImplementation.withdraw(withdrawAmount, model));
                        break;
                    case 3:
                        System.out.println("Enter your amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println(registerAccountImplementation.deposit(depositAmount, model));
                        break;
                    case 4:
                        System.out.println("Thank you! Exiting...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please choose 1, 2, or 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number (1, 2, 3 or 4).");
            } catch (Exception e) {
                System.out.println("Something went wrong: " + e.getMessage());
            }
        }
    }

}
