package additional1;

public class BookAvailability {
    private Boolean available;

    public Boolean isAvailable(){
        return available;
    }

    public BookAvailability(Boolean available){
        this.available = available;
    }

    public void setAvailable(Boolean a){
        this.available = a;
    }
}
