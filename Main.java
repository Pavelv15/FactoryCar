package factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите название завода ");

        var factoryTitle = reader.readLine();
        System.out.println("Введите модели, которые может производить завод. Название нужно вводить через ,");
        String[] facooryModels =  reader.readLine().split(",");
        Factory factory = new Factory(factoryTitle,facooryModels);
        System.out.println("Введите название диллера и его стаж работы через;");
        String[] infoDiller = reader.readLine().split(";");
        String titleDiller = infoDiller[0];
        int ageDiller = Integer.parseInt(infoDiller[1]);
        var diller = new Diller(titleDiller,ageDiller);
        System.out.println("Какие модели требуется заказать ? Напишите их через ,");
        String[] models = reader.readLine().split(",");
        System.out.println("Количесвто автомобилей в заказе");
        int  count = Integer.parseInt(reader.readLine());
        Order order = new Order(1,count,factory,models,ageDiller);

        diller.createOrder(order);








    }
}
