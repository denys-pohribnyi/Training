package week4;

public class Fruit {
    int calories;
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }
    public void makeJuice(){
        System.out.println("Сок сделан");
    }
}
//------------------------------------------------------------------------------------------------
class Apple extends Fruit{
    @Override
    public void makeJuice(){
        System.out.println("Делаем сок из яблок");
    }
    public Apple() {
        System.out.println("У нас есть яблоки");
        final int calorieApple = 85;
        setCalories(calorieApple);
        System.out.println("Калорийность яблока составляет "+getCalories()+" калорий на 100 грамм");
    }

    void removeSeeds(){
        System.out.println("Сейчас происходит удаление косточек");
    }
}
//------------------------------------------------------------------------------------------------
class Banana extends Fruit{
    @Override
    public void makeJuice(){
        System.out.println("Делаем пюре из банана");
    }
    public Banana(){
        System.out.println("У нас есть бананы");
        final int calorieBanana = 120;
        setCalories(calorieBanana);
        System.out.println("Калорийность бананов составляет "+getCalories()+" калорий на 100 грамм");
    }
    void peelingBanana(){
        System.out.println("Сейчас происходит очистка кожуры банана");
    }
}
//------------------------------------------------------------------------------------------------
class Orange extends Fruit{
    @Override
    public void makeJuice() {
        System.out.println("Пропускаем апельсин через соковыжималку");
    }
    public Orange(){
        System.out.println("У нас есть апельсины");
        final int calorieOrange = 130;
        setCalories(calorieOrange);
        System.out.println("Калорийность апельсина составляет "+getCalories()+" калорий на 100 грамм");
    }
    void orangePeeling(){
        System.out.println("Сейчас происходит очистка апельсина");
    }
}
//------------------------------------------------------------------------------------------------
class Lemon extends Fruit{
    @Override
    public void makeJuice(){
        System.out.println("Пропускаем апельсин через соковыжималку");
    }
    public Lemon(){
        System.out.println("У нас есть лимоны");
        final int calorieLemon = 60;
        setCalories(calorieLemon);
        System.out.println("Калорийность лимона составляет "+getCalories()+" калорий на 100 грамм");
    }
    void lemonSlicing(){
        System.out.println("Сейчас происходит нарезка лимона");
    }
}
//------------------------------------------------------------------------------------------------

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