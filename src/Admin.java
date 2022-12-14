import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
}
