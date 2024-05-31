package model.entities;

public class CheckingAccount extends Account{

    public CheckingAccount(Client client) {
        super(client);
    }

    public void printBankStatement() {
        System.out.println("Checking Account Statement: ");
        System.out.println(super.toString());
    }
}
