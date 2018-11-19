package BankClient;
import BankLibrary.*;

import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        try {
            Account account = new SavingsAccount("Mohan",
                    "Kodumudi",
                    "9786986611",
                    "567729590807",
                    501,
                    "CNZ896586",
                    500);
            account.display();
//            Account account1 = new SavingsAccount("Gowtham", "Arachalur", "7413698521", "6985325698741", 0, "CNZ3652", 500);
//            Account account1 = new SavingsAccount("Mohan",
//                    "Kodumudi",
//                    "9786986611",
//                    "567729590807",
//                    0,
//                    "CNZ896586",
//                    500);
//            account1.display();
            account.deposit(200);
            account.deposit(300);
            account.withdraw(500);

            ((SavingsAccount) account).hi();
            ((SavingsAccount) account).hii("Welcome");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}