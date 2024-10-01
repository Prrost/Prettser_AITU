import additional1.*;
import CoffeeShop.*;


public class Main {
    //1 Addirional_____________
//    public static void main(String[] args) {
//        // Создаем новую книгу
//        Book book = new Book("Clean Code", "Robert C. Martin", "978-0132350884");
//
//        // Проверяем доступность книги
//        BookAvailability availability = new BookAvailability(true);
//        System.out.println("Is the book available? " + availability.isAvailable());
//
//        // Форматирование книги в строковом формате
//        Formatter stringFormatter = new StringFormatter();
//        System.out.println(stringFormatter.format(book));
//
//        // Форматирование книги в формате JSON
//        Formatter jsonFormatter = new JsonFormatter();
//        System.out.println(jsonFormatter.format(book));
//
//        // Форматирование книги в формате XML
//        Formatter xmlFormatter = new XmlFormatter();
//        System.out.println(xmlFormatter.format(book));
//    }
//    _______________________________




    //1 CoffeShop___________________

    public static void main(String[] args) {

//        1)Singleton
//        CoffeeShop coffeeShop = CoffeeShop.getInstance();
//
//        CoffeeShop coffeeShop1 = CoffeeShop.getInstance();
//
//        System.out.println(coffeeShop1 == coffeeShop);


        //2 Factory method
//        CoffeeFactory americanoFactory = new AmericanoFactory();
//        Coffee americano = americanoFactory.make();
//        americano.drink();
//
//        CoffeeFactory latteFactory = new LatteFactory();
//        Coffee latte = latteFactory.make();
//        latte.drink();



        //3 Abstract Factory
//        IngredientFactory latteFactory = new LatteIngredientFactory();
//        Coffee latte = new Latte(latteFactory);
//        ((Latte)latte).prepare();
//
//        IngredientFactory americanoFactory = new AmericanoIngredientFactory();
//        Coffee americano = new Americano(americanoFactory);
//        ((Americano)americano).prepare();



        //5 Builder
//
//            CoffeeBuilder builder = new CoffeeBuilder();
//
//
//            CustomCoffee customLatte = builder
//                    .withMilk(new SoyMilk())
//                    .withSyrup(new ChocolateSyrup())
//                    .withBeans(new IndianBeans())
//                    .build("Latte");
//
//
//            customLatte.prepare();



        //4 Prototype
//        CustomCoffee newCoffee = customLatte.clone();
//        if (newCoffee != null) {
//            newCoffee.prepare();  // Подготовка клонированного кофе
//        }
//
//        System.out.println(customLatte == newCoffee);

    }
}
