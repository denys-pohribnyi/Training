package week4;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake cakeForBirthday = new BirthdayCake();
        cakeForBirthday.setCandle(5);
        cakeForBirthday.setTaste("Super sweet taste");
        cakeForBirthday.setPrice(350);

        WeddingCake cakeForWedding = new WeddingCake();
        cakeForWedding.setCakeTiers(3);
        cakeForWedding.setTaste("Standard sweetness");
        cakeForWedding.setPrice(440);

        System.out.println("Taste of birthday cake is " + cakeForBirthday.getTaste() +
                " And it has " + cakeForBirthday.getCandle() + " candles and this cake costs " +
                cakeForBirthday.getPrice() + "₴");


    }
}
/*
2. Cуперкласс (тоже НЕабстрактный) Cake и у него два поля, вкус и цена.
Сделать getterы и setterы для этих полей.
Класс BirthdayCake, который наследует Cake и у него есть собственное поле “свечи”
- int.
Класс под названием WeddingCake, который также наследует Cake и имеет поле
“ярусы” - int
Для ярусов и свечей тоже сделать getterы и setterы.
Класс TasteTester, в котором создать ссылки на объекты и вывести в консоль
*/