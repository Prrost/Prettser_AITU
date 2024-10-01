package CoffeeShop;

public class Americano implements Coffee {
    // Field to store the ingredient factory
    IngredientFactory ingredientFactory;

    // Constructor that takes an ingredient factory to create necessary components for coffee
    public Americano(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    // Method to prepare Americano using ingredients provided by the factory
    public void prepare() {
        // Create ingredients using the factory
        Milk milk = ingredientFactory.createMilk();
        Syrup syrup = ingredientFactory.createSyrup();
        Beans beans = ingredientFactory.createBeans();

        // Output the coffee preparation process with the ingredient types
        System.out.println("Preparing americano with " + milk.getMilkType() + ", " + syrup.getSyrupType() + " and " + beans.getBeansType());
    }

    // Method that simulates the process of drinking the coffee
    public void drink(){
        System.out.println("You drink americano");
    }
}