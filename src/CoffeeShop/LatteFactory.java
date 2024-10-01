package CoffeeShop;

// Class that creates Latte objects, implementing the CoffeeFactory interface
public class LatteFactory implements CoffeeFactory {

    // Method to create and return a Latte object
    public Coffee make() {
        // Create a new IngredientFactory specific for Latte
        IngredientFactory ingredientFactory = new LatteIngredientFactory();

        // Create and return a new Latte using the ingredient factory
        return new Latte(ingredientFactory);
    }
}