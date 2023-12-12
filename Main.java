import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        Laptop laptop1 = new Laptop("Lenovo IdealPad 5", 8, 256, "Windows 11", "синий", 15.6);
        Laptop laptop2 = new Laptop("Honor MagicBook 16", 16, 512, "без ОС", "серый", 16.1);
        Laptop laptop3 = new Laptop("Apple MacBook Air 13", 8, 256, "MacOs", "золотистый", 13.3);
        Laptop laptop4 = new Laptop("Lenovo ThinkPad X1 Extreme Gen 5", 64, 1024, "DOS", "черный", 14.0);
        Laptop laptop5 = new Laptop("Xiomi RedmiBook 15", 8, 256, "Linux", "серый", 15.6);

        Set<Laptop> uniqueLaptops = new HashSet<>();
        uniqueLaptops.add(laptop1);
        uniqueLaptops.add(laptop2);
        uniqueLaptops.add(laptop3);
        uniqueLaptops.add(laptop4);
        uniqueLaptops.add(laptop5);

        System.out.printf("Всего уникальных ноутбуков: %d \n", uniqueLaptops.size());

        Map<Integer, String> mapCrit = new HashMap<>();
        mapCrit.put(1, "объем оперативной памяти");
        mapCrit.put(2, "объем накопителя");
        mapCrit.put(3, "ОС");
        mapCrit.put(4, "цвет");
        mapCrit.put(5, "диагональ");

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите желаемые характеристики: 1. объем оперативной памяти: ");
        int ramUser = scan.nextInt();
        System.out.println("объем накопителя: ");
        int storUser = scan.nextInt();
        System.out.println("диагональ: ");
        double digUser = scan.nextDouble();

        for(Laptop lap: uniqueLaptops) {
            if (lap.getRam() >= ramUser && lap.getStorageCap() >= storUser && lap.getDiagonal() >= digUser) {
                System.out.println(lap.toString());
            }
        }
        scan.close();
    }
}