package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private static final String BANK_NAME = "NewBank";

    private static List<Account> accountList;

    public Bank() {
        accountList = new ArrayList<>();
    }

    String getName() {
        return BANK_NAME;
    }

    public static void addAccount(Account account) {
        accountList.add(account);
    }

    public void printAccountList() {
        System.out.println("Accounts in " + BANK_NAME + ":");
        for (Account account : accountList) {
            System.out.println("Account Holder: " + account.getClient().getName() +
                    ", Account Number: " + account.getNumber());
        }
    }
}

