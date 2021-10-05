package week4;

public class JuiceMarket {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.removeSeeds();
        apple.makeJuice();
        System.out.println("-------------------");
//--------------------------------------
        Banana banana = new Banana();
        banana.peelingBanana();
        banana.makeJuice();
        System.out.println("-------------------");

//--------------------------------------
        Orange orange = new Orange();
        orange.orangePeeling();
        orange.makeJuice();
        System.out.println("-------------------");

//--------------------------------------
        Lemon lemon = new Lemon();
        lemon.lemonSlicing();
        lemon.makeJuice();
        System.out.println("-------------------");
//--------------------------------------
        System.out.println("Unknown fruit");
        Fruit fruit = new Fruit();
        fruit.makeJuice();
    }
}
//У нас есть яблоки
//Калорийность яблока составляет 85 калорий на 100 грамм
//Сейчас происходит удаление косточек
//Делаем сок из яблок


/*
1. Создайте класс Fruit. (уточняю - НЕабстрактный)))
В этом классе добавьте поле int “сalories” для него setCalories() и getCalories а также
метод makeJuice(), который печатает в консоль - "сок сделан" (общее сообщение).
Затем создайте несколько подклассов - Apple, Banana, Orange, Lemon (они
естественно наследуют Fruit)
Потом добавьте методы в дочерних классах, которые специфичны только для данных
фруктов. По типу если вы собираетесь делать яблочный сок Apple, то сделайте
удаление косточек removeSeeds(). Если вы собираетесь делать банановый класс, то
очистка peel() и т д (эти методы просто выводят в консоль инфо типо “сейчас
происходит очистка банана”)
А затем вызовите setCalories() (метод суперкласса) в конструкторах этих подклассов и
поставьте калорийность
Переопределите метод makeJuice() для вывода в консоль конкретного типа
сока, который изготавливается.
После создать класс JuiceMarket, в котором создадите несколько вариаций этих
объектов и вывод в консоль
*/