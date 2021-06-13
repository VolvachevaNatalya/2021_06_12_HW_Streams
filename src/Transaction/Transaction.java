package Transaction;

import java.util.Date;

public class Transaction {
    private String uuid;
    private State state;
    private long sum;
    private long created;

    public Transaction(String uuid, State state, long sum) {
        this.uuid = uuid;
        this.state = state;
        this.sum = sum;
        this.created = System.currentTimeMillis();
    }

    public String getUuid() {
        return uuid;
    }

    public State getState() {
        return state;
    }

    public long getSum() {
        return sum;
    }

    public long getCreated() {
        return created;
    }
}
