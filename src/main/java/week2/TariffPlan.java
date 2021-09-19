package week2;

public class TariffPlan {
    public static void main(String[] args) {
        Cell cell1 = new Cell();
        cell1.setInternetMbUsed(8500);                  // Ипользованые Мб интернета
        int paymentForOverTraffic = cell1.internetUsed(cell1.getInternetMbUsed());
        System.out.println("Your internet payment costs: " + paymentForOverTraffic);
        cell1.setCellUkr(501);                          // Минуты по Украине
        double cellsInUKR = cell1.cellsInUa(cell1.getCellUkr());
        System.out.println("Your cells in Ukraine costs: " + cellsInUKR);
        cell1.setSms(51);                               // Количество отправленных СМС
        double smsPrice = cell1.smsDistrict(cell1.getSms());
        System.out.println("Your sms messages costs: " + smsPrice);
        cell1.setCellZone1(1);                          // Звонки за границу (Зона 1)
        double foreign1 = cell1.foreignCallZone1(cell1.getCellZone1());
        System.out.println("Your calls in Europe costs: " + foreign1);
        cell1.setCellZone2(10);                         // Звонки за границу (Зона 2)
        double foreign2 = cell1.foreignCallZone2(cell1.getCellZone2());
        System.out.println("Your calls in USA costs: " + foreign2);
        // Result
        double sum = paymentForOverTraffic + cellsInUKR + smsPrice + foreign1 + foreign2;
        double result = sum * 1.07;                     // Сумма с налогом
        double roundedResult = (double) Math.round(result * 100) / 100;     // Округление и вывод результата в консоль
        System.out.println("Your mobile tariff costs: ₴" + roundedResult + " per month");
    }
}
//3 - Счет за телефон
//Рассчитать стоимость пакета в месяц. Расчёт по каждому из параметров
//сделать в отдельном методе. Потом общий подсчёт провести в методе main и вывести
//в консоль c помощью sout
//1. Стоимость интернета до 8гб включена в пакет, после 50 грн / 500 мб
//(вход параметр кол-во потраченных гб)
//2. Звонки по Украине до 500 минут 0,5 грн / мин после 0,75
//3. Смс до 50 шт 1 грн после 1,50
//4. Звонки за рубеж зона 1 1.5 грн/мин
//5. Звонки за рубеж зона 2 2 грн/мин
//После подсчёта суммы добавляется налог 7 %