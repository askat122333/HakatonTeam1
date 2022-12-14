import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Admin extends AbstractStaff{
    private static String login = "Admin1122";
    private static String adminPassword = "aDmiN12#@";
    private static LocalDateTime date;
    private static int maxCost;
    public Admin(String surName, String name, int age, Role role) {
        super(surName, name, age, role);
    }

    public static String getLogin() {
        return login;
    }

    public static String getAdminPassword() {
        return adminPassword;
    }

    public Admin() {
    }


    public static String addInstructions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добавьте инструкции:");
        String text = scanner.nextLine();
        return text;
    }
    public static  void setEndDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите год:");
        int year = scanner.nextInt();
        System.out.println("Выберите месяц:");
        int month = scanner.nextInt();
        System.out.println("Выберите день:");
        int day = scanner.nextInt();
        System.out.println("Выберите час и  минуты:");
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
      date = LocalDateTime.of(year,month,day,hour,minute);
    }
    public static void getEndDate() {
        System.out.println(date);
    }
    public static  void setMaxCost() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Установите максимальную стоимость подарка : ");
        int count = scanner.nextInt();
        maxCost = count;
    }
    public static void getMaxCost() {
        System.out.println(maxCost);
    }
    public static void randomize(){

        int SANTA_NUMBERS = 10;

        List<Integer> santaList = new ArrayList<>();
        for (int i = 0; i < SANTA_NUMBERS; ) {
            santaList.add(++i);
        }

        List<Integer> guests = new ArrayList<>(santaList);
        Collections.shuffle(guests);

        //в этом цикле проверяем
        for (int i = 0; i < santaList.size(); i++) {
            if (santaList.get(i) == guests.get(i)) {
                if (i + 1 < santaList.size()){
                    Integer receiver = guests.get(i + 1);
                    guests.set(i + 1, guests.get(i));
                    guests.set(i , receiver);
                }else {
                    Integer receiver = guests.get(1);
                    guests.set(1, guests.get(i));
                    guests.set(i , receiver);
                }
            }
        }
        for (int j = 0; j < santaList.size(); j++)
            System.out.println(santaList.get(j) + " gives a gift to -> " + guests.get(j));
    }
}
