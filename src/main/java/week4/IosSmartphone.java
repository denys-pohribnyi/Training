package week4;

public class IosSmartphone extends Phone{
    @Override
    void setChargerType() {
        System.out.println("Lightning charger");
    }

    @Override
    void setOperationSystem() {
        System.out.println("iOS 14.6");
    }

    @Override
    void setApplicationStore() {
        System.out.println("AppStore");
    }
}
