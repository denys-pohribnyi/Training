package week3;

public class SalesAgentSalary {

    public SalesAgentSalary(int hours, double rate) {
        // double juniorRate = 1; - Если испытательный срок то можно установить фиксированную ставку для джуна
        double setSalary = calcSalary(hours, rate);
        System.out.println("Salary of this junior agent is : $" + setSalary);
    }

    public SalesAgentSalary(int hours, double rate, int exp, int sales, double resultOfSales) { // rate кажется, лишний параметр
        double setSalary = calcSalary(hours, baseCoeff(exp)) + bonusOrFine(sales) + overSales(resultOfSales);
        System.out.println("Salary of this senior agent is : $" + setSalary);
    }

    public int calcSalary(int hours, double rate) {
        Double dRate = Double.valueOf(rate);
        double bonusOvertime;
        double bonusCalculated = 0;
        if (hours > 160) {
            bonusOvertime = hours - 160;
            bonusCalculated = bonusOvertime * 1.5;
        }
        double dSalary = (hours * dRate) + bonusCalculated; //часы*рейт // преобразование типа инт в дабл
        Integer salary = (int) dSalary; // преобразование дабл в инт
        return salary;
    }

    public double baseCoeff(int exp) {
        double coeff = 0;
        if (exp >= 0) {
            coeff = switch (exp) {
                case 0, 1 -> 1;
                case 2, 3 -> 1.2;
                case 4, 5 -> 1.3;
                default -> 1.4;
            };
        }
        return coeff;
    }

    public double bonusOrFine(int sales) {
        Double bonFine = Double.valueOf(sales);
        double result = 0;
        if (bonFine >= 20) {
            result = 250;
        } else if (bonFine < 10) {
            result = result - 150;
        } else {
            result = 0;
        }
        return result;
    }

    public double overSales(double resultOfSales) {
        double result = 0;
        if (resultOfSales >= 15000) {
            result = result + 250;
        }
        return result;
    }
}




/*
1 - Расчёт зарплаты агента по продажам
Расчёт зарплаты нужно разбить на несколько методов:
1. Первый метод получает количество отработанных часов и базовую ставку.
если количество отработанных часов больше 160 то каждый
последующий час по коэф 1,5 (параметры у метода - входящие часы
int, и double rate) , возвращаемое значение - зарплата. Это должна
быть сумма базовой зарплаты (до 160 часов) + бонус за переработку
свыше 160 часов (если переработка была) (double)
2. Второй метод - получает коэффициент на базовые часы (которые до 160) в
зависимости от стажа работы (параметры у метода - стаж работы int,
возвращаемое значение double коэффициент)
до 2 лет 1
от 2 до 4 - 1.2
от 4 до 6 - 1.3
от 6 лет - 1.4
3. В зависимости от количества продаж - больше 20 - бонус 250, меньше 10
штраф 150 (параметры у метода - количество продаж int, возвращаемое
значение double бонус за количество продаж)
4. четвертый в зависимости от суммы продаж больше 15000 $ - тоже добавляется
бонус (параметры у метода - сумма продаж double, возвращаемое значение
double бонус за сумму продаж)
-------------------------------------------------------------------------------------------
Пункты 2, 3 и 4 появляются только при прохождении испытательного срока
Создать класс SalesAgentSalary - у него будет 2 параметризированных конструктора -
первый принимает в себя параметры - входящие часы int, double - рейт в час;
второй принимает в себя параметры - входящие часы int, double - рейт в час, int - стаж
работы, int - количество продаж, double - Сумма продаж
Все методы расчета (можно взять с прошлого урока)
Метод getSalary - который будет возвращать double
В конструкторах вызывать метод setSalary - который будет сэтить сэлэри в
зависимости от конструктора (и от того прошел ли испытательный срок
соответственно)
Понимание прошел ли сотрудник испытательный срок реализовать с помощью
конструктора (если 2 параметра, то еще на ИС, если 5 параметров, то уже прошел)
Создать класс SalaryCalculation.
В нем создать метод main, в методе main 2 ссылки на объект SalesAgentSalary c
разными конструкторами вывести в консоль результат*/