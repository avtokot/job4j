package ru.job4j.bank;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNull;

public class BankServiceTest {
    User user;
    BankService bank;

    @Before
    public void before() {
        user = new User("3434", "Petr");
        bank = new BankService();
        bank.addUser(user);
    }

    @Test
    public void addUser() {
        assertThat(bank.findPassport("3434"), is(user));
    }

    @Test
    public void whenEnterInvalidPassport() {
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertNull(bank.findByRequisite("34", "5546"));
    }

    @Test
    public void addAccount() {
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("3434", "5546").getBalance(), is(150D));
    }

    @Test
    public void transferMoney() {
        bank.addAccount(user.getPassport(), new Account("3333", 150D));
        bank.addAccount(user.getPassport(), new Account("4444", 50D));
        bank.transferMoney(user.getPassport(), "3333", user.getPassport(), "4444", 150D);
        assertThat(bank.findByRequisite(user.getPassport(), "4444").getBalance(), is(200D));
    }
}
