package lld.splitwise;

import java.util.List;

public class Expense {

    User user;
    List<User> participants;
    double amount;
    String expenseName;
    Expense(User user, List<User> participants, double amount, String expenseName) {
        this.user = user;
        this.participants = participants;
        this.amount = amount;
        this.expenseName = expenseName;
    }

    public User getUser() {
        return user;
    }
    public List<User> getParticipants() {
        return participants;
    }
    public double getAmount() {
        return amount;
    }
    public String getExpenseName() {
        return expenseName;
    }
}
