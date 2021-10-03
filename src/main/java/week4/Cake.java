package week4;

public class Cake {
    String taste;
    int price;
    public String getTaste() {
        return taste;
    }
    public void setTaste(String taste) {
        this.taste = taste;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
    class BirthdayCake extends Cake{
        int candle;

        public int getCandle() {
            return candle;
        }

        public void setCandle(int candle) {
            this.candle = candle;
        }

        @Override
        public void setPrice(int price) {
            super.setPrice(price);
        }
        @Override
        public void setTaste(String taste) {
            super.setTaste(taste);
        }
    }

    class WeddingCake extends Cake{
        int cakeTiers;

        public int getCakeTiers() {
            return cakeTiers;
        }

        public void setCakeTiers(int cakeTiers) {
            this.cakeTiers = cakeTiers;
        }

        @Override
        public void setPrice(int price) {
            super.setPrice(price);
        }

        @Override
        public void setTaste(String taste) {
            super.setTaste(taste);
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