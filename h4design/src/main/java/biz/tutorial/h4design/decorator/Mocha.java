package biz.tutorial.h4design.decorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

     public Mocha(Beverage drink) {
         beverage = drink;
     }


    @Override
    public String getFullDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public Double cost() {
        return .20 + beverage.cost();
    }
}
