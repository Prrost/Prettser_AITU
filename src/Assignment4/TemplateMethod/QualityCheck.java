package Assignment4.TemplateMethod;

public abstract class QualityCheck {
    public final void checkProduct(){
        checkAppearance();
        checkSpecificCharacteristics();
        generateReport();
    }


    private void checkAppearance() {
        System.out.println("Checking product appearance...");
    }


    protected abstract void checkSpecificCharacteristics();


    private void generateReport() {
        System.out.println("Generating final quality report.");
    }
}
