package garantiBBVAPatikaOdev2;

public class PhoneApp {


        SmartPhone[] smartPhoneArray = new SmartPhone[]{
                new SmartPhone("1", "Poco X3 GT", 13750, "12345", "256 GB", "8 GB", "64 MP"),
                new SmartPhone("2", "Iphone 14", 43135, "123456", "128 GB", "6 GB", "48 MP"),
                new SmartPhone("3", "Samsung Galaxy s23", 30999, "1234567", "128 GB", "8 GB", "50 MP"),
                new SmartPhone("4", "Xiaomi 13", 45999, "12345678", "256 GB", "8 GB", "50 MP"),
                new SmartPhone("5", "General Mobile Discovery 2", 1625, "123456789", "16 GB", "2 GB", "13 MP")
        };

        double top = 0;
        double calculateTotalPrice (SmartPhone[] smartPhoneArray){
            for (SmartPhone sum : smartPhoneArray) {
                top += sum.getPrice();
            }
            return top;
        }
}