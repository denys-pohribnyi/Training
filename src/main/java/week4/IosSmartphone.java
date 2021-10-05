package week4;

public class IosSmartphone extends Phone {
    private String chargerIOS;
    private String osIOS;
    private String applicationStoreIOS;

    public IosSmartphone(String chargerIOS, String osIOS, String applicationStoreIOS) {
        this.chargerIOS = chargerIOS;
        this.osIOS = osIOS;
        this.applicationStoreIOS = applicationStoreIOS;
    }

    public String getChargerIOS() {
        return chargerIOS;
    }

    public void setChargerIOS(String chargerIOS) {
        this.chargerIOS = chargerIOS;
    }

    public String getOsIOS() {
        return osIOS;
    }

    public void setOsIOS(String osIOS) {
        this.osIOS = osIOS;
    }

    public String getApplicationStoreIOS() {
        return applicationStoreIOS;
    }

    public void setApplicationStoreIOS(String applicationStoreIOS) {
        this.applicationStoreIOS = applicationStoreIOS;
    }

    @Override
    void setChargerType() {
        setChargerIOS("Lightning charger");
    }

    @Override
    void setOperationSystem() {
        setOsIOS("iOS 14.6");
    }

    @Override
    void setApplicationStore() {
        setApplicationStoreIOS("AppStore");
    }
}
