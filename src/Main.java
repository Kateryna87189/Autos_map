import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Дан список Auto. У каждой машины есть номер, брэнд, цвет и т.д. Ваша задача написать следующие методы.
-метод, который сформирует Map, где ключом будет номер автомобиля, а значением сам автомобиль.
-метод, который сформирует Map, где ключом будет брэнд автомобиля,
а значением список автомобилей данного брэнда.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Auto> autoByNumber = new HashMap<>();
        Map<String, List<Auto>> autoByBrand = new HashMap<>();


        autoByNumber.put("ASD123", new Auto("ASD123","BMW","red"));
        autoByNumber.put("ASJ456", new Auto("ASJ456","BMW","metalic"));
        autoByNumber.put("OKI789", new Auto("OKI789","Toyota","black"));
        autoByNumber.put("OIU987", new Auto("OIU987","Reno","wait"));
        autoByNumber.put("BGF532", new Auto("BGF532","Reno","red"));

        //додаємо авто в карту по брендам
        for (Auto auto : autoByNumber.values()){
            autoByBrand.putIfAbsent(auto.getBrand(),new ArrayList<>());
            autoByBrand.get(auto.getBrand()).add(auto);
        }
        //вивід карти autoByNumber
        System.out.println("Map за номером авто: ");
        for (var entry : autoByNumber.entrySet()){
            System.out.println("Номер: " + entry.getKey());
            System.out.println("Авто: " + entry.getValue());
            System.out.println();
        }
        //вивід карти autoByBrand
        System.out.println("Мар за брендом авто: ");
        for (var entry : autoByBrand.entrySet()){
            System.out.println("Бренд: " + entry.getKey());
            System.out.println("Авто: " + entry.getValue());
            System.out.println();
        }

    }

}