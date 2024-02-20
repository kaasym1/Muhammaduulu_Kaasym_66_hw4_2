import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> ListA = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя №" + (i + 1) + " Для списка А:");
            String names = scanner.nextLine();
            System.out.println("Имя ушпешно добавлено в Список А");
            System.out.println("   ");


            ListA.add(names);
        }
        System.out.println("Ваш список А: " + ListA);
        System.out.println("-------------------------");

        ArrayList<String> ListB = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя №" + (i + 1) + " Для списка Б:");
            String names = scanner.nextLine();
            System.out.println("Имя успешно добавлено в Список Б");
            System.out.println("   ");

            ListB.add(names);
        }
        System.out.println("Ваш список Б: " + ListB);
        System.out.println("----------------------------");

        ArrayList<String> ListC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ListC.add(ListA.get(i));
            ListC.add(ListB.get(4 - i));
        }
        System.out.println("Ваш список С: " + ListC);

        Collections.sort(ListC, Comparator.comparing(String::length));

        System.out.println("Ваш отсортированный Список С: " + ListC);

    }


}