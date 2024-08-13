package factory;

public class Order {
    private int id;
    private int count;
    private Factory factory;
    private Car cars[];
    private String models[];
    private int priceOrder = 0;
    private int age;
    private int countModel;
    /**
     *
     * @param id номер заказа
     * @param count количесвт о моделей
     * @param factory  - завод который будет изготавливат
     * @param models - список моделей
     */
    public Order(int id, int count, Factory factory,String[] models,int age) {
        this.id = id;
        this.count = count;
        this.factory = factory;
        this.models = models;
        this.cars = new Car[count]; // это фура, которая имеет место под зазанные машины, но изначально место в ней нейт
        this.age = age;
    }

    void  start() {
        for (int i = 0; i < cars.length; i++) {
            cars[i] = factory.createCar(models[(int) (Math.random() * models.length)]); // Машину создали и загрузили
            if(age > 10) {
                cars[i].setPrice(cars[i].getPrice() - (cars[i].getPrice() * 10) / 100);
            }
            if(cars[i]==null)
                continue;

            priceOrder += cars[i].getPrice();  //Учли стоимость авто в заказе


        }

    }

    void  showInfoOrder() {
        int i = 1;

        for (Car car : cars) {
            if(car == null)
                continue;
            System.out.printf("%d) Авмтомобиль %s стоит %d\n",i,car.getTitle(),car.getPrice());
            i++;



        }




        System.out.println("Общая стоимость заказа " + priceOrder);
    }

    /**
     * Метод подсчёта количества моделей
     */
    void chekModels() {
        for(int i =0;i < models.length; i++) {
            countModel = 0;
            for (int j = 0; j < cars.length; j++)
                if(models[i].equalsIgnoreCase(cars[j].getTitle())) {
                    countModel++;
                }
            System.out.println("Всего " + models[i] + " сделано  " + countModel);
        }
    }
}

