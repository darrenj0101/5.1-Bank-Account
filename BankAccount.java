
public class BankAccount {
    static int nextAccountNumber = 100000;
    String customerName;
    int accountNumber;
    static double balance = 5000;
    double deposit;
    double withdrawal;

    public BankAccount(String varCustomerName) {
        nextAccountNumber++;
        customerName = varCustomerName;
    }

}
