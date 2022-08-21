package base;

public class SavingsAccountImpl {
    public static void main(String[] args) {
        SavingsAccount savingsAccount=new SavingsAccount(123456789012L,"01-01-2022","Online",true,100.0,100.0,7.5);
        RecurringDepositAccount recurringDepositAccount=new RecurringDepositAccount(123456789012L,"01-01-2022","Online",true,100.0,100.0,7.5,"01-01-2023",1.0);

        savingsAccount.display();
        recurringDepositAccount.display();
    }
}
