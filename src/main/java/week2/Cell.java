package week2;

public class Cell {
    public void setInternetMbUsed(int internetMbUsed) {
        this.internetMbUsed = internetMbUsed;
    }

    public int getInternetMbUsed() {
        return internetMbUsed;
    }

    public int getCellUkr() {
        return cellUkr;
    }

    public void setCellUkr(int cellUkr) {
        this.cellUkr = cellUkr;
    }

    public int getSms() {
        return sms;
    }

    public void setSms(int sms) {
        this.sms = sms;
    }

    public int getCellZone1() {
        return cellZone1;
    }

    public void setCellZone1(int cellZone1) {
        this.cellZone1 = cellZone1;
    }

    public int getCellZone2() {
        return cellZone2;
    }

    public void setCellZone2(int cellZone2) {
        this.cellZone2 = cellZone2;
    }

    int internetMbUsed;
    int cellUkr;
    int sms;
    int cellZone1;
    int cellZone2;

    //1. Стоимость интернета до 8гб включена в пакет, после 50 грн / 500 мб
    public int internetUsed(int internetMbUsed) {
        int temp1 = 0;
        int result = 0;
        if (internetMbUsed > 8000) {
            temp1 = internetMbUsed - 8000;
            for (int i = 0; i < temp1; i = i + 500) {
                result = result + 50;
            }
        }
        return result;
    }

    //2. Звонки по Украине до 500 минут 0,5 грн / мин после 0,75
    public double cellsInUa(int cellUkr) {
        double result = 0;
        double priceBeforeLimit = 0;
        double priceAfterLimit = 0;
        if (cellUkr <= 500) {
            for (int i = 0; i < cellUkr; i++) {
                priceBeforeLimit = priceBeforeLimit + 0.5;
            }
        } else if (cellUkr > 500) {
            double temp = cellUkr - 500;
            priceAfterLimit = 250;
            for (int i = 0; i < temp; i++) {
                priceAfterLimit = priceAfterLimit + 0.75;
            }
        }
        result = priceBeforeLimit + priceAfterLimit;
        return result;
    }

    //3. Смс до 50 шт 1 грн после 1,50
    public double smsDistrict(int sms) {
        double result = 0;
        double beforeLimit = 0;
        double afterLimit = 0;
        if (sms <= 50) {
            for (int i = 0; i < sms; i++) {
                beforeLimit = beforeLimit + 1;
            }
        } else if (sms > 50) {
            double temp = sms - 50;
            afterLimit = 50;
            for (int i = 0; i < temp; i++) {
                afterLimit = afterLimit + 1.50;
            }
        }
        result = beforeLimit + afterLimit;
        return result;
    }

    //4. Звонки за рубеж зона 1 1.5 грн/мин
    public double foreignCallZone1(int cellZone1) {
        double result = 0;
        for (int i = 0; i < cellZone1; i++) {
            result = result + 1.5;
        }
        return result;
    }

    //5. Звонки за рубеж зона 2 2 грн/мин
    public double foreignCallZone2(int cellZone2) {
        double result = 0;
        for (int i = 0; i < cellZone2; i++) {
            result = result + 2;
        }
        return result;
    }
}