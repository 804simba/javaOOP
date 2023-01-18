package TON;

import java.util.ArrayList;

public class Client {
    private int id;
    private String name;
    private String phone;
    private ArrayList<Account> accounts;

    public Client(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;

        accounts = new ArrayList<>();
    }

    public boolean addAccount(Account account) {
        accounts.add(account);
        return true;
    }

    public boolean removeAccount(int accountId) {
        for (Account account : accounts)
            if (account.getId() == accountId) {
                accounts.remove(account);
                return true;
            }
        return false;
    }

    public String toString() {
        String info = this.id + " " + this.name + " " + this.phone + "\n";

//      Concatenating a string and an ArrayList returns an arrayList containing that string
//      Java automatically calls the toString() method of an object whenever we are trying to print out that object.

        info += accounts;
        return info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
