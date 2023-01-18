package TON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();

        Account account1 = new Account(1, 20000, 0.23, new Client(100, "Timothy", "08176124356"));
        Account account2 = new Account(2, 1200, 0.23, new Client(200, "Yu", "08122334455"));
        Account account3 = new Account(3, 5000, 0.23, new Client(300, "Terry", "08190172343"));
        Account account4 = new Account(4, 30200, 0.23, new Client(400, "Larry", "07030546673"));

        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);

        for (Account account : accounts)
            System.out.println(account);
    }
}