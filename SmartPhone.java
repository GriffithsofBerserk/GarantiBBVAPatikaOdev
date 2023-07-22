package garantiBBVAPatikaOdev2;

public class SmartPhone extends Phone{
    private String storage;
    private String ram;
    private String camera;

        // All Args Constructor
    public SmartPhone(String id, String name, int price, String phoneNumber, String storage, String ram, String camera) {
        super(id, name, price, phoneNumber);
        this.storage = storage;
        this.ram = ram;
        this.camera = camera;
    }
    public SmartPhone(){ //No Args Constructor

    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }
}
