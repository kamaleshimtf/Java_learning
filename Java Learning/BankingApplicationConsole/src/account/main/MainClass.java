package account.main;

import account.accountImplementation.AccountModel;

import java.util.Scanner;

public class MainClass {
    public static Scanner scanner = new Scanner(System.in);
    static final AccountModel accountModel = new AccountModel();
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("\n---------- Welcome to Kamlesh Bank ----------");
                System.out.println("1. Create Account");
                System.out.println("2. Login Account");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = 0;
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println(accountModel.registerAccount());
                        break;
                    case 2:
                        System.out.println(accountModel.loginAccount());
                        break;
                    case 3:
                        System.out.println("Thank you! Exiting...");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose 1, 2, or 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number (1, 2, or 3).");
            } catch (Exception e) {
                System.out.println("Something went wrong: " + e.getMessage());
            }
        }
    }
}






//         final AccountDetails accountDetails = new Account();
//
//         ACCreationModel acCreationModel = new ACCreationModel(
//                                     "Kamlesh G",
//                                     "kamalesh2002@gmail.com",
//                                     "123456790",
//                                    "AC123");
//
//        System.out.println(accountDetails.accountCreation(acCreationModel));
//
//        System.out.println(accountDetails.getAllCustomerDetails());