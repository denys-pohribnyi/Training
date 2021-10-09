package week5;

public class Book {
    double price;
    String title;
    String coverType;
    int quantityOfPages;

    public Book(double price, String title, String coverType, int quantityOfPages) {
        this.price = price;
        this.title = title;
        this.coverType = coverType;
        this.quantityOfPages = quantityOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        if(coverType == "Soft" || coverType =="Hard"){
        this.coverType = coverType;}
        else{
            System.out.println("Error! Cover can be Soft or Hard only");    // try
        }
        }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }
}
