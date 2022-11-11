package Decorator;

public class CaramelDecorator extends AddOnDecorator{
    private Beverage beverage;

    public CaramelDecorator(Beverage b) {
        this.beverage = b; //add on to the beverage passed through
    }

    public int cost() {
        System.out.println("Added caramel :)");
        return this.beverage.cost()+2;
    }
    
}

/* therefore caramel decorator is a beverage */
/* and it also has a beverage */