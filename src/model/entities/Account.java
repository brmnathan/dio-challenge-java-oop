package model.entities;

public abstract class Account {

    private static final int DEFAULT_AGENCY = 1;
    private static int ACCOUNT_SEQUENCE = 1;

    protected Client client;
    protected int agency;
    protected int number;
    protected double balance = 0;

    public Account(Client client, int agency, int number) {
        this.client = client;
        this.agency = DEFAULT_AGENCY;
        this.number = ACCOUNT_SEQUENCE++;
    }

    public Client getClient() {
        return client;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        balance += value;
    }

    public void withdraw(double value) {
        balance -= value;
    }

    public void transfer(double value, Account target) {
        this.withdraw(value);
        target.deposit(value);
    }

    @Override
    public String toString() {
        return "Holder: " + client.getName() +
                "\nAgency: " + agency +
                "\nNumber: " + number +
                "\nBalance: " + balance;
    }
}
