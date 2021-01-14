package ru.job4j.bank;

import java.util.*;

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findPassport(passport);
        List<Account> accounts = users.get(user);
        if (!accounts.contains(account)) {
            accounts.add(account);
        }
    }

    public User findPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findPassport(passport);
        Optional<List<Account>> accounts = Optional.ofNullable(users.get(user));
        if (accounts.isPresent()) {
            for (Account account : accounts.get()) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String descPassport,
                                 String descRequisite, double amount) {

        Account userAccount = findByRequisite(srcPassport, srcRequisite);
        Account anotherUserAccount = findByRequisite(descPassport, descRequisite);
        boolean result = false;

        if (userAccount.getRequisite().contains(srcRequisite) && userAccount.getBalance() > 0) {
            userAccount.setBalance(userAccount.getBalance() - amount);
            anotherUserAccount.setBalance(anotherUserAccount.getBalance() + amount);
            result = true;
        }

        return result;
    }
}
