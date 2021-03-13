import java.util.*;
import java.io.*;

public  class banking 
{
   public static void main(String[] args) {
      Bank obj1 = new Bank();
      obj1.dispalyMenu();
   }

}

class Bank {
   int balance;
   int previousTransaction;
   String customerName;
   String customerId;
   String st;
   char choice;
   Scanner sc = new Scanner(System.in);
   Scanner scr = new Scanner(System.in);

   // clear screen
   void cls() {
      try {
         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      } catch (Exception e) {
         System.out.println(e);
      }
   }


   // constuctor
   Bank() {
      balance = 0;
      choice = '\u0000';
      customerId = "";
      customerName = "";
   }

   // *deposit
   void deposit(int amount) {
      balance += amount;
      if (amount != 0)
         previousTransaction = amount;
   }

   void withdraw(int amount) {
      if ((balance - amount) >= 500)
         balance -= amount;
      else
         System.out.println("\t\t\tYOUR BALANCE IN THE ACCOUNT IS LOW FOR TRANSACTION.");
      if (amount != 0)
         previousTransaction = -amount;
   }

   void line() {
      System.out.println(
            "_____________________________________________________________________________________________________________________________");
   }

   void input() {
      System.out.println("enter the your name");
      customerName = sc.nextLine();
      System.out.println("enter the your id");
      customerId = sc.nextLine();
   }

   void getPreviousTransaction() {
      if (previousTransaction > 0)
         System.out.println("DEPOSITED=" + previousTransaction);
      else if (previousTransaction < 0)
         System.out.println("WITHDRAWN=" + Math.abs(previousTransaction));
      else
         System.out.println("NO transaction took place");
   }

   void dispalyMenu() {
      cls();
      input();
      do {
         cls();
         System.out.println("WELCOME, " + customerName);
         System.out.println("your id no. is : " + customerId);
         line();
         System.out.println("PLEASE CHOOSE ANT ONE OPTION FROM BELOW");
         line();
         System.out.println("1. Check Balance");
         System.out.println("2. Deposit");
         System.out.println("3. Withdraw");
         System.out.println("4. Previous transaction");
         System.out.println("5. Exit");
         line();
         System.out.print(" ENTER THE OPTION FROM ABOVE:");
         choice = sc.nextLine().charAt(0);
         line();

         switch (choice) {
            case '1':
               System.out.println("\nBANK BALANCE:" + balance);
               System.out.println("\n\n\t\t\tPRESS ENTER TO CONTINUE");
               st = sc.nextLine();
               break;
            case '2':
               System.out.print("\nENTER THE AMOUNT TO BE DEPOSITED:--");
               deposit(sc.nextInt());
               st = sc.nextLine();
               System.out.println("\n\n\t\t\tYOUR AMOUNT IS SUCESSFULLY DEPOSITED");
               st = sc.nextLine();
               break;
            case '3':
               System.out.print("\nENTER THE AMOUNT TO BE WITHDRAWN:--");
               withdraw(sc.nextInt());
               st = sc.nextLine();
               System.out.println("\n\n\t\t\tWITHDRAWN SUCESSFULLY");
               st = sc.nextLine();
               break;
            case '4':
               getPreviousTransaction();
               System.out.println("\n\n\t\t\tPRESS ENTER TO CONTINUE");
               st = sc.nextLine();
               break;
            case '5':
               System.out.println("-------------------------------------********************************----------------------------------------");
               break;
            default:
               System.out.println("\nSEE CAREFULLY AND CHOOSE THE OPTION FROM THE ABOVE OPTION ONLY");
               System.out.println("\n\n\t\t\tPRESS ENTER TO CONTINUE");
               st = sc.nextLine();
               break;

         }

      } while (choice != '5');
      System.out.println("\n\n\n\t\t\t\t\tTHANK YOU USING YOUR SERVICES.");
   }
}
