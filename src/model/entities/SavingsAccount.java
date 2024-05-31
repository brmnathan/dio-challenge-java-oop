package model.entities;

public class SavingsAccount extends Account{

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void printBankStatement() {
        System.out.println("Savings Account Statement");
        super.printBankStatement();
    }
}
