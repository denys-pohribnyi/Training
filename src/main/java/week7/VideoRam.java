package week7;

public class VideoRam {

    private String manufacturer;
    private double ramSize;

    public VideoRam(String manufacturer, double ramSize) {
        this.manufacturer = manufacturer;
        this.ramSize = ramSize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getRamSize() {
        return ramSize;
    }

    public void setRamSize(double ramSize) {
        this.ramSize = ramSize;
    }

    @Override
    public String toString() {
        return "VideoRam{" +
                "manufacturer='" + manufacturer + '\'' +
                ", ramSize=" + ramSize +
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