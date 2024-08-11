package factory;

public class Factory {
    private String titleFactory;
    private String[] modelsFactory;

    public Factory(String titleFactory,String[] modelsFactory) {
        this.titleFactory = titleFactory;
        this.modelsFactory = modelsFactory;
    }

    /**
     * В методе выполняет создание автомобиле
     * @param titleCar = название автомобиля, который нужно изготовить
     * @return готовый автомобиль
     */
    Car createCar(String titleCar) {
        for (String s : modelsFactory) {
            if(s.equalsIgnoreCase(titleCar)) {
                System.out.printf("Завод %s приступил к сборке автомобиля %s\n", titleFactory,titleCar);
                var car  =new Car(titleCar, (int) (Math.random() * 4000+ 1000));
                return  car;

            }


        }
        System.out.println("Нет технической возможности изготовить "+ titleCar);
        return null;

    }
}
