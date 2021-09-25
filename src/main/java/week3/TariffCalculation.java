package week3;

public class TariffCalculation {
    public static void main(String[] args) {
        PhoneBill phone1 = new PhoneBill(100, 100, 10, 0, 0);
        PhoneBill phone2 = new PhoneBill(8000, 600, 100, 10, 20);
        PhoneBill phone3 = new PhoneBill(12000, 2000, 200, 30, 30);
    }
}
// OUTPUT
//Your phone bill for pverious month is : UAH 60.0
//Your phone bill for pverious month is : UAH 505.0
//Your phone bill for pverious month is : UAH 2155.0


//1. Стоимость интернета до 8гб включена в пакет, после 50 грн / 500 мб
//    int internetMbUsed;
//2. Звонки по Украине до 500 минут 0,5 грн / мин после 0,75
//    int cellUkr;
//3. Смс до 50 шт 1 грн после 1,50
//    int sms;
//4. Звонки за рубеж зона 1 1.5 грн/мин
//    int cellZone1;
//5. Звонки за рубеж зона 2 2 грн/мин
//    int cellZone2;



