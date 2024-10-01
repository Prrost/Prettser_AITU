package CoffeeShop;

public class AmericanoIngredientFactory implements IngredientFactory {

    // Method to create Soy Milk as the milk ingredient for Americano
    public Milk createMilk() {
        return new SoyMilk();
    }

    // Method to create Vanilla Syrup as the syrup ingredient for Americano
    public Syrup createSyrup() {
        return new VanillaSyrup();
    }

    // Method to create Chinese Beans as the beans ingredient for Americano
    public Beans createBeans() {
        return new ChineseBeans();
    }
}