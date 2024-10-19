package Assignment4.Observer;

public class NewsSubscriberTablet implements Observer {
    public void update(String newsCategory, String newsTitle){
        if (newsCategory.equals("Sport") || newsCategory.equals("Science")){
            System.out.println("New notification on tablet:" + newsTitle);
        }
    }
}
