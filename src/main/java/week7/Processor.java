package week7;

public class Processor {


    private  int numberOfCore;
    private double frequency;

    public Processor(int numberOfCore, double frequency) {
        this.numberOfCore = numberOfCore;
        this.frequency = frequency;
    }


    public int getNumberOfCore() {
        return numberOfCore;
    }

    public void setNumberOfCore(int numberOfCore) {
        this.numberOfCore = numberOfCore;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "numberOfCore=" + numberOfCore +
                ", frequency=" + frequency +
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