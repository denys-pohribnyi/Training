package week4;

public class AndroidSmartphone extends Phone{
    @Override
    void setChargerType() {
        System.out.println("TypeC");
    }

    @Override
    void setOperationSystem() {
        System.out.println("Android 11");
    }

    @Override
    void setApplicationStore() {
        System.out.println("Play Market");
    }
}
