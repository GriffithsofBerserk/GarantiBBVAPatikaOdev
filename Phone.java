package garantiBBVAPatikaOdev2;

public class Phone extends Product{
    private String phoneNumber;


    public Phone(String id,String name,int price,String phoneNumber){
        super(id,name,price);
        this.phoneNumber = phoneNumber;
    }
    public Phone(){

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
