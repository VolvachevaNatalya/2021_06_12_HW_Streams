package Transaction;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Transaction transaction1 = new Transaction("111", State.CANCELLED, 4400);
        Transaction transaction2 = new Transaction("112", State.FINISHED, 7000);
        Transaction transaction3 = new Transaction("113", State.PROCESSING, 12000);
        Transaction transaction4 = new Transaction("114", State.CANCELLED, 6500);
        Transaction transaction5 = new Transaction("115", State.FINISHED, 2800);
        Transaction transaction6 = new Transaction("116", State.PROCESSING, 11600);

        List<Transaction> transactionList1 = Arrays.asList(transaction1, transaction2, transaction3);
        List<Transaction> transactionList2 = Arrays.asList(transaction4, transaction5, transaction6);
        Account account1 = new Account("1", 2900L, transactionList1);
        Account account2 = new Account("2", 3300L, transactionList2);

        List<Account> accounts = Arrays.asList(account1,account2);

        AccountService accountService = new AccountService();
        System.out.println(accountService.getSumAllCancelledTransactions(accounts));

    }
}


