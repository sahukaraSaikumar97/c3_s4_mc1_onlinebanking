package base;

public class SavingsAccountImpl {
    public static void main(String[] args) {
        SavingsAccount savingsAccount=new SavingsAccount(BankAccount.accNumberGen(),"01-01-2022","Online",
                true,100.0,100.0,7.5);
        RecurringDepositAccount recurringDepositAccount=new RecurringDepositAccount(BankAccount.accNumberGen(),"01-01-2022","Online",true,100.0,
                100.0,7.5,"01-01-2023",12);

        savingsAccount.display();
        System.out.println("savingsAccount Balance after deposit =" + savingsAccount.deposit(1000));
        System.out.println("savingsAccount balance after withdrawl =" + savingsAccount.withdraw(500));
        System.out.println("savings AccountBalance() = " + savingsAccount.showAccountBalance());
        System.out.println("--------------------------------------------------------------------------------------------");
        recurringDepositAccount.display();
    }
}
