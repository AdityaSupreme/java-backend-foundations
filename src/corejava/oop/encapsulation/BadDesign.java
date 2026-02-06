package corejava.oop.encapsulation;

class BankAccount{
    int balance;
    public void deposit(int amount){
        if(amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        balance = balance + amount;
    }
    public int getBalance(){
        return balance;
    }
}
public class BadDesign {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(5000);
        System.out.println(bankAccount.getBalance());
    }
}
