package model.entities;

public class Client {
    private String name;
    private final String cpf;
    private String address;

    public Client(String name, String cpf, String address) {
        this.name = name;
        this.cpf = cpf;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String cpfFormatter(String cpf) {
        //Remove non-numeric characters from the CPF
        cpf = cpf.replaceAll("[^0-9]", "");
        //Check if the CPF has 11 digits
        if (cpf.length() != 11) {
            throw new IllegalArgumentException("CPF must contain 11 digits!");
        }
        //Format the CPF in the pattern xxx.xxx.xxx-xx
        return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);
    }

    @Override
    public String toString() {
        return "Name: " + name
                + ", CPF: " + cpfFormatter(cpf)
                + ", Address: " + address;
    }
}
