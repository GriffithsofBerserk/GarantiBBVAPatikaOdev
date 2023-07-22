package garantiBBVAPatikaOdev2;

public class Mainn {
    public static void main(String[] args) {
        PhoneApp pa = new PhoneApp();
        double toplam =  pa.calculateTotalPrice(pa.smartPhoneArray);
        System.out.println("Toplam  : "  + toplam);
    }
}
