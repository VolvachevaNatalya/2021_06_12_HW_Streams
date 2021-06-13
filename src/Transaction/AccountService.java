package Transaction;

import Employee.Department;

import java.util.List;

public class AccountService {
    public long getSumAllCancelledTransactions(List<Account> accounts) {
        return accounts.stream()
                .filter(account -> account.getBalance()>0)
                .flatMap(account -> account.getTransactions().stream())
                .filter(transaction -> transaction.getState()==State.FINISHED)
                .mapToLong(Transaction::getSum)
                .reduce(0, (long x, long y) -> x+y);
    }
}
