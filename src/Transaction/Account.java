package Transaction;

import java.util.Date;
import java.util.List;

public class Account {
    String number;
    Long balance;
    List<Transaction> transactions;

    public Account(String number, Long balance, List<Transaction> transactions) {
        this.number = number;
        this.balance = balance;
        this.transactions = transactions;
    }

    public String getNumber() {
        return number;
    }

    public Long getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
