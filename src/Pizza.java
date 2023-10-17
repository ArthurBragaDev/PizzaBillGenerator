public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;

    private int backPackPrice = 20;



    public Pizza( Boolean veg){
        this.veg = veg;
        if (this.veg){
            System.out.println("Veg pizza");
            this.price = 300;
        }else {
            System.out.println("Normal pizza");
            this.price = 400;
        }
    }

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        System.out.println("Extra cheese added");
        this.price += extraCheesePrice;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        System.out.println("Extra toppings added");
        this.price += extraToppingsPrice;
    }

    public void takeAway(){
        isOptedForTakeAway = true;
        System.out.println("Take away opted\n");
        this.price += backPackPrice;
    }

    public void getBill(){

        if(isExtraCheeseAdded){
            System.out.println("\nExtra cheese: " + this.extraCheesePrice);
        }
        if(isExtraToppingsAdded){
            System.out.println("Extra Toppings: " + this.extraToppingsPrice);
        }
        if(isOptedForTakeAway){
            System.out.println("Backpack: " + this.backPackPrice);
        }
        System.out.println("\nBill: " + price);
    }

}
