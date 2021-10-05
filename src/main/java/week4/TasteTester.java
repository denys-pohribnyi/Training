package week4;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake cakeForBirthday = new BirthdayCake();
        cakeForBirthday.setCandle(5);
        cakeForBirthday.setTaste("cherry");
        cakeForBirthday.setPrice(350);

        String birthdayCakeInfo = "Taste of birthday cake is " + cakeForBirthday.getTaste() +
                ", and it has " + cakeForBirthday.getCandle() + " candles. This cake costs ₴" +
                cakeForBirthday.getPrice();
        System.out.println(birthdayCakeInfo);

        WeddingCake cakeForWedding = new WeddingCake();
        cakeForWedding.setCakeTiers(3);
        cakeForWedding.setTaste("coconut");
        cakeForWedding.setPrice(440);

        String weddingCakeInfo = "Taste of wedding cake is " + cakeForWedding.getTaste() +
                ", and it has " + cakeForWedding.getCakeTiers() + " tiers. This cake costs ₴" +
                cakeForWedding.getPrice();
        System.out.println(weddingCakeInfo);


    }
}
//Taste of birthday cake is cherry, and it has 5 candles. This cake costs ₴350
//Taste of wedding cake is coconut, and it has 3 tiers. This cake costs ₴440


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