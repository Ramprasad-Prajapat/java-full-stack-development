package PizzaBill;

public class main
{
    public static void main(String[] args) {
        pizza basePizza =new pizza(true);
//        basePizza.getPizzaPrice();
//        basePizza.addExtraCheese();
//        basePizza.addExtraToppings();
//        basePizza.takeAway();
//        basePizza.getBill();

        DeluxPizza dp = new DeluxPizza(true);
//        dp.addExtraCheese();
//        dp.addExtraToppings();
        dp.takeAway();
        dp.getBill();
    }
}
