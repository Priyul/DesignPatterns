package Decorator;

public class SoyDecorator extends Beverage {
    private Beverage beverage;

    public SoyDecorator(Beverage b) {
        this.beverage = b; //add on to the beverage passed through
    }

    public int cost() {
        System.out.println("Added soy :)");
        return this.beverage.cost()+2;
    }    
}


/* therefore soy decorator is a beverage */
/* and it also has a beverage */