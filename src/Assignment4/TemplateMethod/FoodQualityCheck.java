package Assignment4.TemplateMethod;

public class FoodQualityCheck extends QualityCheck {
    public void checkSpecificCharacteristics(){
        System.out.println("Checking expiration date...");
        System.out.println("Checking ingredients...");
    }
}
