package week3;

public class SalesAgentSalary {
    double salary; // Переменная для геттеров\сеттеров
    String status; // Определим в эту переменную статус(испыталки) агента, в завимости от конструктора

    public double getSalary() {
        System.out.println("Salary of this " + status + " agent is : $" + salary);
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public SalesAgentSalary(int hours, double rate) {
        setSalary(calcSalary(hours, rate));
        status = "Junior";
    }

    public SalesAgentSalary(int hours, double rate, int exp, int sales, double resultOfSales) { // rate кажется, лишний параметр
        setSalary(calcSalary(hours, baseCoeff(exp)) + bonusOrFine(sales) + overSales(resultOfSales));
        status = "Senior";
    }

    public int calcSalary(int hours, double rate) {
        Double dRate = Double.valueOf(rate);
        double bonusOvertime;
        double bonusCalculated = 0;
        if (hours > 160) {
            bonusOvertime = hours - 160;
            bonusCalculated = bonusOvertime * 1.5;
        }
        double dSalary = (hours * dRate) + bonusCalculated;
        Integer salary = (int) dSalary;
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