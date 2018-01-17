package biz.tutorial.h4design.decorator;

public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract Double cost();


}
