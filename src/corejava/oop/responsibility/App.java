package corejava.oop.responsibility;

public class App {
    public static void main(String[] args){
        Order order = new Order(100);
        order.setAmount(200);
        System.out.println("Order Amount" + order.getAmount());
        System.out.println("Order Price" + order.getPrice());
        OrderHistory orderHistory = new OrderHistory();
        orderHistory.save(order);
        PricingService pricingService = new PricingService();
        pricingService.calculatePrice(order);
        NotificationService notificationService = new NotificationService();
        notificationService.sendEmail(order);
    }
}
