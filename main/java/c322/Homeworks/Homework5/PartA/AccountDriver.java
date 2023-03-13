package c322.Homeworks.Homework5.PartA;

public class AccountDriver {
    public static void main(String[] args) {
        System.out.println("\n\nBank Account Number Generation System");

        CreateBankAccount account1 = CreateBankAccount.getNewAccount();
        CreateBankAccount account2 = CreateBankAccount.getNewAccount();
    }
}
class CreateBankAccount {
    private static CreateBankAccount instance = null;
    private static boolean accountOpened = false;

    private CreateBankAccount() {
    }

    public static CreateBankAccount getNewAccount() {
        if (instance == null) {
            instance = new CreateBankAccount();
            accountOpened = true;
            System.out.println("New Account Created");
        } else {
            System.out.println("Account Already Opened");
        }
        return instance;
    }
}