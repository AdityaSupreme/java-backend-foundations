package lld.splitwise;

import java.util.ArrayList;
import java.util.List;

public class Group {
    List<User> users;
    String groupName;
    List<Expense> expenses;
    BalanceSheet balanceSheet;
    public Group(List<User> users, String groupName) {
        this.users = users;
        this.groupName = groupName;
        this.expenses = new ArrayList<>();
        this.balanceSheet = new BalanceSheet();
    }
    public void addExpense(Expense expense) {
    expenses.add(expense);
    balanceSheet.addExpense(expense);
    }
    public void showBalance(){
        balanceSheet.printBalanceSheet();
    }

}
