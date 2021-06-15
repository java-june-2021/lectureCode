import java.util.Arrays;
public class PizzaTester{
    public static void main(String[] args) {
        Pizza.advertise();
        Pizza cheesePizza = new Pizza("Cheese Pizza", new String[] {"cheese"}, 'L', 10, "Mozarella");
        // cheesePizza.name = "Cheese Pizza";
        // String[] topping = {"cheese"};
        // cheesePizza.toppings = topping;
        // cheesePizza.size = 'L';
        // cheesePizza.sauce = "Tomato";
        // cheesePizza.cheeseType = "Mozarella";

        Pizza chickenCurry = new Pizza ("Curry Chicken", new String[] {"Chicken", "Spices", "Olives"});

        System.out.println(chickenCurry.getSlices());
        cheesePizza.pizzaFight(chickenCurry);
        
        System.out.println(chickenCurry.getSlices());
}
}