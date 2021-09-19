package week2;

public class SalaryCheck {
    public static void main(String[] args) {
        SalesMan salesMan1 = new SalesMan();
        salesMan1.setHours(180);                        // Отработанные часы
        salesMan1.setExp(1);                            // Опыт работы
        salesMan1.setSales(9);                         // Количество продаж
        salesMan1.setResultOfSales(1500);               // Сумма продаж
        int baseSalary = salesMan1.calcSalary(salesMan1.getHours(), salesMan1.baseCoeff(salesMan1.getExp()));
        System.out.println("Base salary is equals: " + baseSalary);
        double rate = salesMan1.baseCoeff(salesMan1.getExp());
        System.out.println("Rate of salesman is: " + rate);
        double bonusOrFine = salesMan1.bonusOrFine(salesMan1.getSales());
        System.out.println("Bonus or fine: " + bonusOrFine);
        double resultOfOverSale = salesMan1.overSales(salesMan1.getResultOfSales());
        System.out.println("Bonus for an extra sales (15k$): " + resultOfOverSale);
        double summary = baseSalary + bonusOrFine + resultOfOverSale;
        System.out.println("Salary is equals: " + summary);
    }
}
//B - Расчёт зарплаты агента по продажам
//Расчёт зарплаты нужно разбить на несколько методов
//      1. Первый метод получает количество отработанных часов и базовую
//ставку. если количество отработанных часов больше 160 то каждый
//последующий час по коэф 1,5 (параметры у метода - входящие часы int, и double
//rate) , возвращаемое значение - зарплата. Это должна быть сумма базовой
//зарплаты (до 160 часов) + бонус за переработку свыше 160 часов (если
//переработка была) (double)
//      2. Второй метод - получает коэффициент на базовые часы (которые до 160) в
//зависимости от стажа работы (параметры у метода - стаж работы int, возвращаемое
//значение double коэффициент) до 2 лет 1 от 2 до 4 - 1.2 от 4 до 6 - 1.3 от 6 лет - 1.4
//      3. В зависимости от количества продаж - больше 20 - бонус 250, меньше 10
//штраф 150 (параметры у метода - количество продаж int, возвращаемое значение
//double бонус за количество продаж)
//      4. четвертый в зависимости от суммы продаж больше 15000 $ - тоже
//добавляется бонус (параметры у метода - сумма продаж double, возвращаемое
//значение double бонус за сумму продаж)
//В методе main проинициализировать все нужные переменные, вызвать методы
//и сделать расчет. Результат вывести в консоль