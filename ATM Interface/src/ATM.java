import java.util.Scanner;

class BankAccount {
    protected double balance;
}

public class ATM extends BankAccount 
{
    Scanner S = new Scanner(System.in);

    void withdraw(double amount)
     {
        if (amount < balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn successfully!!!!");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited Successfully!!!");
        }
        else
        {
            System.out.println("Invalid amount");
        }
    }

    void checkBalance() {
        System.out.println("Your Balance is " + balance);
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        ATM A = new ATM();
        int choice;
        do {
            System.out.println("\n*****************ATM options***************");
            System.out.println("1.Withdraw \n2.Deposite \n3.Check Blance \n4.exit");
            System.out.println("\nEnter Choice");
            choice = Sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Amount to Withdraw:");
                    double amount_withdraw = Sc.nextDouble();
                    A.withdraw(amount_withdraw);
                    break;

                case 2:
                    System.out.println("Enter the Amount to Deposit:");
                    double amount_deposit = Sc.nextDouble();
                    A.deposit(amount_deposit);
                    break;

                case 3:
                    A.checkBalance();
                    break;

                case 4:
                    System.exit(1);

                default:
                    System.out.println("Wrong choice!!!!!!!!");
            }

        } while (choice != 4);
    }
}
