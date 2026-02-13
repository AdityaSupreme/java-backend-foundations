package lld.splitwise;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        User user1 = new User("aditya", "1");
        User user2 = new User("akshada", "2");
//        User user3 = new User("rahul", "3");

        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
//        users.add(user3);

        List<User> usersUsOnly = new ArrayList<>();
        usersUsOnly.add(user1);
        usersUsOnly.add(user2);
        Group group1 = new Group(users,"Daily Expenses");
        group1.addExpense(new Expense(user1,users,200,"Milk"));
        group1.addExpense(new Expense(user2,users,300,"Electricity"));
//        group1.addExpense(new Expense(user1,usersUsOnly,400,"Rent"));

        group1.showBalance();
    }
}
