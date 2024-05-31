package model.entities;

public abstract class Account {

    private static final int DEFAULT_AGENCY = 1;
    private static int ACCOUNT_SEQUENCE = 1;

    protected Client client;
    protected int agency;
    protected int number;
    protected double balance = 0d;

    public Account(Client client) {
        this.client = client;
        this.agency = DEFAULT_AGENCY;
        this.number = ACCOUNT_SEQUENCE++;
        Bank.addAccount(this);
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
        if (value > balance)
            throw new BankException("Insufficient balance!");
        else
            balance -= value;
    }

    public void transfer(double value, Account target) {
        if (target == null)
            throw new BankException("Is necessary to add target account to transfer!");
        else {
            this.withdraw(value);
            target.deposit(value);
        }
    }

    public void getAccountHolderInfo() {
        System.out.println("Account " + number + " Holder Complete Info:" +
                "\n" + client + "\n");
    }

    public void printBankStatement() {
        System.out.println("Holder: " + client.getName() +
                "\nAgency: " + agency +
                "\nNumber: " + number +
                "\nBalance: " + balance + "\n");
    }
}
