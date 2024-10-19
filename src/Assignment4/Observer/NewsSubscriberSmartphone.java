package Assignment4.Observer;

public class NewsSubscriberSmartphone implements Observer{
    public void update(String newsCategory, String newsTitle){
        if (newsCategory.equals("Sport")){
            System.out.println("New notification on smartphone:" + newsTitle);
        }
    }
}
