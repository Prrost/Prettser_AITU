package CoffeeShop;

// Class that creates ingredients specific to Latte, implementing the IngredientFactory interface
public class LatteIngredientFactory implements IngredientFactory {

    // Method to create and return a WholeMilk object
    public Milk createMilk() {
        return new WholeMilk(); // Return a new instance of WholeMilk
    }

    // Method to create and return a ChocolateSyrup object
    public Syrup createSyrup() {
        return new ChocolateSyrup(); // Return a new instance of ChocolateSyrup
    }

    // Method to create and return an IndianBeans object
    public Beans createBeans() {
        return new IndianBeans(); // Return a new instance of IndianBeans
    }
}