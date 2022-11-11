package Decorator;

abstract class AddOnDecorator extends Beverage {
    public abstract int cost();
}
 //all decorators behave like beverages and have beverages