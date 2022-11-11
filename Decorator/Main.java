package Decorator;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Espresso();
        Beverage decaf = new Decaf();
        System.out.println("Espresso price before being decorated: R" + coffee.cost());
        System.out.println("Decaf price before being decorated: R" + decaf.cost());

        SoyDecorator addSoy = new SoyDecorator(coffee);
        System.out.println("Espresso price after being decorated with soy: R" + addSoy.cost());

        CaramelDecorator addCaramel = new CaramelDecorator(decaf);
        System.out.println("Decaf price after being decorated with caramel: R" + addCaramel.cost());
        CaramelDecorator add2Caramel = new CaramelDecorator(addCaramel);
        System.out.println("Decaf price after being decorated with TWO caramel: R" + add2Caramel.cost());
        CaramelDecorator add3Caramel = new CaramelDecorator(add2Caramel);
        System.out.println("Decaf price after being decorated with THREE caramel: R" + add3Caramel.cost());

    }
}
