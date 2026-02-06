package corejava.oop.responsibility;

public class PricingService {

    public int calculatePrice (Order order) {
        return order.getAmount();
    }

}
