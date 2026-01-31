package bankingApplication;

import java.util.Scanner;

public class bankApp
{
    public static void main(String[] args) {
        BankAccount b = new BankAccount("xyz","Ba001");
        b.showMenu();
    }

}
class BankAccount
{
    int balance;
    int preivousTrancaction;
    String customerName;
    String customerId;


    BankAccount(String cname, String cid){
        customerName = cname;
        customerId = cid;
    }
    void deposit(int amount)
    {
        if(amount != 0){
            balance += amount;
            preivousTrancaction = amount;
        }
    }
    void withdraw(int amount){
        if(amount != 0){
            balance = balance - amount;
            preivousTrancaction =- amount;
        }
    }
    void getPreviousTransaction(){
        if(preivousTrancaction > 0)
        {
            System.out.println("Deposited: "+ preivousTrancaction);
        }
        else if(preivousTrancaction < 0){
            System.out.println("Withdrawn : "+ Math.abs(preivousTrancaction));
        }
        else {
            System.out.println("No transaction occured");
        }
    }
    void showMenu(){
        char option = '\0';
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome "+ customerName);
        System.out.println("Your ID "+ customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous trancaction");
        System.out.println("E. Exit");

        do{
            System.out.println(" ============= ");
            System.out.println("Enter an option: ");
            System.out.println(" ============= ");
            option = sc.next().charAt(0);
            System.out.println("\n");

            switch (option){
                case 'A':
                    System.out.println("-----------");
                    System.out.println("Balance = "+ balance);
                    System.out.println(("------------"));
                    break;

                case 'B':
                    System.out.println("----------");
                    System.out.println("Enter an amount to deposit");
                    System.out.println("------------");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("-----------");
                    System.out.println("Enter an amount to deposit");
                    System.out.println("--------");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("--------");
                    getPreviousTransaction();
                    System.out.println("-------");
                    break;
                case 'E':
                    System.out.println("**************");
                    break;
//                    System.out.println("End");
//                    System.exit(1);
                default:
                    System.out.println("Invalid ");

            }
        }while(option != 'E');
        System.out.println("Thank you");

    }
}
