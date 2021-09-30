package week4;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake cakeForBirthday = new BirthdayCake();
        cakeForBirthday.setCandle(5);
        cakeForBirthday.setTaste("Super sweet taste");

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