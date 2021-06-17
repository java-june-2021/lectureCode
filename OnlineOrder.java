public class OnlineOrder extends Order {
    
    public OnlineOrder(int id, int order, String name){
        super(id, order, name);
    }

    public void cancel() {
        System.out.println("Your order has been cancelled Online! Thank you! Come again.");
    }

}
