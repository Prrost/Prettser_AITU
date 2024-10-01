package CoffeeShop;

public class AmericanoFactory implements CoffeeFactory {
    // Method to create an Americano coffee
    public Coffee make(){
        // Create an ingredient factory specific to Americano
        IngredientFactory ingredientFactory = new AmericanoIngredientFactory();

        // Return a new Americano coffee using the ingredient factory
        return new Americano(ingredientFactory);
    }
}