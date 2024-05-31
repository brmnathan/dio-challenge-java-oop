package application;

import model.entities.*;

public class Program {
    public static void main(String[] args) {
        // Creating a bank instance
        Bank bank = new Bank();
        // Instantiating clients
        Client client1 = new Client("João Silva", "12345678901", "Rua A, Salvador, BA");
        Client client2 = new Client("Júlia Santos","98765432102", "Rua B, Belo Horizonte, MG");
        // Instantiating accounts for the clients
        Account acc1 = new CheckingAccount(client1);
        Account acc2 = new SavingsAccount(client1);
        Account acc3 = new SavingsAccount(client2);

        // Depositing and transferring funds
        acc1.deposit(500);
        acc1.transfer(200, acc2);
        // Getting account holder info
        acc1.getAccountHolderInfo();
        acc3.getAccountHolderInfo();
        // Printing bank statements
        acc1.printBankStatement();
        acc2.printBankStatement();
        acc3.printBankStatement();
        // Printing the list of accounts in the bank
        bank.printAccountList();
    }
}
