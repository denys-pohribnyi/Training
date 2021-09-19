package week2;

public class SalesMan {

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public double getResultOfSales() {
        return resultOfSales;
    }

    public void setResultOfSales(double resultOfSales) {
        this.resultOfSales = resultOfSales;
    }

    int hours;
    int exp;
    int sales;
    double resultOfSales;

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
        if(bonFine >= 20){
            result = 250;
        } else if(bonFine < 10){
            result = result - 150;
        } else {
            result = 0;
        }
        return result;
    }
    public double overSales(double resultOfSales){
        double result =0;
        if(resultOfSales >= 15000){
            result = result + 250;
        }
        return result;
    }
}