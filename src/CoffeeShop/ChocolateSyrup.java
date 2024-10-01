package CoffeeShop;

// Class representing Chocolate Syrup, implementing the Syrup interface and Cloneable
public class ChocolateSyrup implements Syrup, Cloneable {

    // Method to get the type of syrup
    public String getSyrupType() {
        return "Chocolate Syrup";
    }

    // Method to clone the ChocolateSyrup object
    public ChocolateSyrup clone() {
        try {
            return (ChocolateSyrup) super.clone();  // Cloning using shallow copy
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();  // Print stack trace if cloning fails
            return null;  // Return null if cloning is not successful
        }
    }
}