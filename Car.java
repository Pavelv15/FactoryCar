package factory;

public class Car {
    private String title;
    private int price;

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(String title, int price) {
        this.price = price;
        this.title = title;
    }
}
