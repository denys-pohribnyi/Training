package week4;

public class AndroidSmartphone extends Phone {
    private String chagrerAOS;
    private String osAOS;
    private String applicationStoreAOS;

    public AndroidSmartphone() {
        setOperationSystem();
        setChargerType();
        setApplicationStore();
    }

    public String getChagrerAOS() {
        return chagrerAOS;
    }

    public void setChagrerAOS(String chagrerAOS) {
        this.chagrerAOS = chagrerAOS;
    }

    public String getOsAOS() {
        return osAOS;
    }

    public void setOsAOS(String osAOS) {
        this.osAOS = osAOS;
    }

    public String getApplicationStoreAOS() {
        return applicationStoreAOS;
    }

    public void setApplicationStoreAOS(String applicationStoreAOS) {
        this.applicationStoreAOS = applicationStoreAOS;
    }

    @Override
    void setChargerType() {
        setChagrerAOS("TypeC");
    }

    @Override
    void setOperationSystem() {
        setOsAOS("Android 10");
    }

    @Override
    void setApplicationStore() {
        setApplicationStoreAOS("Google Play Market");
    }
}
