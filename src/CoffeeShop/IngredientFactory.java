package CoffeeShop;

// Interface for creating ingredients for coffee
public interface IngredientFactory {
    // Method to create and return a Milk object
    Milk createMilk();

    // Method to create and return a Beans object
    Beans createBeans();

    // Method to create and return a Syrup object
    Syrup createSyrup();
}