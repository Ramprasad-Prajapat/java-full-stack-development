package PizzaBill;

public class pizza
{
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingPrice = 150;
    private int backPack = 20;
    private int basePizzaPirce;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isExtraTakeAwayAdded= false;


    public pizza(Boolean veg){
        this.veg = veg;
        if(this.veg ){
            this.price = 300;
        }
        else {
            this.price = 400;
        }
        basePizzaPirce = this.price;
    }
//    public void  getPizzaPrice (){
//        System.out.println(this.price);
//    }
    // checking a method working

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
//        System.out.println("Extra cheese added.");
        this.price += extraCheesePrice;
    }
    public  void addExtraToppings(){
        isExtraToppingAdded = true;
//        System.out.println("Extra topping added ");
        this.price += extraToppingPrice;

    }
    public void takeAway(){
        isExtraTakeAwayAdded = true;
//        System.out.println("Take away opted");
        this.price += backPack;

    }
    public void getBill(){
//        System.out.println(this.price);
        String bill = "";
        System.out.println("pizza:"+ basePizzaPirce);

        if(isExtraCheeseAdded){
            bill += "Extra cheese added: "+extraCheesePrice+"\n";
        }
        if(isExtraToppingAdded){
            bill += "Extra Topping added: "+extraToppingPrice+"\n";
        }
        if(isExtraTakeAwayAdded){
            bill += "Take Away: "+ backPack+"\n";
        }
        bill += "Bill : "+ this.price + "\n";
        System.out.println(bill);


    }
}
