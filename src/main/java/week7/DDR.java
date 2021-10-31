package week7;

public class DDR {


    private int ddrVolume;
    private DDRType ddrType;

    public DDR(int ddrVolume, DDRType ddrType) {
        this.ddrVolume = ddrVolume;
        this.ddrType = ddrType;
    }

    public int getDdrVolume() {
        return ddrVolume;
    }

    public void setDdrVolume(int ddrVolume) {
        this.ddrVolume = ddrVolume;
    }

    public DDRType getDdrType() {
        return ddrType;
    }

    public void setDdrType(DDRType ddrType) {
        this.ddrType = ddrType;
    }

    @Override
    public String toString() {
        return "DDR{" +
                "ddrVolume=" + ddrVolume +
                ", ddrType=" + ddrType +
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