package week7;

public class Storage {

    private int storageVolume;
    private String storageType;
    private String manufacturer;

    public Storage(int storageVolume, String storageType, String manufacturer) {
        this.storageVolume = storageVolume;
        this.storageType = storageType;
        this.manufacturer = manufacturer;
    }

    public int getStorageVolume() {
        return storageVolume;
    }

    public void setStorageVolume(int storageVolume) {
        this.storageVolume = storageVolume;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "storageVolume=" + storageVolume +
                ", storageType='" + storageType + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
//1. Из коллекции компьютеров computersList() создать новую коллекцию с только
//“Windows”
//2. Из коллекции компьютеров computersList() вернуть новую коллекцию из 2-х
//компютеров с “SSD” жестким диском
//3. Из коллекции компьютеров computersList() вернуть коллекцию цен
//4. Отсортировать по цене и вернуть третий снизу по минимальной цене (используя
//skip и findFirst)
//5. Из коллекции компьютеров computersList() вернуть Map<Integer, Computer> где
//ключ будет id.
//6. Написать boolean - который проверяет что в коллекции нет компьютера с ОС
//“DOS” (noneMatch)
//7. Написать boolean - который проверяет что в коллекции есть компьютер с ОС
//“MacOS” (anyMatch)