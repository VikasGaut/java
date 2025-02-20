package maruti;
import java.util.Scanner;

class ATM{
    int balance = 500;
    final int pin=12345;
    Scanner s= new Scanner(System.in);
      ATM(){
        System.out.print("Enter your pin : ");
        int a=s.nextInt();

        if(a==pin){
            menu();
        }
        else{
            System.out.println("Invalid  pin \n  try again");
        }
    }
    public void menu(){
        System.out.println("1 : Check Balance");
        System.out.println("2 : Withdraw Money");
        System.out.println("3 : Deposit Money");
        System.out.println("4 : Exit");
        System.out.print("Enter your choice : ");
        int b=s.nextInt();
        if(b==1){
            checkBalance();
        } else if(b==2){
            withdrawMoney();
        }
        else if(b==3){
            depositMoney();
        }
        else if(b==4){
            return;
        }
        else{
            System.out.println("invalid choice");
        }
    }
    public void checkBalance(){
        System.out.println("Current balance :"+balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.print("Enter the amount you want to withdraw :");
        int amount=s.nextInt();
        if(amount>balance){
            System.out.println("Insufficient balance in your account");
        }
        else{
            balance=balance-amount;
            System.out.println("Money withdrawl successful");
        }
        menu();
    }
    public void depositMoney(){
        System.out.print("Enter the amount you want to deposit :");
        int amount = s.nextInt();
        balance=balance+amount;
        System.out.println("Money deposit successful");
        menu();
    }
}

public class anu{
    public static void main(String[] args) {
        ATM obj=new ATM();
    }
}