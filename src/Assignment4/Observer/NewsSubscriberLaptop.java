package Assignment4.Observer;

public class NewsSubscriberLaptop implements Observer {
    public void update(String newsCategory, String newsTitle){
        if (newsCategory.equals("Science")){
            System.out.println("New notification on laptop:" + newsTitle);
        }
    }
}
