package CoffeeShop;

// Class representing a Latte, implementing the Coffee interface
public class Latte implements Coffee {
    IngredientFactory ingredientFactory; // Field to hold the ingredient factory

    // Constructor to initialize the Latte with an IngredientFactory
    public Latte(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory; // Set the ingredient factory
    }

    // Method to prepare the Latte coffee
    public void prepare() {
        // Create the ingredients using the ingredient factory
        Milk milk = ingredientFactory.createMilk();
        Syrup syrup = ingredientFactory.createSyrup();
        Beans beans = ingredientFactory.createBeans();

        // Print the preparation details
        System.out.println("Preparing latte with " + milk.getMilkType() + ", " + syrup.getSyrupType() + " and " + beans.getBeansType());
    }

    // Method to simulate drinking the Latte
    public void drink() {
        System.out.println("You drink latte"); // Print message indicating that the Latte is being consumed
    }
}