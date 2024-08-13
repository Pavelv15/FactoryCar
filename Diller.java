package factory;

public class Diller
{
    private String titleDiller;
    private  int age;

    public Diller(String titleDiller, int age) {
        this.titleDiller = titleDiller;
        this.age = age;
    }

    void  createOrder(Order order) {
        order.start();
        order.showInfoOrder();
        order.chekModels();

    }
}
