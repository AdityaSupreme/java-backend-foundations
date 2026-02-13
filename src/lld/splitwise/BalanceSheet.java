package lld.splitwise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BalanceSheet {
    public Map<User, Map<User, Double>> balanceSheet = new HashMap<>() ;
    public BalanceSheet() {
        this.balanceSheet = new HashMap<User, Map<User, Double>>();
    }
    public void addExpense(Expense expense){
        User paidBy = expense.getUser();
        double amount = expense.getAmount();
        List<User> participants = expense.getParticipants();
        int totalParticipants = participants.size();
        double sharedAmount = amount/totalParticipants;
        for(User participant: participants){
            if(participant.equals(paidBy)){
                continue;
            }
            updateBalance(paidBy, participant, sharedAmount);
            updateBalance(participant, paidBy, -sharedAmount);

        }
    }

    public void updateBalance(User from, User to, double amount){
        balanceSheet.putIfAbsent(from, new HashMap<>());
        balanceSheet.putIfAbsent(to, new HashMap<>());

        Map<User, Double> balanceFrom = balanceSheet.get(from);
        Map<User, Double> balanceTo = balanceSheet.get(to);

        balanceFrom.put(to,balanceFrom.getOrDefault(to,0.0)+amount);
        balanceTo.put(from,balanceTo.getOrDefault(from,0.0)-amount);
    }

    public void printBalanceSheet(){
        System.out.println("Balance Sheet");
        for (User user : balanceSheet.keySet()){
            for(Map.Entry<User, Double> entry: balanceSheet.get(user).entrySet()){
                if (entry.getValue() > 0) {
                    System.out.println(entry.getKey().getUsername() + " owes " +
                            user.getUsername() + " : " + entry.getValue());
                }
            }
        }

    }

}
