package week6;

public enum Ball {
    BALL1("Basket ball", "Gum", 10.5, 65.10),
    BALL2("Foot ball", "Leather", 9.3, 44.50),
    BALL3("Golf ball", "Composite plastic", 2.1, 20.11),
    BALL4("Tennis ball", "Synthetic", 4.4, 10.99),
    BALL5("Pool ball", "Elephant bone", 4.2, 60.99);
    String typeOfSport;
    String material;
    double size;
    double price;


    Ball(String typeOfStort, String material, double size, double price) {
        this.typeOfSport = typeOfStort;
        this.material = material;
        this.size = size;
        this.price = price;
    }

    public String getTypeOfStort() {
        return typeOfSport;
    }

    public String getMaterial() {
        return material;
    }

    public double getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ball info : " +
                "type of sport: '" + typeOfSport + '\'' +
                ", material: '" + material + '\'' +
                ", size of ball is: " + size +
                "inch, price: $" + price +
                '.';
    }
}
//. Написать Enum “Ball” у него будут поля
//- размер (double)
//- вид спорты (String)
//- цена (double)
//- материал (String)
// добавить гетеры и конструктор
//добавить 5 видов мячей
//переопределить toString
// в классе BallTester c помощью toString вывести в консоль инфу о мячах