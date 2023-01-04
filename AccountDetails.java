import java.util.Scanner;

public class AccountDetails {
    public static void main(String[] args) {
        BankAccount BankOne = new BankAccount("John Smith");

        Scanner var_scanner = new Scanner(System.in);

        System.out.println("Please Enter the deposit amount?");
        double deposit = var_scanner.nextDouble();

        System.out.println("Please Enter the withdrawal amount?");
        double withdrawal = var_scanner.nextDouble();

        if (withdrawal > BankOne.balance)
            ;
        {
            System.out.println(
                    "You cannnot withdraw this amount as there are insufficient funds in your account. Your withdrawal has been refused");
        }

        withdrawal = 0;

        System.out.println("The total balance for " + BankOne.customerName + " with account number "
                + BankOne.nextAccountNumber + " is "
                + (BankOne.balance - withdrawal + deposit));

    }

}
