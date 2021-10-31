package week7;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HoweWorkWithStreams {


    public static void main(String[] args) {
        List<Computer> computerList = ComputerCollection.computersList();

        System.out.println("1. Из коллекции компьютеров computersList() создать новую коллекцию с только “Windows”");
        List<Computer> windowsComputers = computerList.stream()
                .filter(computer -> computer.getOS().equals("Windows"))
                .collect(Collectors.toList());
        windowsComputers.forEach(System.out::println);
        System.out.println();

        System.out.println("2. Из коллекции компьютеров computersList() вернуть новую коллекцию из 2-х компьютеров с “SSD” жестким диском");
        List<Computer> computersWithSSD = computerList.stream()
                .filter(computer -> computer.getStorage().getStorageType().equals("SSD"))
                .limit(2)
                .collect(Collectors.toList());
        computersWithSSD.forEach(System.out::println);
        System.out.println();

        System.out.println("3. Из коллекции компьютеров computersList() вернуть коллекцию цен");

        List<Double> prices = computerList.stream()
                .map(Computer::getPrice)
                .sorted()
                .collect(Collectors.toList());
        prices.forEach(System.out::println);
        System.out.println();

        System.out.println("4. Отсортировать по цене и вернуть третий снизу по минимальной цене (используя skip и findFirst)");

        Optional<Computer> sortedByPrice = computerList.stream()
                .sorted(Comparator.comparingDouble(Computer::getPrice).reversed())
                .skip(2)
                .findFirst();
        System.out.println(sortedByPrice);
        System.out.println();

        System.out.println("5. Из коллекции компьютеров computersList() вернуть Map<Integer, Computer> где ключ будет id.");

        Map<Integer, Computer> map = computerList.stream()
                .collect((Collectors.toMap(Computer::getId, Function.identity())));
        map.entrySet().forEach(System.out::println);
        System.out.println();

        System.out.println("6. Написать boolean - который проверяет что в коллекции нет компьютера с ОС “DOS” (noneMatch)");

        boolean computerHasNoDOS = computerList.stream()
                .noneMatch(computer -> computer.getOS().equals("DOS"));
        System.out.println(computerHasNoDOS);
        System.out.println();

        System.out.println("7. Написать boolean - который проверяет что в коллекции есть компьютер с ОС “MacOS” (anyMatch)");

        boolean computersInListHasMacOS = computerList.stream()
                .anyMatch(computer -> computer.getOS().equals("MacOS"));
        System.out.println(computersInListHasMacOS);
    }
}
//1. Из коллекции компьютеров computersList() создать новую коллекцию с только “Windows”
//Computer{storage=Storage{storageVolume=512, storageType='SSD', manufacturer='Zalman'}, processor=Processor{numberOfCore=4, frequency=2.3}, ddr=DDR{ddrVolume=8, ddrType=DDRType{}}, videoRam=VideoRam{manufacturer='Nvidia', ramSize=2.0}, OS='Windows', price=2300.0, id=45464987}
//Computer{storage=Storage{storageVolume=512, storageType='SSD', manufacturer='Seagate'}, processor=Processor{numberOfCore=6, frequency=2.8}, ddr=DDR{ddrVolume=8, ddrType=DDRType{}}, videoRam=VideoRam{manufacturer='Sapphire', ramSize=6.0}, OS='Windows', price=1200.0, id=45464992}
//Computer{storage=Storage{storageVolume=256, storageType='HDD', manufacturer='Samsung'}, processor=Processor{numberOfCore=6, frequency=2.9}, ddr=DDR{ddrVolume=8, ddrType=DDRType{}}, videoRam=VideoRam{manufacturer='Gigabyte', ramSize=1.0}, OS='Windows', price=3050.0, id=45464995}
//Computer{storage=Storage{storageVolume=2048, storageType='HDD', manufacturer='Kingston'}, processor=Processor{numberOfCore=12, frequency=1.3}, ddr=DDR{ddrVolume=8, ddrType=DDRType{}}, videoRam=VideoRam{manufacturer='Radeon', ramSize=3.0}, OS='Windows', price=4500.0, id=45464999}
//
//2. Из коллекции компьютеров computersList() вернуть новую коллекцию из 2-х компьютеров с “SSD” жестким диском
//Computer{storage=Storage{storageVolume=512, storageType='SSD', manufacturer='Zalman'}, processor=Processor{numberOfCore=4, frequency=2.3}, ddr=DDR{ddrVolume=8, ddrType=DDRType{}}, videoRam=VideoRam{manufacturer='Nvidia', ramSize=2.0}, OS='Windows', price=2300.0, id=45464987}
//Computer{storage=Storage{storageVolume=512, storageType='SSD', manufacturer='Seagate'}, processor=Processor{numberOfCore=6, frequency=2.8}, ddr=DDR{ddrVolume=8, ddrType=DDRType{}}, videoRam=VideoRam{manufacturer='Sapphire', ramSize=6.0}, OS='Windows', price=1200.0, id=45464992}
//
//3. Из коллекции компьютеров computersList() вернуть коллекцию цен
//1200.0
//1500.0
//1800.0
//1950.0
//2300.0
//2850.0
//2999.0
//3050.0
//3600.0
//4500.0
//
//4. Отсортировать по цене и вернуть третий снизу по минимальной цене (используя skip и findFirst)
//Optional[Computer{storage=Storage{storageVolume=256, storageType='HDD', manufacturer='Samsung'}, processor=Processor{numberOfCore=6, frequency=2.9}, ddr=DDR{ddrVolume=8, ddrType=DDRType{}}, videoRam=VideoRam{manufacturer='Gigabyte', ramSize=1.0}, OS='Windows', price=3050.0, id=45464995}]
//
//5. Из коллекции компьютеров computersList() вернуть Map<Integer, Computer> где ключ будет id.
//45464996=Computer{storage=Storage{storageVolume=1024, storageType='SSD', manufacturer='Transcend'}, processor=Processor{numberOfCore=4, frequency=3.1}, ddr=DDR{ddrVolume=8, ddrType=DDRType{}}, videoRam=VideoRam{manufacturer='Power VR', ramSize=10.0}, OS='Linux', price=2999.0, id=45464996}
//45464999=Computer{storage=Storage{storageVolume=2048, storageType='HDD', manufacturer='Kingston'}, processor=Processor{numberOfCore=12, frequency=1.3}, ddr=DDR{ddrVolume=8, ddrType=DDRType{}}, videoRam=VideoRam{manufacturer='Radeon', ramSize=3.0}, OS='Windows', price=4500.0, id=45464999}
//45464993=Computer{storage=Storage{storageVolume=512, storageType='SSD', manufacturer='Transcend'}, processor=Processor{numberOfCore=4, frequency=3.8}, ddr=DDR{ddrVolume=2, ddrType=DDRType{}}, videoRam=VideoRam{manufacturer='Zotac', ramSize=5.0}, OS='MacOS', price=1950.0, id=45464993}
//45464992=Computer{storage=Storage{storageVolume=512, storageType='SSD', manufacturer='Seagate'}, processor=Processor{numberOfCore=6, frequency=2.8}, ddr=DDR{ddrVolume=8, ddrType=DDRType{}}, videoRam=VideoRam{manufacturer='Sapphire', ramSize=6.0}, OS='Windows', price=1200.0, id=45464992}
//45464995=Computer{storage=Storage{storageVolume=256, storageType='HDD', manufacturer='Samsung'}, processor=Processor{numberOfCore=6, frequency=2.9}, ddr=DDR{ddrVolume=8, ddrType=DDRType{}}, videoRam=VideoRam{manufacturer='Gigabyte', ramSize=1.0}, OS='Windows', price=3050.0, id=45464995}
//45464994=Computer{storage=Storage{storageVolume=256, storageType='HDD', manufacturer='Sandisk'}, processor=Processor{numberOfCore=6, frequency=2.1}, ddr=DDR{ddrVolume=8, ddrType=DDRType{}}, videoRam=VideoRam{manufacturer='Intel', ramSize=3.0}, OS='MacOS', price=2850.0, id=45464994}
//45464988=Computer{storage=Storage{storageVolume=1024, storageType='HDD', manufacturer='Verbatim'}, processor=Processor{numberOfCore=8, frequency=3.8}, ddr=DDR{ddrVolume=8, ddrType=DDRType{}}, videoRam=VideoRam{manufacturer='AMD', ramSize=3.0}, OS='MacOS', price=3600.0, id=45464988}
//45464991=Computer{storage=Storage{storageVolume=128, storageType='HDD', manufacturer='Dell'}, processor=Processor{numberOfCore=6, frequency=1.8}, ddr=DDR{ddrVolume=8, ddrType=DDRType{}}, videoRam=VideoRam{manufacturer='EVGA', ramSize=8.0}, OS='Linux', price=1500.0, id=45464991}
//45464990=Computer{storage=Storage{storageVolume=256, storageType='HDD', manufacturer='Intel'}, processor=Processor{numberOfCore=8, frequency=2.1}, ddr=DDR{ddrVolume=8, ddrType=DDRType{}}, videoRam=VideoRam{manufacturer='Asus', ramSize=4.0}, OS='Linux', price=1800.0, id=45464990}
//45464987=Computer{storage=Storage{storageVolume=512, storageType='SSD', manufacturer='Zalman'}, processor=Processor{numberOfCore=4, frequency=2.3}, ddr=DDR{ddrVolume=8, ddrType=DDRType{}}, videoRam=VideoRam{manufacturer='Nvidia', ramSize=2.0}, OS='Windows', price=2300.0, id=45464987}
//
//6. Написать boolean - который проверяет что в коллекции нет компьютера с ОС “DOS” (noneMatch)
//true
//
//7. Написать boolean - который проверяет что в коллекции есть компьютер с ОС “MacOS” (anyMatch)
//true