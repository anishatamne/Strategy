/ Defining an abstract class for common Duck properties
public abstract class Duck {
    // Defining protected variables for Duck's name and its behaviors
    protected String name;
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    protected SwimBehavior swimBehavior;

    // Defining a Constructor to initialize Duck properties
    public Duck(String name, FlyBehavior flyBehavior, QuackBehavior quackBehavior, SwimBehavior swimBehavior) {
        this.name = name;
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.swimBehavior = swimBehavior;
    }


}