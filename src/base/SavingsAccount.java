package base;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(long accountNumber, String accountOpeningDate,
                          String modeOfOperation, boolean internetBanking, double totalBalance, double avilableBalance, double rateOfIntrest) {
        super(accountNumber, accountOpeningDate, modeOfOperation, internetBanking, totalBalance, avilableBalance, rateOfIntrest);
    }
    public double deposit(int depositAmount){
        double response;
        response = getAvilableBalance()+depositAmount;
        setAvilableBalance(response);
        return getAvilableBalance();
    }

    public double withdraw(double withdrawAmount){

        if(getAvilableBalance() > withdrawAmount){
            double response = getAvilableBalance()-withdrawAmount;
            setAvilableBalance(response);
        }
        else {
            System.out.println(" Insufficient Available balance in your account");
        }
        return getAvilableBalance();
    }


    public void display(){
        System.out.println(" Details of Savings Account ");
        System.out.println("Avialble Balance = "+getAvilableBalance());
        System.out.println("Account Number = "+getAccountNumber());
        System.out.println("Account Opening Date = "+getAccountOpeningDate());
        System.out.println("Opening Balance = "+getTotalBalance());
        System.out.println("Mode Of Operation = "+getModeOfOperation());
        System.out.println("isInternetBanking = " + isInternetBanking());


    }

}
