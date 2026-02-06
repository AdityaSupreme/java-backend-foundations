package corejava.oop.responsibility;

public class Order {
    public int price;
    public int amount;
    public Order(int price){
        this.price = price;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public int getAmount(){
        return amount;
    }
    public int getPrice(){
        return price;
    }

}
