package corejava.oop;

class BankAccount{
    private int balance;
    public void deposit(int amount){
        if(amount > 0){
            balance = balance + amount;
        }
    }
    int getBalance(){
        return balance;
    }

}
public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(100);
        System.out.println(bankAccount.getBalance());
    }
}
