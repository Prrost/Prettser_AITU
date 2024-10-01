package CoffeeShop;

// Class for building a custom coffee using the Builder pattern
public class CoffeeBuilder {
    private Milk milk;      // Field to hold the milk ingredient
    private Syrup syrup;    // Field to hold the syrup ingredient
    private Beans beans;     // Field to hold the beans ingredient

    // Method to add milk to the coffee
    public CoffeeBuilder withMilk(Milk milk) {
        this.milk = milk;  // Set the milk field
        return this;       // Return the builder for method chaining
    }

    // Method to add syrup to the coffee
    public CoffeeBuilder withSyrup(Syrup syrup) {
        this.syrup = syrup; // Set the syrup field
        return this;        // Return the builder for method chaining
    }

    // Method to add beans to the coffee
    public CoffeeBuilder withBeans(Beans beans) {
        this.beans = beans; // Set the beans field
        return this;        // Return the builder for method chaining
    }

    // Method to create a CustomCoffee object with the specified ingredients
    public CustomCoffee build(String coffeeType) {
        return new CustomCoffee(coffeeType, milk, syrup, beans); // Create and return a new CustomCoffee object
    }
}