import Assignment2.Adapter.PDFDocumentAdapter;
import Assignment2.Bridge.HighlightRenderEngine;
import Assignment2.Bridge.RenderEngine;
import Assignment2.Bridge.SimpleRenderEngine;
import Assignment2.Composite.DocumentGroup;
import Assignment2.Facade.DocumentFacade;
import additional1.*;
import CoffeeShop.*;
import Assignment2.*;
import Assignment2.Flyweight.DocumentFactory;
import assignment3.chain.PaymentA;
import assignment3.chain.PaymentB;
import assignment3.chain.PaymentC;
import assignment3.chain.PaymentHandler;
import assignment3.command.*;
import assignment3.iterator.*;
import assignment3.mediator.*;
import assignment3.memento.Caretaker;
import assignment3.memento.TextEditor;


public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\n");
    //1 Addirional_____________

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



        //2 Assignment

//        DocumentFacade facade = new DocumentFacade();
//
//        // 1. Использование Proxy для ленивой загрузки
//        System.out.println("1. Ленивая загрузка документов:");
//        facade.displayDocument("Report");
//
////        // 2. Использование декоратора для добавления водяного знака
//        System.out.println("\n2. Добавление водяного знака:");
//        facade.displayDocumentWithWatermark("Report");
//
////        // 3. Использование Flyweight для повторного использования документа
//        System.out.println("\n3. Повторное использование документа:");
//        facade.displayDocument("Report");
////
////        // 4. Использование Composite для работы с группой документов
//        System.out.println("\n4. Работа с группами документов:");
//        DocumentGroup group = new DocumentGroup();
//        group.addDocument(DocumentFactory.getDocument("Report"));
//        group.addDocument(DocumentFactory.getDocument("Presentation"));
//        group.display();
////
////        // 5. Использование Adapter для работы с PDF
//        System.out.println("\n5. Работа с PDF документами через Adapter:");
//        Document pdfDocument = new PDFDocumentAdapter("document.pdf");
//        pdfDocument.display();
////
////        // 6. Использование Bridge для рендеринга
//        System.out.println("\n6. Рендеринг документа через движок:");
//        RenderEngine simpleEngine = new SimpleRenderEngine();
//        facade.renderDocument("Report", simpleEngine);
////
//        RenderEngine highlightEngine = new HighlightRenderEngine();
//        facade.renderDocument("Report", highlightEngine);





        //Assignment 3

        //1 Chain
        //Creating handlers
        PaymentHandler paymentA = new PaymentA(100);
        PaymentHandler paymentB = new PaymentB(300);
        PaymentHandler paymentC = new PaymentC(1000);

        //Creating chain
        paymentA.setNext(paymentB).setNext(paymentC);

        //Starting the chain
        paymentA.handle(210);


        System.out.println("\n\n\n");
        //2 Command

        //creating objects
        Television television = new Television();
        RemoteControl remoteControl = new RemoteControl();

        //adding commands
        remoteControl.setCommand("turn on",  new TurnOnCommand(television));
        remoteControl.setCommand("turn off",  new TurnOffCommand(television));
        remoteControl.setCommand("volume up",  new VolumeUpCommand(television));
        remoteControl.setCommand("volume down",  new VolumeDownCommand(television));
        remoteControl.setCommand("next channel",  new NextChannelCommand(television));
        remoteControl.setCommand("previous channel",  new PreviousChannelCommand(television));

        //execute commands
        remoteControl.buttonPressed("turn on");
        remoteControl.buttonPressed("volume up");
        remoteControl.buttonPressed("volume down");
        remoteControl.buttonPressed("next channel");
        remoteControl.buttonPressed("previous channel");
        remoteControl.buttonPressed("turn off");




        //3 Iterator
        System.out.println("\n");

        //Array
        ArrayMovieCollection<String> movieCollection = new ArrayMovieCollection<>();
        movieCollection.addMovie("movie 1");
        movieCollection.addMovie("movie 2");
        movieCollection.addMovie("movie 3");
        movieCollection.addMovie("movie 4");

        MyIterator<String> movieIterator = new ArrayMovieIterator<>(movieCollection);

        while (movieIterator.hasNext()) {
            String item = movieIterator.next();
            System.out.println(item);
        }
        System.out.println();

        //LinkedList
        ListMovieCollection<String> movieCollection2 = new ListMovieCollection<>();
        movieCollection2.addMovie("movie 1 list");
        movieCollection2.addMovie("movie 2 list");
        movieCollection2.addMovie("movie 3 list");
        movieCollection2.addMovie("movie 4 list");

        MyIterator<String> movieIterator2 = new ListMovieIterator<>(movieCollection2);

        while (movieIterator2.hasNext()) {
            String item = movieIterator2.next();
            System.out.println(item);
        }



        //4 Mediator
        System.out.println();


        HomeMediator homeMediator = new HomeMediatorImpl();

        homeMediator.addSensor(new LightSensor(70));
        homeMediator.addSensor(new HumiditySensor(67));
        homeMediator.addSensor(new TemperatureSensor(25));

        homeMediator.printReport();



        //5 Memento

        System.out.println();

        TextEditor textEditor = new TextEditor("first text.");

        Caretaker caretaker = new Caretaker();

        caretaker.addSavedState(textEditor.saveState());

        textEditor.addText(" Second text.");

        caretaker.addSavedState(textEditor.saveState());

        textEditor.addText(" Third text.");

        textEditor.printText();

        textEditor.restoreState(caretaker.getSavedState(0));

        textEditor.printText();

        textEditor.restoreState(caretaker.getSavedState(1));

        textEditor.printText();
    }
}
