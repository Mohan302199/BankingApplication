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
                    2000,
                    "CNZ896586",
                    500);
//            account.display();
            Account account1 = new SavingsAccount("Gowtham",
                    "Arachalur",
                    "7413698563",
                    "326598756325",
                    100,
                    "CNZ896586",
                    500);
//            account1.display();

            account.fundTransfer(account, account1, 0);

            account.display();
            account1.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}